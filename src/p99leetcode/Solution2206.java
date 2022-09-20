package p99leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
	// stream api
	public boolean divideArray(int[] nums) {
		return Arrays.stream(nums)
				.boxed()
				.collect(Collectors.groupingBy((e) -> e, Collectors.counting()))
				.values()
				.stream()
				.allMatch(e -> e % 2 == 0);
	}

	// classic
	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.compute(num, (k, v) -> map.containsKey(k) ? v + 1 : 1);
		}

		java.util.Collection<Integer> values = map.values();

		for (Integer value : values) {
			if (value % 2 == 1) {
				return false;
			}
		}

		return true;
	}
}
