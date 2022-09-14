package ch12.lecture;

public class C08SynchronizedMethod {
	public static void main(String[] args) throws Exception {
		Memo memo = new Memo();
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000000; i++) {
				memo.increment();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000000; i++) {
				memo.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(memo.getI());
	}
}

class Memo {
	private int i;
//	private static Object mutex = new Object();
	
	public int getI() {
		return i;
	}
	
	public synchronized void increment() {
		i++;
	}
}



