package ch15.book.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // 최고점수 아이디
		int maxScore = 0; // 최고점수
		int totalScore = 0; // 점수합
		
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			Integer value = map.get(key);
			
			totalScore += value;
			
			if (value > maxScore) {
				maxScore = value;
				name = key;
			}
		}
		
		System.out.println("최고아이디:" + name);
		System.out.println("최고점수:" + maxScore);
		System.out.println("합:" + totalScore);
		System.out.println("평균:" + (totalScore / (double) map.size()));
	}
}


















