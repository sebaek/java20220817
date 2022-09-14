package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02List {
	public static void main(String[] args) {
		// 리스트 만드는 방법 1
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		list1.add("spring");
		
		System.out.println(list1);
		
		// 리스트 만드는 방법 2
		List<String> list2 = Arrays.asList("java", "css", "spring");
		System.out.println(list2);
	
		// 리스트 만드는 방법 3
		List<String> list3 = List.of("java", "css", "spring");
		System.out.println(list3);
		
		// 주의 2,3은 추가 불가능
		list1.add("jsp"); //ok
//		list2.add("jsp"); // x
//		list3.add("jsp"); // x
		
		// 주의 3은 변경도 불가능
		list1.set(0, "jsp");
		list2.set(0, "jsp");
//		list3.set(0, "jsp"); // x
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
}







