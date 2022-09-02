package ch08.lecture.p03others;

public class MyClass12 implements MyInterface1 {
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
	// defulat 메소드 override 가능
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		MyInterface1.super.method2();
	}
}
