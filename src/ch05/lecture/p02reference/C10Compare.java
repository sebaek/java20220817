package ch05.lecture.p02reference;

public class C10Compare {
	// 그림 : 05참조타입비교.png
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b); // true
		
		int[] c = new int[] {3, 4, 5};
		int[] d = new int[] {3, 4, 5};
		
		System.out.println(c == d); // false
		
		int[] e = c;
		
		e[0] = 33;
		System.out.println(c[0]); // 33
		
		System.out.println(e == c); // true
	}
}










