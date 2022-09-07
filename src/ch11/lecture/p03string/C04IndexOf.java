package ch11.lecture.p03string;

public class C04IndexOf {
	public static void main(String[] args) {
		String s1 = "coyote";
		
		int i1 = s1.indexOf("o");
		System.out.println(i1);
		
		String s2 = "hashcode is code value for instance";
		int i2 = s2.indexOf("code");
		System.out.println(i2);
		
		int i3 = s2.indexOf("java"); // 없으면 -1
		System.out.println(i3);
		
		int i4 = s1.indexOf('o');
		System.out.println(i4);
		
		int i5 = s1.indexOf(111);
		System.out.println(i5);
	}
}





