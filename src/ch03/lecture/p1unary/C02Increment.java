package ch03.lecture.p1unary;

public class C02Increment {
	public static void main(String[] args) {
		// ++ : 증가연산자
		// -- : 감소연산자
		
		int i = 10;
		int j = 10;
		
		int k = ++i; // 연산결과는 11, i가 11이됨
		int l = j++; // 연산결과가 10, j가 11이됨
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(k);
		System.out.println(l);
		
		int m = 10;
		int n = 10;
		
		int o = --m; // 연산결과는 9, m이 9가됨
		int p = n--; // 연산결과는 10, n이 9가 됨
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
	}
}







