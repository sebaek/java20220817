package p99leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		for (int candy : candies) {
			max = Math.max(max, candy);
		}

		List<Boolean> list = new ArrayList<>();
		for (int candy : candies) {
			list.add((candy + extraCandies) >= max);
		}

		return list;
	}
}
