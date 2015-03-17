package com.ebupt.demo.servlets3;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.LoggerFactory;


public class FutureTaskAsyncNotifyHandler extends IoHandlerAdapter {


 
	public void messageReceived(IoSession session, Object message) throws Exception {
		
			
			key = message.getUUID();
			bean = message.getBean();
			
			Task t = STATICS.FutureTaskMap.remove(key);
			
			t.set(bean);
	}

 
}