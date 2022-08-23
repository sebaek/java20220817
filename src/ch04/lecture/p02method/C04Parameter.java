package ch04.lecture.p02method;

public class C04Parameter {
	public static void main(String[] args) {
		// 여러줄이 출력되도록 파라미터와 아규먼트 추가 
		printTriangle(5);
		printTriangle(10);
		printTriangle(7);
	}
	
	public static void printTriangle(int line) {
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
