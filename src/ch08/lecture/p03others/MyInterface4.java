package ch08.lecture.p03others;

public interface MyInterface4 {
	// static 작성 가능
	// public 
	static void method4() {
		System.out.println("인스턴스 생성없이 실행가능");
	}
	
	
	void method1(); // 추상 메소드
	
	// instance 메소드
	default void method2() {
		
	}
	
	private void method3() {
		
	}
}
