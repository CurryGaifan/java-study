package bytebuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;


public class Test {
	
	
	public static void main(String[] args) {
		String str = "54321";
		int a = 3478;
		char c = 'k';
		char z = 'j';
		byte[] bytes = new byte[13];
		System.arraycopy(ByteUtil.getBytes(str), 0, bytes, 0, 5);
		System.arraycopy(ByteUtil.getBytes(a), 0, bytes, 5, 4);
		System.arraycopy(ByteUtil.getBytes(c), 0, bytes, 9, 2);
		System.arraycopy(ByteUtil.getBytes(z), 0, bytes, 11, 2);
		
		ByteBuffer bf = ByteBuffer.wrap(bytes);
		byte[] dst = new byte[5];
		bf.get(dst);
		System.out.println(bf.array().length);
		System.out.println(bf.arrayOffset());
		
		int b = bf.getInt();
		bf.limit(11);
		CharBuffer cb = bf.asCharBuffer();
		System.out.println(cb.position() + " " +cb.limit() + " "+ cb.capacity() + " " + cb.length());
		char d =bf.getChar();
		
		System.out.println(new String(dst));
		System.out.println(b);
		
		System.out.println(d);
		System.out.println(bf);
		System.out.println(cb);
		
		bf  = ByteBuffer.allocate(20);
		bf.putInt(3);
		bf.put("sfewr".getBytes());
		System.out.println(bf.hasArray());
		System.out.println(bf.array().length);
		
	}
	

}
