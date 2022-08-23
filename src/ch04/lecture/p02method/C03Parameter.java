package ch04.lecture.p02method;

public class C03Parameter {
	public static void main(String[] args) {
		System.out.println(1);
		method1(); // 파라미터없는 메소드 호출
		System.out.println(2);
		
//		method2(3.14);//x
//		method2("hello")//x
		method2(3); // ok (argument, 인수, 인자)
		
		System.out.println(3);
		
		method2(5); 
		
	}
	
	public static void method1() {
		System.out.println("메소드1 실행");
	}
	
	public static void method2(int a) {
		// 메소드 파라미터(인자, 매개변수)
		// () 안에 타입과 파라미터명 나열
		// 파라미터명 작성 관습 : lowerCamelCase
		
		System.out.println("메소드2 실행");
		System.out.println("a:" + a);
	}
	
	public static void method3(int myCarName) {
		
	}
}







