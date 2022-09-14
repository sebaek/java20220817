package ch12.lecture;

import java.awt.Toolkit;

public class C01Thread {
	public static void main(String[] args) throws Exception {
		// 문자 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			// 실행 잠시 멈춤
			Thread.sleep(500);
		}
		
		// 소리 출력
		Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			
			// 실행 잠시 멈춤
			Thread.sleep(500);
		}
	}
}



