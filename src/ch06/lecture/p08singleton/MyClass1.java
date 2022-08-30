package ch06.lecture.p08singleton;

public class MyClass1 {
	
	private static final MyClass1 instance = new MyClass1();

	private MyClass1() {
		
	}
	
	public static MyClass1 getInstance() {
		return instance;
	}
	
	
}
