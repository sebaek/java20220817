package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C19Collect {
	public static void main(String[] args) {
		double avg1 = IntStream.of(10, 9, 7, 1, 20, 100, 50)
			.boxed()
			.collect(Collectors.averagingDouble(Double::valueOf));
		
		System.out.println(avg1);
		
		long count1 = IntStream.of(10, 9, 7, 1, 20, 100, 50)
				.filter(C19Collect::even)
				.boxed()
				.collect(Collectors.counting());
		
		System.out.println(count1);
		
		long count2 = IntStream.of(10, 9, 7, 1, 20, 100, 50)
				.filter(C19Collect::even)
				.boxed()
				.count();
		
		System.out.println(count2);
	}
	
	private static boolean even(int n) {
		return n % 2 == 0;
	}
}










