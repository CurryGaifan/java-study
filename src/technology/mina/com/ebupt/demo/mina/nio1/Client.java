package com.ebupt.demo.mina.nio1;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.executor.ExecutorFilter;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import com.ebupt.ebas.dispatcher.sip.tmsg.TMsg;

public class Client {
	private NioSocketConnector  connector;
	private IoSession session;
	public static final int CONNECT_TIMEOUT = 3000;
	static Client client;
	public Client(){
		connector = new NioSocketConnector();
        /**
         * 设置信息交换的IoHandler,负责接收和发送信息的处理
         */
		connector.setHandler(new MyClientIoHandler());
        //配置过滤器
        DefaultIoFilterChainBuilder chain = connector.getFilterChain();
        //增加日志过滤器
        LoggingFilter logFilter = new LoggingFilter();
        
        chain.addLast("logger",logFilter );
        
        ProtocolCodecFilter codec = new ProtocolCodecFilter(new MyCodecFactory());
        chain.addLast("codec",codec);// 指定编码过滤器
        chain.addLast("threadPool", new ExecutorFilter(Executors.newCachedThreadPool()));
        connector.setDefaultRemoteAddress(new InetSocketAddress("localhost", 8888));
        ConnectFuture connectFuture = connector.connect();
        connectFuture.awaitUninterruptibly(CONNECT_TIMEOUT);
        session = connectFuture.getSession();
	}
	
    public void sendRequest(TMsg tMsg) {
            session.write(tMsg);
    }
    
    public static void main(String[] args) {
		
    	client= new Client();
    	
    	
    	for(int i = 0; i <1000; i ++){
    		Thread t = new Thread(){
        		public void run(){
        			TMsg tMsg = new TMsg();
                	String str = "hello server!";
                	tMsg.content = str.getBytes();
                	tMsg.packetLength = tMsg.content.length + 23;
            		client.sendRequest(tMsg);
        		}
        	};
        	t.start();
    	}
    	
    	
	}
}
