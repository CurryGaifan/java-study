package try_with_resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;

public class TryWithResource {
	static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	static void writeToFileZipFileContents(String zipFileName, String outputFileName) throws java.io.IOException {

		java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.US_ASCII;
		java.nio.file.Path outputFilePath = java.nio.file.Paths.get(outputFileName);

		// Open zip file and create output file with
		// try-with-resources statement

		try (java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);
				java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)) {
			// Enumerate each entry
			for (Enumeration<? extends ZipEntry> entries = zf.entries(); entries.hasMoreElements();) {
				// Get the entry name and write it to the output file
				String newLine = System.getProperty("line.separator");
				String zipEntryName = ((java.util.zip.ZipEntry) entries.nextElement()).getName() + newLine;
				writer.write(zipEntryName, 0, zipEntryName.length());
			}
		}
	}

	public static void main(String[] args) throws IOException {
		List<String> list  = new ArrayList<>();
		System.out.println(readFirstLineFromFile("a.txt"));
	}

}
