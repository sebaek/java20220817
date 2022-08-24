package ch05.book;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		
//		sum1 += scores[0];
//		sum1 += scores[1];
//		sum1 += scores[2];
		
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("합:" + sum1);
		
		
		
		int sum2 = add(new int[] {83, 90, 87});
		
		System.out.println("합:" + sum2);
	}
	
	public static int add(int[] a) {
		int sum = 0;
		
//		sum += a[0];
//		sum += a[1];
//		sum += a[2];
		
		for (int i = 0; i < 3; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
}















