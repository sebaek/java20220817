package ch05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int[] array = {-1, -5, -3, -8, -2};
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		// 가장 작은 값 구하기
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("max:" + max); // 8
		System.out.println("min:" + min); // 1
	}
}







