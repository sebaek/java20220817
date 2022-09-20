package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C16MethodReference {
	public static void main(String[] args) {
		int max = IntStream.of(3, 9, 1, 0, 10)
			.boxed()
//			.max((x, y) -> x.compareTo(y))
			.max(Integer::compareTo)
			.get();
		
		System.out.println(max);
		
		int max2 = IntStream.of(3, 9, 10, 1, 0)
				.boxed()
//				.max((a, b) -> Integer.compare(a, b))
				.max(Integer::compare)
				.get();
		System.out.println(max2);
				
	}
}






