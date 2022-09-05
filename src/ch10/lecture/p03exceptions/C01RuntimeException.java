package ch10.lecture.p03exceptions;

public class C01RuntimeException {
	public static void main(String[] args) {
		// Runtime Exception : 실행 예외
		// unchecked exception
		// 컴파일러가 예외처리 문법 사용을 체크하지 않음
		
		int a = Integer.parseInt("100");
		int b = Integer.parseInt("이백");
		
		System.out.println("실행 흐름 이어감");
	}
}
