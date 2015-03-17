package com.ebupt.demo.mina.nio1;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

import com.ebupt.ebas.dispatcher.sip.tmsg.TMsg;

public class MyCodecEncoder extends ProtocolEncoderAdapter{

	@Override
	public void encode(IoSession arg0, Object arg1, ProtocolEncoderOutput arg2)
			throws Exception {
		TMsg tMsg = (TMsg)arg1;
		IoBuffer buffer = IoBuffer.wrap(tMsg.doPackMsg());
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.limit());
//		System.out.println(buffer.position());
//		System.out.println(buffer.remaining());
		arg2.write(buffer);
	}

}
