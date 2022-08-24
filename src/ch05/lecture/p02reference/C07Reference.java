package ch05.lecture.p02reference;

public class C07Reference {
	public static void main(String[] args) {
		int[] a = {9, 8, 7};
		System.out.println(a[0]);
		
		a = changeItems(a);
		
		System.out.println(a[0]);//
	}
	
	public static int[] changeItems(int[] arr) {
		System.out.println(arr[0]);
		arr = new int[] {3, 4, 5};
		return arr;
	}
}
