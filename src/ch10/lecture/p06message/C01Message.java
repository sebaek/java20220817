package ch10.lecture.p06message;

public class C01Message {
	public static void main(String[] args) {
		System.out.println("메인 코드 1");
		method1();
		
		System.out.println("메인 실행 이어감~");
	}

	private static void method1() {
		System.out.println("메소드1 코드");
		try {
			method2();
		} catch (Exception e) {
			// 로그(메세지) 꼭 남기기
//			System.out.println("익셉션 발생함!!");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("메소드 1 실행 이어감");
	}

	private static void method2() throws Exception {
		throw new Exception("어떤 이유로 발생했는지 ");
	}
	
	
}
