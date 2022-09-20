package ch16.lecture.p02stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C21GroupingBy {
	public static void main(String[] args) {
		Map<String, List<Integer>> map = IntStream.of(3, 5, 2, 4, 9, 10)
			.boxed()
			.collect(Collectors.groupingBy((e) -> (e % 2 == 0) ? "짝수" : "홀수"));
		
		
		System.out.println(map);
	}
}




