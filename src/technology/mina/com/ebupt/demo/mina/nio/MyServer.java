package com.ebupt.demo.mina.nio;

import java.net.InetSocketAddress;

import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.demux.DemuxingProtocolCodecFactory;
import org.apache.mina.filter.executor.ExecutorFilter;
import org.apache.mina.filter.executor.OrderedThreadPoolExecutor;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

/**
 * @author joe
 */
public class MyServer {
    private NioSocketAcceptor   acceptor;
    /**
     * Constructor
     */
    public MyServer() {
        try {
            acceptor = new NioSocketAcceptor();
            acceptor.getFilterChain().addLast("threadPool",
                    new ExecutorFilter(new OrderedThreadPoolExecutor()));// �����̳߳أ���֧�ֶ��߳�
            acceptor.getFilterChain().addLast("logger", new LoggingFilter());
            /**
             * Ĭ�ϱ�����,������,����\nĬ����Ϣ����
             * ��Ȼ���ԼӲ���ָ�������ַ����������ַ��ᱻ�ص�
             * ����:new TextLineCodecFactory(Charset.forName("UTF-8"),"]","]");
             * �����Ϊ"]"Ϊһ����Ϣ����������"]"���ȡ
             * ������������㷢�͵���Ϣ��aaaa]aaaa]
             * ���յ�������Ϣ��
             * 1��aaaa
             * 2��aaaa
             * �����"]"��ȥ����
             */
//            acceptor.getFilterChain().addLast(
//                    "codec",
//                    new ProtocolCodecFilter(new TextLineCodecFactory(Charset
//                            .forName("UTF-8"))));// ָ�����������
            DemuxingProtocolCodecFactory pcf = new DemuxingProtocolCodecFactory();
            //�Զ��������
            pcf.addMessageEncoder(String.class, new MyMessageEncoder());
            //�Զ��������
            pcf.addMessageDecoder(new MyMessageDecoder());
            ProtocolCodecFilter codec = new ProtocolCodecFilter(pcf);
            acceptor.getFilterChain().addLast("codec",codec);// ָ�����������
            
            acceptor.setReuseAddress(true);
            acceptor.setHandler(new ServerIoHandler());// ָ��ҵ���߼�������
            acceptor.setDefaultLocalAddress(new InetSocketAddress(8888));// ���ö˿ں�
            acceptor.bind();// ��������
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        new MyServer();
    }
}

