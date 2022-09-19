package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C06IntStream {
	public static void main(String[] args) {
		// 1~10까지 출력
		System.out.println("1~10까지 출력");
		IntStream.rangeClosed(1, 10)
				.forEach((e) -> System.out.println(e));

		System.out.println();
		// 1~100까지의 합 출력
		System.out.println("1~100까지의 합 출력");
		int r1 = IntStream.rangeClosed(1, 100)
				.sum();
		System.out.println(r1);

		// 1~100까지의 수 중 홀 수의 합 출력
		System.out.println("1~100까지의 수 중 홀 수의 합 출력");
		int r2 = IntStream.rangeClosed(1, 100)
				.filter((n) -> n % 2 == 1)
				.sum();
		System.out.println(r2);

		// [5, 10, 20, 1, 6] 의 평균 구하기
		System.out.println("[5, 10, 20, 1, 6] 의 평균 구하기");
		double r3 = IntStream.of(5, 10, 20, 1, 6)
				.average()
				.getAsDouble();
		System.out.println(r3);

		// 주사위(1~6) 5번 던진 결과 출력
		System.out.println("주사위(1~6) 5번 던진 결과 출력");
		IntStream.generate(() -> (int) (Math.random() * 6) + 1)
				.limit(5)
				.forEach((e) -> System.out.println(e));

		// 로또번호(1~45) 6개 작은 수 부터 출력 (중복없이)
		System.out.println("로또번호(1~45) 6개 작은 수 부터 출력 (중복없이)");
		IntStream.generate(() -> (int) (Math.random() * 45) + 1)
				.distinct()
				.limit(6)
				.sorted()
				.forEach(e -> System.out.println(e));
	}
}
