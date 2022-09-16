package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02Map {
	public static void main(String[] args) {
		// 전체 entry 탐색
		
		Map<String, String> map = new HashMap<>();
		map.put("korea", "seoul");
		map.put("japan", "tokyo");
		map.put("us", "new york");
		map.put("uk", "london");
		map.put("france", "paris");
		
		// keySet 이용
		System.out.println("keySet 이용");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String val = map.get(key);
			System.out.println(key + ":" + val);
		}
		System.out.println();
		
		// EntrySet 이용
		System.out.println("EntrySet 이용");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println();
		
		// forEach 메소드 사용
		System.out.println("forEach 메소드 사용");
		map.forEach((k, v) -> System.out.println(k + ":" + v));
	}
}







