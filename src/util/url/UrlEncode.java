package url;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {

		String[] strArray = { "http://www.chinaso.com/search/pagesearch.htm?q=test", "http://www.chinaso.com/search/pagesearch.htm?q=bergkamp",
				"http://www.chinaso.com/search/pagesearch.htm?q=dennis+bergkamp", "http://www.chinaso.com/search/pagesearch.htm?q=ajax",
				"http://www.chinaso.com/search/pagesearch.htm?q=ajax%E6%95%99%E7%A8%8B&fm=relate&wd=ajax" };
		for (String str : strArray) {
			System.out.println(URLEncoder.encode(str, "UTF-8"));
		}

	}
}
