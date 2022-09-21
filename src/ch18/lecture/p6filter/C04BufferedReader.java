package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.FileReader;

public class C04BufferedReader {
	public static void main(String[] args) throws Exception {
		String name = "src/ch18/lecture/p6filter/C04BufferedReader.java";
		FileReader fr = new FileReader(name);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		int num = 1;
		while ((line = br.readLine()) != null) {
			System.out.println(num + ":" + line);
			num++;
		}
		
		br.close();
		fr.close();
	}
}








