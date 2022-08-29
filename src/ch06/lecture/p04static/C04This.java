package ch06.lecture.p04static;

public class C04This {
	// this : 생성될 인스턴스 참조값
	// this() : 다른 생성자 호출
	
	C04This() {
		
	}
	
	C04This(int a) {
		this();
		// field 초기화...
	}
	
	C04This(String s) {
		this(3);
	}
}





