package ch06.lecture.p02constructor;

import java.util.Scanner;

public class C05Constructor {
	public static void main(String[] args) {
		String s1 = new String("java");
		Scanner scanner = new Scanner("hello");
		
		String s2 = new String();
		String s3 = new String(new byte[] {});
		String s4 = new String(new char[] {});
		String s5 = new String(new char[] {}, 1, 2);
		
	}
}
