package ch09.lecture.p01nestedClass;

public class MyClass2 {
	public static void main(String[] args) {
		class LocalClass implements MyInterface2 {
			@Override
			public void method() {
				System.out.println("재정의한 메소드");
			}
		}
		
		MyInterface2 l = new LocalClass();
		l.method();
	}
}

interface MyInterface2 {
	void method();
}




