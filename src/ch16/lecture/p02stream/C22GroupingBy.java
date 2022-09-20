package ch16.lecture.p02stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C22GroupingBy {
	public static void main(String[] args) {
		Map<String, List<Integer>> map = Stream.of(3, 4, 5, 6, 7, 8, 9, 10)
			.collect(Collectors.groupingBy((e) -> (e % 2) == 0 ? "짝수" : "홀수"));
		
		System.out.println(map);
		
		Map<String, IntSummaryStatistics> map2 = Stream.of(3, 4, 5, 6, 7, 8, 9, 10)
			.collect(Collectors.groupingBy((e) -> (e % 2) == 0 ? "짝수" : "홀수"
				, Collectors.summarizingInt(Integer::intValue)));
		
		System.out.println("짝수들의 합 " + map2.get("짝수").getSum());
		System.out.println("홀수들의 합 " + map2.get("홀수").getSum());
		
		Map<String, Long> map3 = Stream.of(3, 4, 5, 6, 7, 8, 9, 10, 11)
				.collect(Collectors.groupingBy((e) -> (e % 2) == 0 ? "짝수" : "홀수"
					, Collectors.counting()));
		
		System.out.println(map3);
		
	}
}







