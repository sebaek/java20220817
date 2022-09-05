package ch10.lecture.p03exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class C02Exception {
	public static void main(String[] args) {
		// Exception : 일반 예외
		// checked exception
		// 예외 처리 코드를 작성했는 지 컴파일러가 체크함
		// 작성 안했으면 컴파일 안됨
		
		try {
			FileReader fr = new FileReader("");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 없네요");
		}
		
		
		System.out.println("실행 흐름 이어감...");
				
	}
}
