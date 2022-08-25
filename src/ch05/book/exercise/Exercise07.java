package ch05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		// 가장 작은 값 구하기
		
		System.out.println("max:" + max);
		System.out.println("min:" + min);
	}
}







