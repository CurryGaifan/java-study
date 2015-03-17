package try_with_resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_Java6 {
	static String readFirstLineFromFile(String path) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
			return br.readLine();
		} finally {
			if (br != null)
				br.close();
		}

	}

	public static void main(String[] args) {
		try {
			System.out.println(readFirstLineFromFile("b.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getSuppressed().length);
		}
	}

}
