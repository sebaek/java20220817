package ch08.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
//		MyInterface1 o1 = new MyInterface1();
//		MyInterface1 o2 = new MyClass1();
		
		//인터페이스 구현과 객체 생성을 한 번에
		MyInterface1 o3 = new MyInterface1() {
			@Override
			public void method() {
				System.out.println("재정의한 메소드!!!");
			}
		};
		
		o3.method();
		
	}
}

//class MyClass1 implements MyInterface1 {
//	@Override
//	public void method() {
//	}
//}

interface MyInterface1 {
	void method();
}






