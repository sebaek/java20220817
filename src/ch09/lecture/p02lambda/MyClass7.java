package ch09.lecture.p02lambda;

public class MyClass7 {
	public static void main(String[] args) {
		MyInterface7 o1 = n -> n * 2;
		int a = o1.method(9);
		System.out.println(a);
		
		MyInterface7 o2 = i -> i * i;
		
		int b = o2.method(10);
		System.out.println(b);
	}
}

@FunctionalInterface
interface MyInterface7 {
	int method(int i);
//	int method3(int a);
}






