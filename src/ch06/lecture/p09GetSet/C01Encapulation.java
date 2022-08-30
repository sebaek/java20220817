package ch06.lecture.p09GetSet;

public class C01Encapulation {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
//		o1.age = 30;
//		System.out.println(o1.age);
//		
//		o1.age = -30;
//		System.out.println(o1.age);
		
		o1.setAge(30);
		System.out.println(o1.getAge());
		
		o1.setAge(-30);
		System.out.println(o1.getAge());
	}
}
