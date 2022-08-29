package ch06.lecture.p04static;

public class MyClass1 {
	// non static field
	// instance field
	String name;
	
	// static field
	// class field
	static String company;
	
	// 생성자 constructor
	public MyClass1(String name) {
		this.name = name;
	}
	
	// non static method
	void printName() {
		System.out.println(name);
	}
}
