package com.ebupt.demo.mina.nio;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.apache.mina.filter.codec.demux.MessageDecoder;
import org.apache.mina.filter.codec.demux.MessageDecoderResult;

/**
 * @author joe
 */
public class MyMessageDecoder implements MessageDecoder {
    //��Ϣ�Ŀ�ʼ
    private int flag = 0;
    //��Ϣ�ĳ���
    private int length = 0;
    //��Ϣ�Ľ�β
    private int flaglast = 0;
    //���ǵ�һ����Ϣ
    private boolean notfirstmessage = false;
    
    public MessageDecoderResult decodable(IoSession session, IoBuffer in) {
        int rem = in.remaining();
        int fornumber;
        byte aa;
        if (notfirstmessage) {
            flag++;
            fornumber = rem + flag;
        } else {
            flag = 0;
            fornumber = rem + flag;
        }
        try {
            for (int i = flag; i < fornumber; i++) {
                aa = in.get(i);
                if (']' == aa) {
                    flaglast = flag;
                    flag = i;
                    length = flag - flaglast;
                    notfirstmessage = true;
                    return MessageDecoderResult.OK;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        notfirstmessage = false;
        return MessageDecoderResult.NEED_DATA;
    }

    public MessageDecoderResult decode(IoSession session, IoBuffer in,
            ProtocolDecoderOutput out) throws Exception {
        try {
            if (length == 0 || length == 1) {
                in.get();
                out.write("");
                return MessageDecoderResult.OK;
            }
            length++;
            byte[] result = new byte[length];
            for (int i = 0; i < length; i++) {
                result[i] = in.get();
            }
            if (0 == in.remaining()) {
                notfirstmessage = false;
            }
            String cont = new String(result, "us-ascii");
            out.write(cont.trim());
            return MessageDecoderResult.OK;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return MessageDecoderResult.OK;
    }

    public void finishDecode(IoSession session, ProtocolDecoderOutput out)
            throws Exception {
    }

}

