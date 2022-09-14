package ch15.lecture.p01list;

import java.util.Iterator;
import java.util.List;

public class C03List {
	public static void main(String[] args) {
		// 모든 아이템 탐색
		List<String> list1 = List.of("maverick", "iceman", "rooster", "goose");
		
		System.out.println("일반 for");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("향상된 for");
		for (String item : list1) {
			System.out.println(item);
		}
		
		System.out.println("forEach 메소드");
		list1.forEach((e) -> System.out.println(e));
		
		System.out.println("iterator 사용");
		Iterator<String> iterator = list1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}







