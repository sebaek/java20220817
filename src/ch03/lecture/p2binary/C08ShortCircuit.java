package ch03.lecture.p2binary;

public class C08ShortCircuit {
	public static void main(String[] args) {
		// short circuit
		// &&, || => 발생
		int i = 3;
		
		if (i < 0 && i > -5) {
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		
		if ((i++) < 0 && (i++) > -5) {
			System.out.println("i는 -5보다 크고 0보다 작다");
		}
		
		System.out.println("i:" + i);
		
		
		// &, | => 발생안함
		int j = 3;
		if ((j++) < 0 & (j++) > -5) {
			System.out.println("j는 -5보다 크고 0보다 작다");
		}
		System.out.println("j:" + j);
		
		System.out.println("프로그램 종료");
	}
}




