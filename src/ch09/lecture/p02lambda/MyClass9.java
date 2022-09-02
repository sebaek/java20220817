package ch09.lecture.p02lambda;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class MyClass9 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		setAll(a1, i -> i);
		
		System.out.println(Arrays.toString(a1)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		setAll(a1, i -> i+1);
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> i*2);
		System.out.println(Arrays.toString(a1));
		
		// a1 : [10, 9, ... , 1]
		setAll(a1, p -> a1.length - p);
		System.out.println(Arrays.toString(a1));
		
		// a1 : [9, 8, 7, ~ , 0]
		setAll(a1, p -> a1.length - p - 1);
		System.out.println(Arrays.toString(a1));
		
		
		
	}
	
	public static void setAll(int[] arr, IntUnaryOperator gen) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = gen.applyAsInt(i);
		}
	}
}








