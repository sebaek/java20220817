package ch04.lecture;

public class C05Switch {
	public static void main(String[] args) {
		System.out.println(1);

		switch (200) {
		case 100:
			System.out.println(2);
			System.out.println(3);

			break;
		case 200:
			System.out.println(4);
			System.out.println(5);

			break;

		default:
			System.out.println(999999);
			break;
		}

		System.out.println(6);

	}
}
