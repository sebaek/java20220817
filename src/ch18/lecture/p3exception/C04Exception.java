package ch18.lecture.p3exception;

import java.io.PrintWriter;
import java.util.Scanner;

public class C04Exception {
	public static void main(String[] args) {
		// 생성시 checked exception 처리하지 않아도 되고
		// 다시 할당하는 코드가 작성되지 않는다면(effectively final)
		// try 블럭 전에 선언 및 할당하고
		// try () 변수명 나열할 수 있음
		// java 9부터 가능

		final Scanner scanner = new Scanner("");
		PrintWriter pw = new PrintWriter(System.out); // final 키워드 생략 가능
		
		try (scanner; pw;) {
			// 일 함...
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}


