package socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String args[]) {

		try {

			ServerSocket server = null;

			try {

				server = new ServerSocket(4700);

				// 创建一个ServerSocket在端口4700监听客户请求

			} catch (Exception e) {

				System.out.println("can not listen to:" + e);

				// 出错，打印出错信息

			}

			Socket socket = null;

			try {

				socket = server.accept();

				// 使用accept()阻塞等待客户请求，有客户

				// 请求到来则产生一个Socket对象，并继续执行

			} catch (Exception e) {

				System.out.println("Error." + e);

				// 出错，打印出错信息

			}

			InputStream inputStream = socket.getInputStream();
			
			OutputStream outputStream = socket.getOutputStream();

			int count = 0;
			int readCount = 0;
			byte[] bytes = new byte[1000];
			byte[] tmpBytes = new byte[10];

			readCount=inputStream.read(tmpBytes,0,10);
			System.out.println(readCount);
			System.arraycopy(tmpBytes, 0, bytes, count, readCount);
			count += readCount;
			while(inputStream.available()!=0 ){
				
				readCount=inputStream.read(tmpBytes,0,10);
				System.out.println(readCount);
				System.arraycopy(tmpBytes, 0, bytes, count, readCount);
				count += readCount;
				
			}
			System.out.println(new String(bytes));
			
			String str = "Server say hello 1";
			outputStream.write(str.getBytes());
			str = "Server say hello 2";
			outputStream.write(str.getBytes());
			outputStream.flush();


			outputStream.close(); // 关闭Socket输出流
//			outputStream.close();

			inputStream.close(); // 关闭Socket输入流

			socket.close(); // 关闭Socket

			server.close(); // 关闭ServerSocket

		} catch (Exception e) {

			System.out.println("Error:" + e);

			// 出错，打印出错信息

		}

	}

}