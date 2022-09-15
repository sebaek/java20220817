package p99leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);

		// 가장 작은 차이 구하기
		int minDiff = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			int diff = arr[i] - arr[i - 1];
			minDiff = Math.min(diff, minDiff);
		}

		List<List<Integer>> result = new ArrayList<>();

		for (int i = 1; i < arr.length; i++) {
			int diff = arr[i] - arr[i - 1];

			if (diff == minDiff) {
				List<Integer> pair = new ArrayList<>();
				pair.add(arr[i - 1]);
				pair.add(arr[i]);

				result.add(pair);
			}
		}

		return result;
	}
}