package ch09.lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1 = v -> System.out.println(v * v);
		
		o1.accept(3); // 9 출력
		o1.accept(4); // 16 출력
		o1.accept(10); // 100 출력
		
		DoubleConsumer o2 = d -> System.out.println(d / 2);
		
		o2.accept(5); // 2.5 
		o2.accept(10); // 5.0
		o2.accept(7); // 3.5
	}
}









