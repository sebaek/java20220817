package p99programmers;

import java.util.Scanner;

class Solution12969 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12969
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		// System.out.println(a + b);
		// 코드작성
		String line = "";
		for (int i = 0; i < a; i++) {
			line += "*";
		}

		for (int i = 0; i < b; i++) {
			System.out.println(line);
		}
	}
}
