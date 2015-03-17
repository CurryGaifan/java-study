package com.ebupt.demo.mina.nio1;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ebupt.ebas.dispatcher.sip.tmsg.TMsg;
import com.ebupt.ebas.ra.util.CodeUtil;


public class MyCodecDecoder extends CumulativeProtocolDecoder {
	private static Logger logger = LoggerFactory.getLogger(MyCodecDecoder.class);
	@Override
	protected boolean doDecode(IoSession arg0, IoBuffer in,
			ProtocolDecoderOutput out) throws Exception {
		System.out.println(Thread.currentThread());
		System.out.println(this);
		
		logger.info(in.getHexDump());
		boolean atLeastOne = false;
		while(in.remaining()>3){
			in.mark();
			while(in.remaining()  > 3){
				
				byte a0 = in.get(); 
				byte a1 = in.get();
				byte a2 = in.get();
				byte a3 = in.get();
				
				if(((a0 & a1 & a2) == (byte)0xff) && (a3 == (byte)0x00)) {
					logger.info("find sync header");
					in.reset();
					break;
				}else{
					if(in.remaining() == 0 ) {
						in.reset();
						in.get();
						logger.info("can't find sync header, return false");
						
						if(atLeastOne){
							return true;
						}else {
							logger.info("can't find whole TMsg");
							return false;
						}
					}
				}
				in.reset();
				in.get();
				logger.info("find rubbish data");
			}

			
			if(in.remaining()>27){
				in.mark();
				in.position(in.position() + 6);
				byte l1 = in.get();
				byte l2 = in.get();
				int contentLength = CodeUtil.decode2Int(l1, l2);
				in.position(in.position() - 4);
				if(in.remaining() >= contentLength){
					byte[] tmsgs = new byte[contentLength];
					in.get(tmsgs);
					TMsg tmsg = new TMsg();
					tmsg.getMsgContent(tmsgs);
					logger.info("find one tmsg...");
					out.write(tmsg);
					atLeastOne = true;
				}else {
					in.reset();
					break;
				}
			}else {
				break;
			}
		}
//		if(in.remaining()<4){
//			System.out.println("remaining < 4, return false");
//			return false;
//		}

		if(atLeastOne){
			return true;
		}else {
			logger.info("can't find whole TMsg");
			return false;
		}

		
	}


}
