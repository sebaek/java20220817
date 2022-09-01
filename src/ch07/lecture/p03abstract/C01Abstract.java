package ch07.lecture.p03abstract;

public class C01Abstract {
	public static void main(String[] args) {
		SubClass1 o1 = new SubClass1(); // ok
//		SuperClass1 o2 = new SuperClass1(); // ok
		
		SuperClass1 o3 = new SubClass1();
	}
}
