package ch11.lecture.p03string;

public class C03Length {
	public static void main(String[] args) {
		String s1 = "topgun";
		String s2 = "maverick";
		String s3 = "goose";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		System.out.println(s1.charAt(s1.length() - 1));
		System.out.println(s2.charAt(s2.length() - 1));
		System.out.println(s3.charAt(s3.length() - 1));
	}
}
