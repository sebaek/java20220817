package ch18.lecture.p6filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C05Filter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		OutputStream os = new FileOutputStream(name);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (int i = 0; i < 10000; i++) {
			bw.write("오징어게임");
			bw.write("\n");
		}
		
		bw.close();
		osw.close();
		os.close();
	}
}




