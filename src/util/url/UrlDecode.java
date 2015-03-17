package url;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class UrlDecode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str =  URLDecoder.decode("%E8%BD%AF%E4%BB%B6", "UTF-8") ;
		
		System.out.println(str);
	}
}
