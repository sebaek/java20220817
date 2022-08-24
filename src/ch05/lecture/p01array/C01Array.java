package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		// array : 여러 값을 저장하는 공간
		// 타입[]
		
		int[] arr1; // arr1배열이 저장하는 값의 타입은 int
		double[] arr2; // arr2배열이 저장하는 값의 타입은 double
		String[] arr3; // arr3배열이 저장하는 값의 타입의 String
		
		int[] arr4;
		arr4 = new int[5]; // int 값 5개 저장할 공간 생성
		
		arr4[0] = 10; // index 활용해서 값 저장
		arr4[1] = 11;
		arr4[2] = 99;
		arr4[3] = 100;
		arr4[4] = 200;
//		arr4[5] = 300; // 5번 인덱스는 없음
		
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		System.out.println(arr4[4]);
		
		int a = arr4[4];
		System.out.println(a);
		
	}
}






