package com.ebupt.demo.mina.nio1;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import com.ebupt.ebas.dispatcher.sip.tmsg.TMsg;

public class MyServerIoHandler implements IoHandler {

	private AtomicInteger  i = new AtomicInteger(0);

	@Override
	public void exceptionCaught(IoSession arg0, Throwable arg1)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void messageReceived(IoSession arg0, Object arg1) throws Exception {
		TMsg tMsg = (TMsg) arg1;
		System.out.println("receive msg : " + new String(tMsg.content));

//		for (int i = 0; i < 10; i++) {
			TMsg tempTMsg = new TMsg();
			String str = "<cp:rule id=\"barring-of-outgoing-international-calls\">\r\n"
					+ "<cp:conditions>\r\n"
					+ "<international/>\r\n"
					+ "<rule-deactivated/>\r\n"
					+ "</cp:conditions>\r\n"
					+ "<cp:actions>\r\n"
					+ "<allow>false"+i.getAndIncrement() +"</allow>\r\n"
					+ "</cp:actions>\r\n"
					+ "</cp:rule>\r\n";
			tempTMsg.content = str.getBytes();
			tempTMsg.packetLength = tempTMsg.content.length + 23;
			arg0.write(tempTMsg);
//		}
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
