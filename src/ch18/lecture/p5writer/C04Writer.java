package ch18.lecture.p5writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class C04Writer {
	public static void main(String[] args) throws Exception {
		// 문자들로 작성된 파일 복사
		File src = new File("src/ch18/lecture/p5writer/C04Writer.java");
		File dec = new File("C:\\Users\\user\\Desktop\\output\\output8.txt");
		
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dec);
		
		char[] buf = new char[100];
		int len = 0;
		
		while ((len = fr.read(buf)) != -1) {
			fw.write(buf, 0, len);
		}
		
		System.out.println("복사 완료");
		
		fr.close();
		fw.close();
	}
}







