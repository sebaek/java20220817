package ch18.lecture.p4reader;

import java.io.FileReader;

public class C03Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/ch18/lecture/p4reader/C03Reader.java";
		FileReader fr = new FileReader(fileName);
		
		int cnt = 0;
		
		while (fr.read() != -1) {
			cnt++;
		}
		
		System.out.println("총 " + cnt + "개의 문자로 작성됨");
		
		fr.close();
	}
}
