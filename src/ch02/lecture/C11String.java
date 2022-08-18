package ch02.lecture;

public class C11String {
	public static void main(String[] args) {
		// String : 문자열 
		
		// char : 문자
		
		char a = '뀗'; // 작은 따옴표
		String b = "java"; // 큰 따옴표
		String c = ""; // 빈 문자열
		
		// + (연결연산)의 결과는 String
		String d = "hello";
		char e = '!';
		String f = d + e;
		System.out.println(f);
		
		String g = d + 100;
		System.out.println(g);
		
		String h = d + 3.14;
		System.out.println(h);
		
		String i = d + true;
		System.out.println(i);
		
		String j = d + " world";
		System.out.println(j);
		
		// 참조타입 (객체) ; 필드와 메소드가 있음
		String k = "bts";
		char l = k.charAt(0); // charAt 메소드
		int m = k.charAt(0);
		
		char n = k.charAt(0); // 'b'
		char o = k.charAt(1); // 't'
		char p = k.charAt(2); // 's'
		
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
//		k.charAt(3); // IndexOutOfBoundsException 던져짐(발생)
		
		// length : 길이 리턴
		int q = k.length();
		System.out.println(q);
		
		String r = "javascript";
		System.out.println(r.length());
		
		System.out.println("hello world".length());
		System.out.println("".length());
		System.out.println(r.charAt(r.length()-1));
		
		// substring 
		
		String s = r.substring(0);
		System.out.println(s);
		String t = r.substring(1);
		System.out.println(t);
		System.out.println(r.substring(2));
		System.out.println(r.substring(3));
		System.out.println(r.substring(4));
		System.out.println(r.substring(9));
		System.out.println(r.substring(10));
		
		// substring(int, int)
		
		System.out.println(r.substring(0, 9));
		System.out.println(r.substring(0, 10));
		System.out.println(r.substring(0, 4)); // "java"
		System.out.println(r.substring(2, 4)); // "va"
		
				
	}
}





