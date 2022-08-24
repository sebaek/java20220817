package p99codingbat;

public class Array1 {
	public int[] rotateLeft3(int[] nums) {
		// int[] res = {nums[1], nums[2], nums[0]};

		// return res;

		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;

		return nums;
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public boolean commonEnd(int[] a, int[] b) {
		boolean sameFirst = a[0] == b[0];
		boolean sameLast = a[a.length - 1] == b[b.length - 1];

		return sameFirst || sameLast;
	}

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
