package ch16.lecture.p02stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C18ConstructorReference {
	public static void main(String[] args) {
		Set<String> set3 = Stream.of("java", "css", "spring", "html", "jsp", "java", "css")
				.collect(Collectors.toCollection(() -> new TreeSet<>()));

		System.out.println(set3);
		
		Set<String> set4 = Stream.of("java", "css", "spring", "html", "jsp", "java", "css")
				.collect(Collectors.toCollection(TreeSet::new));

		System.out.println(set4);
	}
}
