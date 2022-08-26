package ch06.lecture.p02constructor;

public class C04Constructor {
	public static void main(String[] args) {
		MyClass4 o1 = new MyClass4("maverick", 99);
		System.out.println(o1.name);
		System.out.println(o1.age);
		
		MyClass4 o2 = new MyClass4("iceman", 77);
		System.out.println(o2.name);
		System.out.println(o2.age);
	}
}
