/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nio.socket;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author hadeslee
 */
public class Send {

	public static void main(String[] args) throws Exception {
		SocketChannel sc = SocketChannel.open();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		Selector se = Selector.open();
		buffer.put("我是中国人,我爱我的祖国,hadeslee".getBytes());
		buffer.flip();

		sc.configureBlocking(false);
		sc.connect(new InetSocketAddress("127.0.0.1", 8888));
		sc.register(se, SelectionKey.OP_CONNECT );
		
//		while (!sc.finishConnect())
//			;
//		sc.write(buffer);
//		System.out.println("进入循环");
//		Thread.sleep(10000);
//		int sum = se.select();
		while (true) {
			int n = se.select(3000);
			if (n == 0) {//没有指定的I/O事件发生
		    	continue;
		    }

			Iterator<SelectionKey> it = se.selectedKeys().iterator();
		    while(it.hasNext()) {
		        SelectionKey key = (SelectionKey) it.next();
		        it.remove();
//				int ops = key.readyOps();
				if (key.isConnectable()) {
					System.out.println("OP_CONNECT");
					sc = (SocketChannel)key.channel();
					if(sc.isConnectionPending()){
						sc.finishConnect();
					}
					sc.write(buffer);
					System.out.println("连接成功");
					sc.register(se, SelectionKey.OP_READ
							| SelectionKey.OP_WRITE);
				}
				if (key.isReadable()) {
					System.out.println("OP_READ");
					System.out.println(" 收到东西");
					sc.read(buffer);
					buffer.flip();
					System.out.println("收到的是:"
							+ new String(buffer.array(), 0, buffer.limit()));
//					sc.write(buffer);
					
				}
				
				if(key.isWritable()) {
//					System.out.println("OP_WRITE");
				}
			}
			se.selectedKeys().clear();
		}
	}

	//    private static ByteBuffer[] get(String heads) {
	//        ByteBuffer[] bbs = new ByteBuffer[heads.length()];
	//        for (int i = 0; i < bbs.length; i++) {
	//            String s = heads[i];
	//            bbs[i] = ByteBuffer.allocateDirect(1024);
	//            bbs[i].put(s.getBytes());
	//            bbs[i].flip();
	//        }
	//        return bbs;
	//    }
}