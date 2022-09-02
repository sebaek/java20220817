package ch09.lecture.p02lambda;

public class MyClass2 {
	public static void main(String[] args) {
		// 메소드 내 코드가 한 줄이면 {} 생략 가능
		MyInterface2 o1 = () -> System.out.println("코드작성!!!!!");
		
		o1.method();
	}
}

interface MyInterface2 {
	void method();
}
