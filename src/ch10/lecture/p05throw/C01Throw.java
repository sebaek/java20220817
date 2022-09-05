package ch10.lecture.p05throw;

public class C01Throw {
	public static void main(String[] args) {
		try {
			method1();
			
		} catch (RuntimeException e) {
			System.out.println("실행 예외 잡았다");
		}
		
		System.out.println("프로그램 실행 이어감.");
	}

	private static void method1() {
		System.out.println("코드1");
		System.out.println("코드2");

		// 예외 발생
		// throw Exception
		throw new RuntimeException();
		
	}
}







