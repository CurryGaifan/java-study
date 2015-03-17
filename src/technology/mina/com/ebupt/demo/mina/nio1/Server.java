package com.ebupt.demo.mina.nio1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.executor.ExecutorFilter;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class Server {
	public static void main(String[] args) throws IOException {

		// Create a class that handles sessions, incoming and outgoing data
		MyServerIoHandler handler = new MyServerIoHandler();

		// This socket acceptor will handle incoming connections
		NioSocketAcceptor acceptor = new NioSocketAcceptor();

		// add an IoFilter .  This class is responsible for converting the incoming and 
		// outgoing raw data to ImageRequest and ImageResponse objects
		DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();
		chain.addLast("logger", new LoggingFilter());
		ProtocolCodecFilter codec = new ProtocolCodecFilter(new MyCodecFactory());
        chain.addLast("codec",codec);// 指定编码过滤器
//        chain.addLast("protocol",codec);
        chain.addLast("threadPool", new ExecutorFilter(Executors.newCachedThreadPool()));
		// set this NioSocketAcceptor's handler to the ImageServerHandler
		acceptor.setHandler(handler);

		// Bind to the specified address.  This kicks off the listening for 
		// incoming connections
		acceptor.bind(new InetSocketAddress(8888));
		System.out.println("Step 1 server is listenig at port " + 8888);
	}
}
