package md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	// 全局数组
    private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    public MD5() {
    }

    // 返回形式为数字跟字符�?
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        // System.out.println("iRet="+iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    // 返回形式只为数字
    private static String byteToNum(byte bByte) {
        int iRet = bByte;
        System.out.println("iRet1=" + iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        return String.valueOf(iRet);
    }

    // 转换字节数组�?16进制字串
    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    public static String GetMD5Code(String strObj) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            // md.digest() 该函数返回�?�为存放哈希值结果的byte数组
            resultString = byteToString(md.digest(strObj.getBytes()));
            System.out.println(byteToString(md.digest(new byte[0])));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }

    
    public static String getHA1(String username, String realm, String passwd){
    	String str = GetMD5Code(username+":"+realm+":"+passwd);
    	System.out.println("ha1: " + str);
    	return str;
    	
    }
    
    public static String getHA2(String method, String uri, String entityBodyMd5){
    	String str = GetMD5Code(method+":"+uri+":"+entityBodyMd5);
    	System.out.println("ha2: " + str);
    	return str;
    	
    }
    
    public static String getResponse(String ha1, String nonce, String nc, String cnonce, String qop, String ha2){
    	String str = GetMD5Code(ha1 + ":" + nonce + ":" + nc + ":" + cnonce + ":" + qop + ":" + ha2);
    	System.out.println("response: " + str);
    	return str;
    	
    }
    

    
    
}
