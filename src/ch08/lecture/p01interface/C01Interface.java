package ch08.lecture.p01interface;

public class C01Interface {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		MyInterface1 o2 = o1; // 자동형변환
		
		MyClass2 o3 = new MyClass2();
		MyInterface1 o4 = o3; // 자동형변환
		MyInterface2 o5 = o3; // 자동형변환
	}
}
