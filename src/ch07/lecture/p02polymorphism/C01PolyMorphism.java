package ch07.lecture.p02polymorphism;

public class C01PolyMorphism {
	public static void main(String[] args) {
		// 자동형변환
		
		SubClass1 o1 = new SubClass1();
		SuperClass1 o2 = new SubClass1();
		SuperClass1 o3 = new SubClass2();
		
		SuperClass1 o4 = o1;
		
		// 거꾸로는 안됨
		SuperClass1 o5 = new SuperClass1();
//		SubClass1 o6 = new SuperClass1(); // x
//		SubClass2 o7 = new SuperClass1(); // x
		
//		SubClass1 o8 = o4; // x -> 강제로는 됨 
	}
}







