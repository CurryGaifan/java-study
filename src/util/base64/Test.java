package base64;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

/**
 * 0000 65 33 f6 f4 a1 8d 14 f2 ef d6 b0 9b 74 14 74 38 0010 61 c0 93 d2 7d 9b
 * 72 4c dc 6d e5 40 16 3d a4 27
 * 
 * @ClassName: Test
 * @Description: TODO
 * @author gaifan
 * @date May 24, 2014 10:10:40 AM
 * 
 */
public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String nonce = new String(Base64.encodeBase64(
				("9596a05f49cd38f3209ebac2a6dc0f23"
						+ "05f4c2a6dc0f239596a05f49cd38f05f" + "")
						.getBytes("UTF-8"), false)).trim();
		System.out.println(nonce);

		byte[] autn = { (byte) 0xb6, (byte) 0x5c, (byte) 0x00, (byte) 0x00 };
		byte[] rand = { (byte) 0xb6, (byte) 0x5c};
		byte[] xres = { (byte) 0xb6, (byte) 0x5c, (byte) 0x00, (byte) 0x00, (byte) 0x01 };
		
		String base64autn = new String(Base64.encodeBase64(autn, false)).trim();
		String base64rand = new String(Base64.encodeBase64(rand, false)).trim();
		String base64xres = new String(Base64.encodeBase64(xres, false)).trim();
		System.out.println(base64autn);
		System.out.println(base64rand);
		System.out.println(base64xres);
		
		
		System.out.println(MD5Byte(autn));
		System.out.println(MD5Byte(rand));
		System.out.println(MD5Byte(xres));
		
		for (byte b : Base64
				.decodeBase64("A859r+cttng=")) {
			System.out.print(Integer.toHexString(b) + " ");
		}

	}
	
	public static String MD5Byte(byte[] arg0){ 
        MessageDigest md = null; 
        try { 
            md=MessageDigest.getInstance("MD5"); 
        } catch (NoSuchAlgorithmException e) { 
            e.printStackTrace(); 
        } 

        md.update(arg0); //MD5加密算法只是对字符数组而不是字符串进行加密计算，得到要加密的对象 
        byte[] bs=md.digest();   //进行加密运算并返回字符数组 
/*        for(byte b: bs){ 
            System.out.print(b+"|"); //打印出来加密后的字符数组 
        } */
      
        StringBuffer sb=new StringBuffer(); 
        for(int i=0;i<bs.length;i++){    //字节数组转换成十六进制字符串，形成最终的密文 
            int v=bs[i]&0xff; 
            if(v<16){ 
                sb.append(0); 
            } 
            sb.append(Integer.toHexString(v)); 
        } 
     //   logger.info("加密之后的字符串："+ sb); 
        
        return sb.toString();
    }
}
