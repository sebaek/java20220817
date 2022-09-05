package ch10.lecture.p04throws;

public class C01Throws {
	public static void main(String[] args) throws ClassNotFoundException {
		// throws : 이 메소드를 호출한 곳으로 exception이 던져 질 수 있음
		method1();
	}
	
	public static void method1() throws ClassNotFoundException {
		Class.forName("java.lang.String");
	}
}
