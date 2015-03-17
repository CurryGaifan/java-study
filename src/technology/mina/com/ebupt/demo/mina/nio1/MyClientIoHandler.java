package com.ebupt.demo.mina.nio1;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ebupt.ebas.dispatcher.sip.tmsg.TMsg;

public class MyClientIoHandler implements IoHandler {
	private static Logger logger = LoggerFactory.getLogger(MyClientIoHandler.class);
	@Override
	public void exceptionCaught(IoSession arg0, Throwable arg1)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void messageReceived(IoSession arg0, Object arg1) throws Exception {
		TMsg tMsg = (TMsg)arg1;
		Thread.sleep(2000);
		logger.info("receive server msg : " + new String(tMsg.content));
		Thread.sleep(10000);
		System.out.println(Thread.currentThread());
		System.out.println(this);
	}

	@Override
	public void messageSent(IoSession arg0, Object arg1) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionClosed(IoSession arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionCreated(IoSession arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionIdle(IoSession arg0, IdleStatus arg1) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionOpened(IoSession arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
