package com.ebupt.demo.servlets;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

 
public class MyAsyncListener implements AsyncListener {
	private static Logger logger = LoggerFactory.getLogger(MyAsyncListener.class);
 
    // Public constructor is required by servlet spec
    public MyAsyncListener() {    }
    public void onComplete(AsyncEvent ae) {
        logger.info("AsyncListener: onComplete for request: " +
            ae.getAsyncContext().getRequest().getParameter("id"));
    }
    public void onTimeout(AsyncEvent ae) {
        logger.info("AsyncListener: onTimeout for request: " +
            ae.getAsyncContext().getRequest().getParameter("id"));
        ((HttpServletResponse)ae.getAsyncContext().getResponse()).setStatus(403);
    }
    public void onError(AsyncEvent ae) {
        logger.info("AsyncListener: onError for request: " +
            ae.getAsyncContext().getRequest().getParameter("id"));
    }
    public void onStartAsync(AsyncEvent ae) {
        logger.info("AsyncListener: onStartAsync");
    }
}