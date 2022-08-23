package ch04.lecture.p01control;

public class C10For {
	public static void main(String[] args) {
		System.out.println("==========================");
		System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			// space 출력
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			// * 출력
			for (int l = 5; l > i; l--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			// space 출력
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			
			// * 출력
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------------");
		int l = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((l++) % 10);
			}
			System.out.println();
		}
	}
}




















