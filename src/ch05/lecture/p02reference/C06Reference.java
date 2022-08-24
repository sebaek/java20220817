package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] a = {9, 8};
		changeItems(a);
		
		System.out.println(a[0]);
	}
	
	public static void changeItems(int[] arr) {
		System.out.println(arr[0]);
		arr = new int[] {3, 4};
	}
}
