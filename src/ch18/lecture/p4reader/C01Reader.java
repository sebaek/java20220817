package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.Reader;

public class C01Reader {
	public static void main(String[] args) throws Exception {
		// Reader : 문자 단위 입력 스트림
		String fileName = "src/ch18/lecture/p4reader/C01Reader.java";
		Reader rd = new FileReader(fileName);
		
		// 주요 메소드 : read
		// read() : 한 문자 읽고 int로 리턴
		int i1 = rd.read();
		int i2 = rd.read();
		
		System.out.println((char) i1); // p
		System.out.println((char) i2); // a
		
		rd.close();
	}
}







