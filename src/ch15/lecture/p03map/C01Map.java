package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C01Map {
	public static void main(String[] args) {
		// Map
		// (key, value) 쌍(entry)으로 저장
		// key는 중복될 수 없음
		// key는 하나의 value에 매핑됨
		
		Map<String, String> map = new HashMap<>();
		
		// entry 추가
		map.put("jimin", "bts");
		map.put("hangman", "topgun");
		map.put("batman", "dc");
		map.put("captain", "marvel");
		map.put("rm", "bts");
		map.put("jimin", "hot"); // 이미 있는 키,밸류 덮어 씀
		
		// entry 수 얻기
		int size = map.size();
		System.out.println(size);
		
		
		// 지우기
		map.remove("batman");
		System.out.println(map.size());
		map.remove("coyote");
		System.out.println(map.size());
		
		// 이미 있는 키인가?
		boolean hasJimin = map.containsKey("jimin");
		System.out.println(hasJimin);
		System.out.println(map.containsKey("batman"));
		
		// value 얻기
		String val1 = map.get("jimin");
		System.out.println(val1);
		System.out.println(map.get("rm"));
		System.out.println(map.get("batman"));
		
	}
}










