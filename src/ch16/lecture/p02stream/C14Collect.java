package ch16.lecture.p02stream;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C14Collect {
	public static void main(String[] args) {
		List<Integer> list1 = Stream.of(3, 4, 5, 1, 0, 3, 4, 5)
				.collect(Collectors.toList());

		System.out.println(list1);

		Set<Integer> set1 = Stream.of(3, 4, 5, 1, 0, 3, 4, 5)
				.collect(Collectors.toSet());

		System.out.println(set1);

		Set<String> set2 = Stream.of("java", "css", "spring", "html", "jsp", "java", "css")
				.collect(Collectors.toSet());

		System.out.println(set2);

		Set<String> set3 = Stream.of("java", "css", "spring", "html", "jsp", "java", "css")
				.collect(Collectors.toCollection(() -> new TreeSet<>()));

		System.out.println(set3);
	}
}





