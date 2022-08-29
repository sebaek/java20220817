package ch06.lecture.p06package;

public class C01Package {
	public static void main(String[] args) {
		// 클래스 full name 사용
		ch06.lecture.p06package.MyClass1 o1 = new ch06.lecture.p06package.MyClass1();
		ch06.lecture.p05final.MyClass1 o2 = new ch06.lecture.p05final.MyClass1();
		
		// 같은 패키지에서 사용할 때 클래스의 패키지명 생략 가능
		MyClass1 o3 = new MyClass1();
		
		// 다른 패키지에 있으면 생략 불가
		ch06.lecture.p05final.MyClass1 o4 = new ch06.lecture.p05final.MyClass1();
		
		// 하지만 생략 가능한 경우가 있음
	}
}
