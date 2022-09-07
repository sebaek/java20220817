package ch11.lecture.p02wrapper;

public class C04NullValue {
	public static void main(String[] args) {
		int a = 3;
		Integer b = 3;
		
//		int d = null;
		Integer c = null;
		
		int e = c; // runtime exception
		
		System.out.println("프로그램 실행 이어감.");
	}
}
