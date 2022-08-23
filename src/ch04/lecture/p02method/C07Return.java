package ch04.lecture.p02method;

public class C07Return {
	public static void main(String[] args) {
		System.out.println(1);
		
		method1();
		
		System.out.println(2);
	}
	public static double method5() {
		// 리턴값보다 큰타입으로 메소드 리턴타입 작성 가능
		return 5;
	}
	
	public static double method4() {
		return 3.14;
	}
	
	public static String method3() {
		
		return "hello";
	}
	
	public static int method2() {
		// return : 메소드 종료
		//          오른쪽 값을 호출한 곳으로 반환(return)
		
		// return으로 값을 반환할 때 
		// 메소드의 리턴 타입과 반환값의 타입이 일치해야함

		return 3;
	}
	
	
	public static void method1() {
		// return : 메소드 종료
		System.out.println("가");

		if (true) {
			return; // 메소드 종료
		}
		
		System.out.println("나");
	}
}




