package com.ebupt.demo.servlets2;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 异步上下文的转向分发
 * 
 * @author yongboy
 * @date 2011-1-14
 * @version 1.0
 */
@WebServlet(urlPatterns = { "/asyncDispatch2Async" }, asyncSupported = true)
public class AsyncContextDispatch2AsyncServlet extends HttpServlet {
	private static final long serialVersionUID = 46172233331022236L;
	private static Logger logger = LoggerFactory
			.getLogger(AsyncContextDispatch2AsyncServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control", "private");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Connection", "Keep-Alive");
		response.setHeader("Proxy-Connection", "Keep-Alive");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("Start ...");
		out.flush();

		if (!request.isAsyncSupported()) {
			logger.info("the servlet is not supported Async");
			return;
		}

		request.startAsync(request, response);

		if (request.isAsyncStarted()) {
			AsyncContext asyncContext = request.getAsyncContext();
			asyncContext.setTimeout(1L * 60L * 1000L);// 60sec

			new CounterThread(asyncContext).start();
		} else {
			logger.error("the ruquest is not AsyncStarted !");
		}
	}

	private static class CounterThread extends Thread {
		private AsyncContext asyncContext;

		public CounterThread(AsyncContext asyncContext) {
			this.asyncContext = asyncContext;
		}

		@Override
		public void run() {
			int interval = 1000 * 20; // 20sec

			try {
				logger.info("now sleep 20s, just as do some big task ...");
				Thread.sleep(interval);
				logger.info("now dispatch to another Async Servlet");

				ServletRequest request = asyncContext.getRequest();

				String disUrl = request.getParameter("disUrl");

				if (disUrl == null || disUrl.equals("") ) {
					disUrl = "/demoAsyncLink";
				}

				if (disUrl.endsWith(".jsp")) {
					SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					
					
					request.setAttribute("dateStr", dateformat.format(
							System.currentTimeMillis()));
				}

				logger.info("disUrl is ： " + disUrl);

				// 将当前异步上下文所持有的request, response分发给Servlet容器
				if (disUrl.equals("self")) {
					// 将分发到自身，即当前异步请求地址
					asyncContext.dispatch();
				} else {
					// 将分发到指定的路径
					asyncContext.dispatch(disUrl);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}