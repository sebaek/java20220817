package ch13.lecture.p01generic;

import java.util.Arrays;

public class C01ArrayList {
	public static void main(String[] args) {
		int[] arr = {3, 6, 9};
		
		int[] arr2 = new int[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		arr2[arr2.length-1] = 12;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
