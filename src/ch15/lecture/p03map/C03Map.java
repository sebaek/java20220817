package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C03Map {
	public static void main(String[] args) {
		// Map 만들기
		Map<String, String> map1 = new HashMap<>();
		map1.put("seoul", "korea");
		map1.put("busan", "korea");
		map1.put("osaka", "japan");
		map1.put("newyork", "us");
		
		System.out.println(map1);
		
		// of 메소드 사용
		Map<String, String> map2 
		= Map.of("seoul", "korea", 
				"busan", "korea", 
				"osaka", "japan", 
				"newyork", "us");
		
//		map2.put("london", "uk");
//		map2.put("busan", "china");
//		map2.remove("osaka");
		
		System.out.println(map2.size());
		System.out.println(map2.containsKey("seoul"));
		System.out.println(map2);
		
	}
}






