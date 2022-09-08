package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		// regular expression(regex)
		// 정규표현식, 정규식표현
		// 문자열의 패턴을 표현하는 코드(문자열)
		
		String str1 = "a";
		
		// 하나의 문자
		String pattern1 = "a";
		
		System.out.println(str1.matches(pattern1));
		
		String s2 = "b";
		String p2 = "b";
		System.out.println(s2.matches(p2));
		
		String s3 = "bb";
		String p3 = "b";
		
		System.out.println(s3.matches(p3));
		
		String s4 = "bbb";
		String p4 = "b+"; // + : 한개 이상
		
		System.out.println(s4.matches(p4));
		System.out.println(s3.matches(p4));
		System.out.println(s2.matches(p4));
		
		System.out.println("".matches(p4));
		
		String p5 = "b*"; // * : 0개 이상
		System.out.println("bbb".matches(p5));
		System.out.println("bb".matches(p5));
		System.out.println("b".matches(p5));
		System.out.println("".matches(p5));
		
		String p6 = "dog";
		System.out.println("dog".matches(p6));
		
		String p7 = "do+g";
		System.out.println("dog".matches(p7));
		System.out.println("doooooog".matches(p7));
		
		String p8 = "[abcd]"; // [] : 안에 나열된 문자 중 하나
		System.out.println("a".matches(p8));
		System.out.println("b".matches(p8));
		System.out.println("c".matches(p8));
		System.out.println("e".matches(p8));
		System.out.println("A".matches(p8)); // false
		
		String p9 = "[a-c]";
		System.out.println("a".matches(p9));
		System.out.println("b".matches(p9));
		System.out.println("c".matches(p9));
		System.out.println("A".matches(p9));
		System.out.println("d".matches(p9));
		
		
		String p10 = "[a-cA-C]"; // [abcABC]
		System.out.println("a".matches(p10));
		System.out.println("A".matches(p10));
		System.out.println("d".matches(p10));
		System.out.println("abc".matches(p10));
		
		System.out.println("abc".matches("[a-c]+"));
		
		String p11 = "[^abcdefghijkl]"; // [^] : 제외하고
		System.out.println("a".matches(p11));
		System.out.println("m".matches(p11));
		System.out.println("0".matches(p11));
		
		String p12 = "[^a-z]";
		System.out.println("a".matches(p12));
		System.out.println("A".matches(p12));
		System.out.println("9".matches(p12));
		
		String p13 = "d[^o]+g";
		System.out.println("dog".matches(p13));
		System.out.println("dag".matches(p13));
		System.out.println("dabcdefg".matches(p13));
		
		// 수량
		// + : 1개 이상
		// * : 0개 이상
		// ? : 0개 또는 1개
		// {n} : n개
		// {n,} : n개 이상
		// {n, m} : n개 이상 m개 이하
		
		String p14 = "do+g";
		System.out.println("dog".matches(p14));
		System.out.println("doooooooooooog".matches(p14));
		
		String p15 = "do*g";
		System.out.println("dog".matches(p15));
		System.out.println("doooog".matches(p15));
		System.out.println("dg".matches(p15));
		
		String p16 = "do?g";
		System.out.println("dog".matches(p16));// true
		System.out.println("dg".matches(p16));// true
		System.out.println("doog".matches(p16));// false
		
		String p17 = "do{2}g";
		System.out.println("doog".matches(p17));
		System.out.println("dog".matches(p17));
		System.out.println("dooog".matches(p17));
		
	}
}




















