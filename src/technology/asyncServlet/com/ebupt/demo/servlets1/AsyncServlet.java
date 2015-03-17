package com.ebupt.demo.servlets1;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ebupt.demo.servlets.AsyncRequestProcessor;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
 
/**
 * @author Keesun Baik
 * To test this class, turn off all filters in web.xml.
 */
@WebServlet(value = "/stocks", asyncSupported = true)
public class AsyncServlet extends HttpServlet {
	private static Logger logger = LoggerFactory.getLogger(AsyncServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        final AsyncContext asyncContext = req.startAsync(req, res);
//        asyncContext.getResponse().getWriter().println("Start");
//        asyncContext.start(new StockPriceRunner(asyncContext));
        new Thread(new StockPriceRunner(asyncContext)).start();
        
    }
 
    private class StockPriceRunner implements Runnable {
        AsyncContext asyncContext;
        
        public StockPriceRunner(AsyncContext asyncContext) {
            this.asyncContext = asyncContext;
        }
 
        @Override
        public void run() {
            String ticker = "GOOG";
            Double price = YahooFinance.getPrice(ticker);
            try {
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
            	
            	
                asyncContext.getResponse().getWriter().printf("ticker: %s, price: %.2f", ticker, price);
                asyncContext.complete();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } 
        }
    }
}
