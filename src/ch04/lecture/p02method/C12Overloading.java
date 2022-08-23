package ch04.lecture.p02method;

public class C12Overloading {
	public static void main(String[] args) {
		double a = half(5.0);
		System.out.println(a); // 2.5
		
		double b = half(5);
		System.out.println(b); // 2
		
	}
	
	public static double half(int v) {
		return v / 2;
	}
	
	public static double half(double v) {
		return v / 2;
	}
}
