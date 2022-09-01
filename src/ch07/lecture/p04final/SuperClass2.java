package ch07.lecture.p04final;

public class SuperClass2 {
	public void method1() {
		
	}
	
	// 상속받는 클래스에서 재정의할 수 없음
	public final void method2() {
		
	}
}

class SubClass2 extends SuperClass2 {
	@Override
	public void method1() {
		
	}
	
	// 재정의 안됨
	public void method2() {
		
	}
}












