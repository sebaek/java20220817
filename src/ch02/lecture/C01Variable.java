package ch02.lecture;

public class C01Variable {
	public static void main(String[] args) {
		// 변수 : 값을 저장하는 공간의 이름
		// 타입명 변수명;
		int a; // a라는 int타입 변수 선언
		a = 3; // a변수에 3 대입(할당)
		
		int b = 3; // b라는 int타입 변수 선언 및 값 할당
		
		// 변수명 작성 규칙
		// 사용할 수 있는 문자 : 영문대소문자, 숫자, $, _
		// 숫자로 시작하면 안됨,
		// 키워드 사용하면 안됨
		// 같은 이름의 변수명 재선언 안됨
//		int b; // 같은 변수명 사용 안됨
		
		int c;//ok
		int $; // ok
//		int _; // x
		int _a; // ok
		int A; // ok
		int C; // ok
//		int 3; // x
		int a3; // ok
		
		// 변수명 작성 관습: lowerCamelCase
		int studentNumber;
		int yourCar;
		int MyCar; // x
		int our_home; // x
		
		
	}
}




