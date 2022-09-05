package ch10.lecture.p02try;

public class C06Catch {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
		} catch (Throwable e) {
			System.out.println("영으로 나누려고???");
		}
	}
}
