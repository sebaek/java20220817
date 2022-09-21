package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C02InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C02InputStream.java";
		InputStream is = new FileInputStream(path);
		
		// read : 한바이트씩 읽음
		// 더 이상 읽을 바이트가 없으면 -1 리턴
		
		int cnt = 0;
		while ((is.read()) != -1) {
			cnt++;
		}
		
		System.out.println(cnt + "번 읽음");
		
		is.close();
	}
}




