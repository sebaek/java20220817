package ch04.lecture;

public class C03ElseIf {
	public static void main(String[] args) {
		
		// else if : 이전 조건이 false일 때 다시 조건확인 후 true이면 코드블럭 실행
		
		System.out.println(1);
		
		if (false) {
			System.out.println(2);
		} else if (false) {
			System.out.println(3);
		} else if (false) {
			System.out.println(4);
		} else if (false) {
			System.out.println(5);
		} else {
			System.out.println(6);
		}
		
		System.out.println(7);
		System.out.println(8);
	}
}
