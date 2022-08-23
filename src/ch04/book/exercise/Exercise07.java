package ch04.book.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");

			// 작성 위치
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				// 예금
				System.out.print("예금액>");
				int money = scanner.nextInt();
				
				balance += money;
				break;

			case 2:
				// 출금
				System.out.print("출금액>");
				int money2 = scanner.nextInt();
				
				balance -= money2;
				break;

			case 3:
				// 잔고
				System.out.println("잔고>" + balance);
				break;

			case 4:
				// 종료
				run = false;
				break;

			default:
				break;
			}
		}

		System.out.println("프로그램 종료");
	}
}
