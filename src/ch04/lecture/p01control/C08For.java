package ch04.lecture.p01control;

public class C08For {
	public static void main(String[] args) {
		System.out.println(1);
		
		
		for (int j = 0; j < 2; j++) {
			System.out.println(2);
			for (int i = 0; i < 3; i++) {
				System.out.println(3);
				System.out.println(4);
			}
		}
		
		System.out.println(5);
	}
}
