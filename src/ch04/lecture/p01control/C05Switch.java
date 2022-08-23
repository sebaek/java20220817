package ch04.lecture.p01control;

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

//		System.out.println("long type 되나??");
//		switch (3L) {
//		case 3L:
//			System.out.println("되니?");
//		}

	}
}
