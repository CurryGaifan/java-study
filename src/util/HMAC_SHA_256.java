import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

public class HMAC_SHA_256 {

    public static void main(String args[]) throws NoSuchAlgorithmException,
            KeyManagementException,
             InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
    	
    	String key = "f7b00e671bd8a90d5e04d28aa7fe842b2bf75d55314b19c0838ebc6beb7c9a96";
    	String rand = "82b0c87d2370e9558460de37d1c978ad";
    	String impi="34363030383031303030333031383840696D732E6D6E633030382E6D63633436302E336770706E6574776F726B2E6F7267".toLowerCase();
    	String naf_id = "6E61662E656230312E687A2E7A6A2E6E6F64652E696D732E6D6E633030302E6D63633436302E336770706E6574776F726B2E6F72670100000002".toLowerCase();
    	String gba_mode="gba-me";
//    	byte[] gba_mode_byte = new Hex().encode(gba_mode.getBytes());
    	System.out.println(gba_mode.getBytes().length);
    	System.out.println(rand.length()/2);
    	System.out.println(impi.length()/2);
    	System.out.println(naf_id.length()/2);
    	String s= "01" 
    		+ Hex.encodeHexString(gba_mode.getBytes()) + "0006" 
    		+ rand + "0010" 
    		+ impi + "0031"
    		+ naf_id + "003a";
    	
//        String macKey = hexStringToBytes(key);
//        String macData ="the data string";
//        System.out.println("MACDATA:"+macData);

        Mac mac = Mac.getInstance("HmacSHA256");
                //get the bytes of the hmac key and data string
        byte[] secretByte = hexStringToBytes(key);
        byte[] dataBytes = hexStringToBytes(s);
        System.out.println("key:" + key);
        System.out.println("s:" + s);
        
        SecretKey secret = new SecretKeySpec(secretByte, "HmacSHA256");

        mac.init(secret);
        byte[] doFinal = mac.doFinal(dataBytes);
        byte[] hexB = new Hex().encode(doFinal);
        System.out.print("ks_naf:");
        for(byte b: hexB){
        	System.out.print(b);
        }
        
    }
    
    
    public static byte[] hexStringToBytes(String hexString) {  
        if (hexString == null || hexString.equals("")) {  
            return null;  
        }  
        hexString = hexString.toUpperCase();  
        int length = hexString.length() / 2;  
        char[] hexChars = hexString.toCharArray();  
        byte[] d = new byte[length];  
        for (int i = 0; i < length; i++) {  
            int pos = i * 2;  
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));  
              
        }  
        return d;  
    }  
    
    private static byte charToByte(char c) {  
        return (byte) "0123456789ABCDEF".indexOf(c);  
    } 
}