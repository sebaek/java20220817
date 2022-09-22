package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C07Filter {
	public static void main(String[] args) {
		String src = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		String des = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		
		try (
			FileInputStream  fis = new FileInputStream(src);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream(des);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
				) {

			char[] cbuf = new char[1000];
			int len = 0;
			
			while ((len = br.read(cbuf)) != -1) {
				bw.write(cbuf, 0, len);
			}
			
			System.out.println("복사 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}












