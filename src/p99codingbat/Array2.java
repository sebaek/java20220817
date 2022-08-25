package p99codingbat;

public class Array2 {
	public int sum67(int[] nums) {
		int sum = 0;

		boolean stop = false;

		for (int num : nums) {
			if (num == 6) {
				stop = true;
			}

			if (!stop) {
				sum += num;
			}

			if (num == 7) {
				stop = false;
			}
		}

		return sum;
	}

	public int sum13(int[] nums) {
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

	public int centeredAverage(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;

		// max, min, sum
		for (int num : nums) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			sum += num;
		}

		sum = sum - max - min;

		return sum / (nums.length - 2);
	}

	public int bigDiff(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int num : nums) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}

		return max - min;
	}

	public int countEvens(int[] nums) {
		int cnt = 0;

		for (int num : nums) {
			if ((num % 2) == 0) {
				cnt++;
			}
		}

		return cnt;
	}
}
