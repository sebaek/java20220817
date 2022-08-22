package ch04.lecture;

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
	}
}











