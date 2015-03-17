package nio.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyServer {
	public static void main(String[] args) throws IOException {
		ServerSocketChannel ssc = ServerSocketChannel.open();
		ssc.configureBlocking(false);
		ServerSocket ss = ssc.socket();
		ss.bind(new InetSocketAddress(8888));
		Selector sel = Selector.open();
		ssc.register(sel, SelectionKey.OP_ACCEPT);
		
		while (true) {
			while (sel.select(100) > 0) {
				 Iterator<SelectionKey> it = sel.selectedKeys().iterator();
				 while(it.hasNext()){
					 SelectionKey key =  it.next();
					 it.remove();
					 if (key.isAcceptable()) {
							ServerSocketChannel server = (ServerSocketChannel) key.channel();
							SocketChannel clientSocketChannel = server.accept();
							System.out.println("client " + clientSocketChannel.socket().getRemoteSocketAddress());
							clientSocketChannel.configureBlocking(false);
							clientSocketChannel.register(sel, SelectionKey.OP_READ);
						} else if(key.isReadable()) {
							System.out.println("get a read  event");
							new Thread(new Handle(key)).start();
						}
				 }
				 
			}

		}
	}

}


class Handle implements Runnable {
	SelectionKey key;
	ByteBuffer dst = ByteBuffer.allocate(10000);
	public Handle(SelectionKey key) {
		super();
		this.key = key;
	}

	@Override
	public void run()  {
		SocketChannel clientSocketChannel = (SocketChannel)key.channel();
		
		try {
			System.out.println("22222222");
			clientSocketChannel.read(dst );
			System.out.println(new String(dst.array()));
			dst.flip();
			clientSocketChannel.write(dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void setKey(SelectionKey key) {
		this.key = key;
	}

}