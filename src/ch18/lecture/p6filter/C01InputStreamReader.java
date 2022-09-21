//한글
package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C01InputStreamReader {
	public static void main(String[] args) throws Exception {
		String name = "src/ch18/lecture/p6filter/C01InputStreamReader.java";
		
		FileInputStream fis = getFileInputStream(name);
		Reader rd = new InputStreamReader(fis);
		
//		int c1 = fis.read();
//		int c2 = fis.read();
//		int c3 = fis.read();
		
		int c1 = rd.read();
		int c2 = rd.read();
		int c3 = rd.read();
		
		System.out.println((char) c1);
		System.out.println((char) c2);
		System.out.println((char) c3);
		
		fis.close();
	}

	private static FileInputStream getFileInputStream(String fileName) throws Exception {

		return new FileInputStream(fileName);

	}
}
