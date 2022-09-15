package p99leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);

		list.add(firstRow);

		for (int i = 1; i < numRows; i++) {
			List<Integer> next = new ArrayList<>();
			List<Integer> current = list.get(list.size() - 1);

			next.add(1);
			for (int j = 1; j < current.size(); j++) {
				next.add(current.get(j) + current.get(j - 1));
			}
			next.add(1);

			list.add(next);
		}
		return list;
	}
}
