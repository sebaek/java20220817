package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C04IntermediateOperation {
	public static void main(String[] args) {

		// 중간연산(메소드) : 리턴 타입 -> xxxStream

		// limit : element 갯수 제한
		Integer r1 = Stream.of(3, 4, 5, 9, -1, 10, 11)
				.limit(5)
				.max((x, y) -> x - y)
				.get();

		System.out.println(r1);

		// skip : element 몇 개 무시
		Integer r2 = Stream.of(3, 4, 5, 9, 10, 11)
				.skip(2)
				.min((x, y) -> x - y)
				.get();
		System.out.println(r2);

		// filter : Predicate에서 true 나온 것만 추림
		Integer r3 = Stream.of(3, 4, 5, 6, 7)
				.filter((e) -> e % 2 == 0)
				.reduce((x, y) -> x + y)
				.get();

		System.out.println(r3);

		// filter :
		Integer r4 = Stream.of(3, 4, 5, 6, 7)
				.filter((e) -> e % 2 != 0) // 홀수만
				.reduce((x, y) -> x + y)
				.get();

		System.out.println(r4); // 15

		// distinct : 중복 제거
		Integer r5 = Stream.of(3, 3, 4, 4, 5, 5, 5, 6, 7)
				.distinct()
				.reduce((x, y) -> x + y)
				.get();
		
		System.out.println(r5);
		
		// sorted : 정렬한 스트림 리턴
		Stream.of(5, 3, 0, 7, 9, 1)
			.sorted()
			.forEach(e -> System.out.println(e));
		
		// 중간연산 조합
		Stream.of(5, 3, 0, 7, 9, 1)
			.sorted()
			.limit(3)
			.forEach(e -> System.out.println(e));
			
		// 중간연산 조합
		Stream.of(5, 3, 0, 7, 9, 1)
			.limit(3)
			.sorted()
			.forEach(e -> System.out.println(e));
		
		
	}
}


































