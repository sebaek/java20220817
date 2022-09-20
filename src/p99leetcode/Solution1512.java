package p99leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1512 {
	// stream api
	public int numIdenticalPairs(int[] nums) {
		return Arrays.stream(nums)
				.boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.values()
				.stream()
				.mapToInt(n -> n.intValue())
				.map(n -> n * (n - 1) / 2)
				.sum();
	}

	// classic
	public int numIdenticalPairs(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			if (map.containsKey(num)) {
				// 이미 있었으면
				Integer val = map.get(num);
				map.put(num, val + 1);
			} else {
				// 처음
				map.put(num, 1);
			}
		}

		int result = 0;

		for (Integer n : map.values()) {
			Integer r = (n - 1) * n / 2;
			result += r;
		}

		return result;
	}
}