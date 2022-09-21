package ch18.book;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;

		String path = "C:\\Users\\user\\Desktop\\output\\output11.txt";
		FileInputStream fis1 = new FileInputStream(path);
		
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("미사용:" + (end-start) + "ms");
		
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {}
		end = System.currentTimeMillis();
		
		System.out.println("사용:" + (end - start) + "ms");
		bis.close();
		fis2.close();
	}
}







