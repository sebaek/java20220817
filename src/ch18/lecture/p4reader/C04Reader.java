package ch18.lecture.p4reader;

import java.io.FileReader;

public class C04Reader {
	public static void main(String[] args) throws Exception {
		// 409개 문자로 작성된 파일
		String fileName = "src/ch18/lecture/p4reader/C03Reader.java";
		FileReader fr = new FileReader(fileName);
		
		// read(char[]) : char배열에 읽은 문자를 채우고 읽은 문자 갯수를 리턴
		char[] buffer = new char[100];
		
		int len1 = fr.read(buffer);
		int len2 = fr.read(buffer);
		int len3 = fr.read(buffer);
		int len4 = fr.read(buffer);
		int len5 = fr.read(buffer);
		int len6 = fr.read(buffer); // 더 읽을 문자가 없으면 -1
		
		System.out.println(len1);
		System.out.println(len2);
		System.out.println(len3);
		System.out.println(len4);
		String str4 = new String(buffer);
		System.out.println(len5);
		String str5 = new String(buffer);
		System.out.println(len6);
		
		System.out.println("########str4");
		System.out.println(str4);
		
		System.out.println("########str5");
		System.out.println(str5);
		
		fr.close();

	}
}




