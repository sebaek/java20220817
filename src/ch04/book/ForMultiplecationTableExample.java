package ch04.book;

public class ForMultiplecationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			
//			System.out.println("안쪽 for 문");
			for (int n = 1; n <= 9; n++) {
//				System.out.println("안쪽 for 코드블럭");
				System.out.println(m + " X " + n  + " = " + (m*n));
			}
		}
	}
}
