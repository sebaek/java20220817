package ch10.lecture.p02try;

public class C04Finally {
	public static void main(String[] args) {
		try {
			System.out.println("코드");
		} finally {
			System.out.println("항상 실행되는 코드");
			System.out.println("catch 없이 사용 가능");
			System.out.println("catch 블럭 있으면 그다음(마지막)에 작성");
		}
		
	}
}
