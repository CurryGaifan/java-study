package com.ebupt.demo.mina.nio;

import java.net.InetSocketAddress;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.demux.DemuxingProtocolCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

/**
 * @author joe
 */
public class MyClient {
    private NioSocketConnector  connector;
    /**
     * Constructor
     */
    public MyClient() {
        connector = new NioSocketConnector();
        /**
         * ������Ϣ������IoHandler,������պͷ�����Ϣ�Ĵ���
         */
        connector.setHandler(new ClientIoHandler());
        //���ù�����
        DefaultIoFilterChainBuilder chain = connector.getFilterChain();
        //������־������
        chain.addLast("logger", new LoggingFilter());
        //�����ַ�����������Լ����ñ������ͽ�����
        //chain.addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
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
//        acceptor.getFilterChain().addLast(
//                "codec",
//                new ProtocolCodecFilter(new TextLineCodecFactory(Charset
//                        .forName("UTF-8"))));// ָ�����������
        DemuxingProtocolCodecFactory pcf = new DemuxingProtocolCodecFactory();
        //�Զ��������
        pcf.addMessageEncoder(String.class, new MyMessageEncoder());
        //�Զ��������
        pcf.addMessageDecoder(new MyMessageDecoder());
        ProtocolCodecFilter codec = new ProtocolCodecFilter(pcf);
        chain.addLast("codec",codec);// ָ�����������
        //����Ĭ�����ӵĵ�ַ�Ͷ˿�
        connector.setDefaultRemoteAddress(new InetSocketAddress("localhost", 8888));
        /**
         * ��������
         * ���û�����ӣ����30 * 1000����ͻ��˻᳢���������ӷ�����
         * ������ӣ�������Ĵ��벻��ִ��
         */
        ConnectFuture connFuture = connector.connect();
        connFuture.awaitUninterruptibly();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if (null != connector && !connector.isActive()) {
                    try {
                        //��������Ĭ�ϵĵ�ַ�Ͷ˿�
                        ConnectFuture connFuture = connector.connect();
                        connFuture.awaitUninterruptibly();
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                }
            }
        }, new Date(), 30 * 1000);
        
        
        
       Map<Long, IoSession>  map = connector.getManagedSessions();
       System.out.println(map.size());
       for(Map.Entry<Long, IoSession> entry : map.entrySet()){
    	   System.out.println(entry.getKey());
    	   entry.getValue().write("[my test!]");
       }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        new MyClient();
    }

}

