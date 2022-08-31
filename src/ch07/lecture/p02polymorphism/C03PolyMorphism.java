package ch07.lecture.p02polymorphism;

import java.util.Scanner;

class MyClass1 {
	public String s1;
	public Scanner s2;
	public Object s3;
}

public class C03PolyMorphism {
	public static void main(String[] args) {
		Object o1 = "java";
		Object o2 = new Scanner("");
		
		method1("hello");
		method2(new Object());
		method2("coyote");
		method2(new Scanner(""));
		
		MyClass1 o3 = new MyClass1();
		o3.s1 = "maverick";
		o3.s2 = new Scanner("");
		o3.s3 = new Object();
		
		o3.s3 = "phoenix";
		o3.s3 = new Scanner("");
	}
	
	public static void method1(String s) {
		
	}
	
	public static void method2(Object s) {
		
	}
}








