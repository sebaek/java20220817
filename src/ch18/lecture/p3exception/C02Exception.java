package ch18.lecture.p3exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C02Exception {
	public static void main(String[] args) {
		OutputStream os = null;
		InputStream is = null;
		try {
			String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
			os = new FileOutputStream(name);
			is = new FileInputStream("");
			
			os.write(99); 
			os.write(88);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 꼭 실행해야 하는 코드는 finally 블럭에 작성
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}





