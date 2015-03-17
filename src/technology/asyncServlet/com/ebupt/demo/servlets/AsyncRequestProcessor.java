package com.ebupt.demo.servlets;

import java.io.PrintWriter;
import java.util.Collection;
import java.util.Date;
import java.util.Random;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * User: Damodar Chetty
 * Date: Jul 23, 2010
 * Time: 9:45:22 PM
 * An introduction to Servlet 3.0 and Java 6 (TC JUG)
 * (c) Software Engineering Solutions, Inc.
 */
public class AsyncRequestProcessor implements Runnable {
	private static Logger logger = LoggerFactory.getLogger(AsyncRequestProcessor.class);
 
    private AsyncContext asyncContext;
    private boolean dispatch;
    public  AsyncRequestProcessor(AsyncContext asyncContext) {
        this.asyncContext = asyncContext;
        dispatch = true;
    }
    public AsyncRequestProcessor(AsyncContext asyncContext,
        boolean dispatch) {
        this(asyncContext);
        this.dispatch = dispatch;
    }
    public void run() {
        //do something asynchronously �C
        //  wait for a resource to become available
        //  or for a long running computation to finish
        String reqId = asyncContext.getRequest().getParameter("id");
        if (null == reqId || reqId.length() == 0) reqId = "<unk>";
        long id = Thread.currentThread().getId();
        String threadName = Thread.currentThread().getName();
        if (null == threadName || threadName.length() == 0)
            threadName = "";
        String threadId = id + ":" + threadName;
 
        String result = longRunningProcess(reqId, threadId);
 
        //Store the result of the computation in a "view helper"
        ServletRequest req = asyncContext.getRequest();
        if (null != req && req.isAsyncStarted())
                    req.setAttribute("result", result);
        else
                    return;
 
        //once done, dispatch back to the final destination
        if (dispatch) {
            asyncContext.dispatch("/results.jsp");
        } else {
            //alternatively handle it ourselves
            String html = "Result of the process for request id: " +
                    reqId + "<br/> Started at:" +
                    asyncContext.getRequest().getAttribute("receivedAt") +
                    ".<br/> Completed at:" + result +
                    "<br/> Called complete.";
//            Squawker squawker = new Squawker(html);
            asyncContext.getResponse().setContentType("text/html");
            try {
                PrintWriter out = asyncContext.getResponse().getWriter();
                out.println(html.toCharArray());
                out.flush();
            } catch(Exception e) {
                logger.warn(e.getMessage(), e);
            }
            
            logger.info("asyncContext.getResponse() instanceof HttpServletResponse:" + (asyncContext.getResponse() instanceof HttpServletResponse));
            HttpServletResponse httpServletResponse = ((HttpServletResponse)asyncContext.getResponse());
            
            
            httpServletResponse.setHeader("X-3GPP-Intended-Identity", "TEST");
            httpServletResponse.addHeader("X-3GPP-Intended-Identity1", "TEST1");
            logger.info(httpServletResponse.getHeader("X-3GPP-Intended-Identity"));
            
            httpServletResponse.setHeader("X-TEST-TEST", "TEST");
            httpServletResponse.addHeader("X-TEST-TEST1", "TEST1");
            Collection<String> collection = httpServletResponse.getHeaderNames();
            for(String str : collection){
            	logger.info(str);
            }
            asyncContext.complete();
        }
    }
 
    public String longRunningProcess(String reqId, String threadId) {
        Random randomGenerator = new Random();
        int randomInt = 5000 + randomGenerator.nextInt(10000);
        logger.info("AsyncRequestProcessor: Begin long run process (" +
                    randomInt + " ms) for request: " +
                    reqId + ". on thread: " + threadId +
                    "[" + new Date() + "]");
 
        try {
            Thread.sleep(randomInt);
        } catch (InterruptedException ie) {
        	logger.warn( ie.getMessage(), ie);
        }
 
        logger.info("AsyncRequestProcessor: Done processing request: " +
                    reqId + ". on thread: " +
                    threadId + "[" + new Date() + "]");
        return new Date().toString();
    }
}