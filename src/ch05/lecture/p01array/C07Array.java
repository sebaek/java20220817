package ch05.lecture.p01array;

public class C07Array {
	public static void main(String[] args) {
		int[] arr1 = {-5, -4, -3};
		int[] arr2 = {4, 5, 6, 7};
		int[] arr3 = {300, 200, 100, 50, 40};
		
		int s1 = sumFirstLast(arr1);
		System.out.println(s1); // -8
		
		int s2 = sumFirstLast(arr2);
		System.out.println(s2); // 11
		
		int s3 = sumFirstLast(arr3);
		System.out.println(s3); // 340
		
		int s4 = sumFirstLast(new int[] {9, 8});
		System.out.println(s4); // 17
		
		System.out.println(sumFirstLast(new int[] {8, 7, 6, 5})); // 13
		System.out.println(sumFirstLast(new int[] {1000})); // 2000
		
		
	}
	
	public static int sumFirstLast(int[] a) {
		int first = a[0];
		int last = a[a.length - 1];
		
		int sum = first + last;
		
		return sum;
		
//		return a[0] + a[a.length - 1];
	}
}















