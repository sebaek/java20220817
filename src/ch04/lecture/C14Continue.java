package ch04.lecture;

public class C14Continue {
	public static void main(String[] args) {
		System.out.println(1);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(2);
			
			if (true) {
				continue;
			}
			
			System.out.println(3);
		}
		
		System.out.println(4);
		
		
	}
}
