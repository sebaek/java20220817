package ch18.lecture.p6filter;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03BufferedOutputStream {
	public static void main(String[] args) throws Exception {
		/* 버퍼드 스트림 사용 */
		long start1 = System.currentTimeMillis();
		bufferedStream();
		long end1 = System.currentTimeMillis();
		
		System.out.println("버퍼드스트림 사용 종료:" + (end1 - start1) + "ms");
		
		/* 그냥 output stream 사용 */
		long start = System.currentTimeMillis();
		normalStream();
		long end = System.currentTimeMillis();
		
		System.out.println("그냥 스트림 사용 종료:" + (end - start) + "ms");
		
		
		
	}

	private static void bufferedStream() throws Exception {
		String path = "C:\\Users\\user\\Desktop\\output\\output11.txt";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for (int i = 0; i < 1024 * 1024 * 10; i++) {
			bos.write(97);
		}
		
		bos.close();
		fos.close();
	}

	private static void normalStream() throws FileNotFoundException, IOException {
		String path = "C:\\Users\\user\\Desktop\\output\\output10.txt";
		FileOutputStream fos = new FileOutputStream(path);
		
		for (int i = 0; i < 1024 * 1024 * 10; i++) {
			fos.write(97);
		}

		fos.close();
	}
}







