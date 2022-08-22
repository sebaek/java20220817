package ch04.book.exercise;

public class Exercise05 {
	public static void main(String[] args) {
		// 4x + 5y = 60 
		// 1 <= x,y <= 10
		
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
//				System.out.println(x + ", " + y);
				int r = (4 * x) + (5 * y);
				if (r == 60) {
					System.out.println(x + ", " + y);
				}
			}
		}
		
	}
}
