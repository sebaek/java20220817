package ch12.lecture;

import java.awt.Toolkit;

public class C03Lambda {
	public static void main(String[] args) {
		// 소리 출력
		Thread t1 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("띵");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}
}





