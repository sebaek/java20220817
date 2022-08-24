package p99codingbat;

public class Array1 {
	public int[] makePi() {
		// int[] a = {3, 1, 4};

		// return a;

		// int[] b;
		// b = new int[] {3, 1, 4};

		// return b;

		return new int[] { 3, 1, 4 };
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length > 0) {
			int first = nums[0];
			int last = nums[nums.length - 1];

			return first == last;
		}

		return false;
	}

	public boolean firstLast6(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];

		return first == 6 || last == 6;
	}

}
