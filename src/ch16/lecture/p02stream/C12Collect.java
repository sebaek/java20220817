package ch16.lecture.p02stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.range(1, 100)
				.parallel()
				.filter(n -> n % 2 == 0)
				.collect(() -> new ArrayList<>(), (r, e) -> r.add(e), (r1, r2) -> r1.addAll(r2));
		
		System.out.println(list1);
	}
}
