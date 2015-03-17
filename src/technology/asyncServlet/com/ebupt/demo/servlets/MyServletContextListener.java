package com.ebupt.demo.servlets;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
@WebListener
public class MyServletContextListener implements ServletContextListener {
	private static Logger logger = LoggerFactory.getLogger(MyServletContextListener.class);
 
    // Public constructor is required by servlet spec
    public MyServletContextListener() {
    }
 
    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("Context Listener > Initialized");
 
        //2. Creation of a global async Executor
        Executor executor =
                    new ThreadPoolExecutor(10, 10, 50000L,
                        TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>(100));
        sce.getServletContext().setAttribute("executor", executor);
    }
 
    public void contextDestroyed(ServletContextEvent sce) {
    }
}