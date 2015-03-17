package com.ebupt.ebas.ra.util;

import java.nio.ByteBuffer;

public class CodeUtil {

    public static byte[] encode2Bytes2(int n) {
        ByteBuffer buf = ByteBuffer.allocate(4);
        buf.clear();
        buf = buf.putInt(n);
        byte[] b = buf.array();
        byte[] tempbuf = {b[2], b[3]};
        return tempbuf;
    }

   
    public static byte[] encode2Bytes4(int n) {
        ByteBuffer buf = ByteBuffer.allocate(4);
        buf.clear();
        buf = buf.putInt(n);
        return buf.array();
    }
    
    public static byte[] encode2Bytes3(int n) {
        ByteBuffer buf = ByteBuffer.allocate(3);
        buf.clear();
        buf = buf.putInt(n);
        return buf.array();
    }
    
    public static byte[] encode2Bytes8(double n) {
        ByteBuffer buf = ByteBuffer.allocate(8);
        buf.clear();
        buf = buf.putDouble(n);
        return buf.array();
    }
    
    public static Long decodeByteArray2Long(byte[] b) {
        ByteBuffer niobuf = ByteBuffer.allocate(b.length);
        niobuf.clear();
        niobuf = niobuf.put(b);
        niobuf.flip();
        return niobuf.getLong();
    }
    
    public static byte[] encodeLong2Bytes(Long n) {
        ByteBuffer buf = ByteBuffer.allocate(8);
        buf.clear();
        buf = buf.putLong(n);
        return buf.array();
    }
    
    
    public static Double decode4ByteArray(byte[] b) {
        ByteBuffer niobuf = ByteBuffer.allocate(b.length);
        niobuf.clear();
        niobuf = niobuf.put(b);
        niobuf.flip();
        return niobuf.getDouble();
    }

    public static int decode2Int(byte b1, byte b2) {
        byte[] b = {0, 0, b1, b2};
        ByteBuffer niobuf = ByteBuffer.allocate(4);
        niobuf.clear();
        niobuf = niobuf.put(b);
        niobuf.flip();
        return niobuf.getInt();
    }
    
    //返回无符号整数
    public static int decode2Int(byte b1) {
		byte[] b = { 0, 0, 0, b1 };
		ByteBuffer niobuf = ByteBuffer.allocate(4);
		niobuf.clear();
		niobuf = niobuf.put(b);
		niobuf.flip();
		return niobuf.getInt();
	}
    
//  将byte[4]转化为int
	public static int decode2Int(byte[] b) {
		ByteBuffer niobuf =  ByteBuffer.allocate(4);
		niobuf.clear();
		niobuf = niobuf.put(b);
		niobuf.flip();
		return niobuf.getInt();
	}

    public static int decode4Int(byte b1, byte b2, byte b3, byte b4) {
        byte[] b = {b1, b2, b3, b4};
        ByteBuffer niobuf = ByteBuffer.allocate(4);
        niobuf.clear();
        niobuf = niobuf.put(b);
        niobuf.flip();
        return niobuf.getInt();
    }
    
    public static byte[] encode2Bytes2(short n) {
        ByteBuffer buf = ByteBuffer.allocate(2);
        buf.clear();
        buf.putShort(n);
        return buf.array();
    }
    
    public static short decodeByteArray2short(byte[] b) {
        ByteBuffer niobuf = ByteBuffer.allocate(b.length);
        niobuf.clear();
        niobuf = niobuf.put(b);
        niobuf.flip();
        return niobuf.getShort();
    }
    
    public static char byteToChar(byte b) {
		return (char)b;
	}
    
    /**
     * add for test only
     */
    public static byte charToByte(char ch) {
		int temp = (int) ch;

		byte[] b = new byte[2];
		for (int i = b.length - 1; i > -1; i--) {
			b[i] = new Integer(temp & 0xff).byteValue();// 将最高位保存在最低位
			temp = temp >> 8;// 向右移8位
		}
		return b[1];
	}
    
}
