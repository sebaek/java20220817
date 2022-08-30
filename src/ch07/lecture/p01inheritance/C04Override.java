package ch07.lecture.p01inheritance;

public class C04Override {
	public static void main(String[] args) {
		Object o1 = new Object();
		String o2 = new String("java");
		
		System.out.println(o1.hashCode()); // 참조값
		System.out.println(o2.hashCode()); // 재정의된 메소드 리턴값
		
		System.out.println(System.identityHashCode(o1)); // 참조값
		System.out.println(System.identityHashCode(o2)); // 참조값
	}
}
