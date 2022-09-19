package ch16.book.exercise.p05;

import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		
		
		Stream.of("This is a java book"
				, "Lambda Expressions"
				, "Java8 suports lambda expressions")
			.filter((s) -> s.toUpperCase().contains("java".toUpperCase()))
			.forEach(e -> System.out.println(e));
		
		
	}
}
