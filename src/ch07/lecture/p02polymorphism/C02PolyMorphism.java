package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C02PolyMorphism {
	public static void main(String[] args) {
		String s1 = "java";
		Object s2 = "hello";
		
//		String s3 = s2; // x
		
		Scanner scanner = new Scanner("");
		Object s4 = scanner;
		Object s5 = new Scanner("hello");
		
	}
}
