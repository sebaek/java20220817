package ch03.lecture.p2binary;

public class C03Arithmetic {
	public static void main(String[] args) {
		// 실수는 근사치로 저장됨
		double a = 0.1;
		double b = 0.2;
		double c = a + b;
		System.out.println(c);
		
		// 정수를 0으로 나눌 때 주의
		int d = 3;
		int e = 0;
		System.out.println(e / d); // ok
		
		if (e != 0) {
			System.out.println(d / e); // 0으로 나누기 안됨
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("계속 실행되는 코드들.....");
		
		// 실수를 0으로 나누면 Infinity
		double f = 3.0;
		double g = 0.0;
		double h = -3.0;
		double i = -0.0;
		System.out.println(g / f); // 0
		System.out.println(f / g); // Infinity
		System.out.println(h / g); // -Infinity
		System.out.println(f / i); // -Infinity
		
		// 0으로 나눈 나머지 NaN
		System.out.println(f % g); // NaN (Not a Number)
		
		
		
		
	}
}







