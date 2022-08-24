package ch05.book;

public class ArrayCreatByNewExample {
	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
	}
}
