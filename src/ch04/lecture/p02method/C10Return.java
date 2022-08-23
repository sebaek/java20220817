package ch04.lecture.p02method;

public class C10Return {
	public static void main(String[] args) {
		int a = max(3, 5);
		System.out.println(a); // 5
		
		int b = max(5, 3);
		System.out.println(b); // 5
		
		int c = max(-100, 100);
		System.out.println(c); // 100
		
		int d = max(100, 200);
		System.out.println(d); // 200
		
	}

	private static int max(int i, int j) {

		if (i > j) {
			return i;
		}
		return j;
		
	}

}





