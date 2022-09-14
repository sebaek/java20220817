package ch12.lecture;

import java.awt.Toolkit;

public class C04ExtendsThread {
	public static void main(String[] args) {
		Thread t1 = new Task3();
		Thread t2 = new Task4();
		
		t1.start();
		t2.start();
	}
}
class Task4 extends Thread {
	@Override
	public void run() {
		// 문자 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Task3 extends Thread {
	@Override
	public void run() {
		// 소리 출력
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
	}
}







