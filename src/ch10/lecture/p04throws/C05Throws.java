package ch10.lecture.p04throws;

import javax.sql.DataSource;

public class C05Throws {
	
	static DataSource db = null;
	
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		method2();
	}

	private static void method2() {
		method3();
	}

	private static void method3() {
		// try/catch 사용하지 않고 컴파일 되도록 코드 수정
		db.getConnection();
	}
	
	
}
