package ch18.lecture.p6filter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class C02OutputStreamWriter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output9.txt";
		
		FileOutputStream fos = getFileOutputStream(name);
		Writer wr = new OutputStreamWriter(fos);
		
//		fos.write('a');
//		fos.write('b');
//		fos.write('가');
//		fos.write('나');
		
		wr.write('a');
		wr.write('b');
		wr.write('가');
		wr.write('나');
		
		
		wr.close();
		fos.close();
		
	}
	
	private static FileOutputStream getFileOutputStream(String fileName) throws Exception {
		return new FileOutputStream(fileName);
	}
}
