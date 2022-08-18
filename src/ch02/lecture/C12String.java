package ch02.lecture;

public class C12String {
	public static void main(String[] args) {
		String a = "javascript";
		String b = "vscode";
		
		int x = 0;
		int y = 4;
		int i = 2;
		int j = 6;
		
		String c = a.substring(x, y);
		String d = b.substring(i, j);
		
		System.out.println(c + d); // "javacode"
		
	}
}
