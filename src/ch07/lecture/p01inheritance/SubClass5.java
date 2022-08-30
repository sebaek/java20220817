package ch07.lecture.p01inheritance;

public class SubClass5 extends SuperClass5 {

	@Override
	public void method1() {
//		System.out.println("아주 중요하거나 너무 긴 코드");
		super.method1();
		System.out.println("추가한 코드들....");
	}
	
	
}
