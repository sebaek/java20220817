package p99codingbat;

public class Sum13 {
	public static void main(String[] args) {
		int[] a1 = {1, 2, 13, 2, 1, 13};
		System.out.println(sum13(a1));
	}

	public static int sum13(int[] nums) {
		int sum = 0;

		int before = 0;
		for (int num : nums) {
			if (num != 13 && before != 13) {
				sum += num;
			}
			before = num;
		}

		return sum;
	}
}
