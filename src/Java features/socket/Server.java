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

				// ����һ��ServerSocket�ڶ˿�4700�����ͻ�����

			} catch (Exception e) {

				System.out.println("can not listen to:" + e);

				// ������ӡ������Ϣ

			}

			Socket socket = null;

			try {

				socket = server.accept();

				// ʹ��accept()�����ȴ��ͻ������пͻ�

				// �����������һ��Socket���󣬲�����ִ��

			} catch (Exception e) {

				System.out.println("Error." + e);

				// ������ӡ������Ϣ

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


			outputStream.close(); // �ر�Socket�����
//			outputStream.close();

			inputStream.close(); // �ر�Socket������

			socket.close(); // �ر�Socket

			server.close(); // �ر�ServerSocket

		} catch (Exception e) {

			System.out.println("Error:" + e);

			// ������ӡ������Ϣ

		}

	}

}