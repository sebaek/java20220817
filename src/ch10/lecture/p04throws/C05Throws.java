package ch10.lecture.p04throws;

import java.sql.SQLException;

import javax.sql.DataSource;

public class C05Throws {
	
	static DataSource db = null;
	
	public static void main(String[] args) throws SQLException {
		method1();
	}

	private static void method1() throws SQLException {
		method2();
	}

	private static void method2() throws SQLException {
		method3();
	}

	private static void method3() throws SQLException {
		// try/catch 사용하지 않고 컴파일 되도록 코드 수정
		db.getConnection();
	}
	
	
}




