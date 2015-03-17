package socket;

import java.io.*;

import java.net.*;

public class Client {

	public static void main(String args[]) {

		try {

			Socket socket = new Socket("127.0.0.1", 4700);

			OutputStream outputStream = socket.getOutputStream();
			
			InputStream inputStream = socket.getInputStream();

			String str = "Client say Hello.";
			
			outputStream.write(str.getBytes());
			outputStream.flush();
			
			
			int count = 0;
			int readCount = 0;
			byte[] bytes = new byte[1000];
			byte[] tmpBytes = new byte[10];

			readCount=inputStream.read(tmpBytes,0,10);
			System.out.println(readCount);
			System.arraycopy(tmpBytes, 0, bytes, count, readCount);
			count += readCount;
			while(inputStream.available()!=0 ){
//				System.out.println("start");
				
				readCount=inputStream.read(tmpBytes,0,10);
				System.out.println(readCount);
				System.arraycopy(tmpBytes, 0, bytes, count, readCount);
				count += readCount;
//				System.out.println("end");
				
			}
			System.out.println(new String(bytes));
			


			outputStream.close(); // 关闭Socket输出流

			inputStream.close(); // 关闭Socket输入流

			socket.close(); //关闭Socket

		} catch (Exception e) {

			System.out.println("Error" + e); //出错，则打印出错信息

		}

	}

}