package ch04.book.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		
		while (true) {
			int d1 = (int) (Math.random() * 6) + 1;
			int d2 = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + d1 + ", " + d2 + ")");
			
			if (d1 + d2 == 5) {
				break;
			}
		}
		
		System.out.println("do while===================");
		int d1, d2;
		do {
			d1 = (int) (Math.random() * 6) + 1;
			d2 = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + d1 + ", " + d2 + ")");
			
		} while (d1 + d2 != 5);
		
	}
}










