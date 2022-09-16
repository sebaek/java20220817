package p99leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
	// Set 사용
	public int countConsistentStrings(String allowed, String[] words) {
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < allowed.length(); i++) {
			set.add(allowed.charAt(i));
		}

		int cnt = 0;
		for (String word : words) {

			int i = 0;
			for (; i < word.length(); i++) {
				// word의 문자가 set에 모두 있는가? 하나라도 없으면 cnt 하지 않겠다
				if (!set.contains(word.charAt(i))) {
					break;
				}
			}

			if (i == word.length()) {
				cnt++;
			}
		}

		return cnt;
	}

	// 정규표현식 활용
	public int countConsistentStrings(String allowed, String[] words) {
		String pattern = "[" + allowed + "]+";

		int cnt = 0;
		for (String word : words) {
			if (word.matches(pattern)) {
				cnt++;
			}
		}

		return cnt;
	}

	// if, for 사용
	public int countConsistentStrings(String allowed, String[] words) {
		int cnt = 0;
		for (String word : words) {
			if (consistOf(allowed, word)) {
				cnt++;
			}
		}

		return cnt;
	}

	private boolean consistOf(String allowed, String word) {
		for (int i = 0; i < word.length(); i++) {
			if (!hasChar(allowed, word.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	private boolean hasChar(String allowed, char c) {
		for (int i = 0; i < allowed.length(); i++) {
			if (allowed.charAt(i) == c) {
				return true;
			}
		}

		return false;
	}
}