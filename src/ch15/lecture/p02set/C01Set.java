package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// 아이템 (element) 추가
		set.add("ironman");
		set.add("captain");
		set.add("black");
		set.add("hulk");
		
		// element 수
		int size = set.size();
		System.out.println(size);
		
		// 중복 저장 할 수 없음
		System.out.println(set.add("hulk"));
		
		System.out.println(set.size());
		
		// 이미 있는 지 확인
		System.out.println(set.contains("captain"));
		System.out.println(set.contains("batman"));
		
		// 지우기
		System.out.println(set.remove("captain"));
		System.out.println(set.remove("superman"));
		
		System.out.println(set.size());
		
	}
}






