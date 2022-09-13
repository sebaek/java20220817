package ch13.lecture.p05wildcard;

import java.util.ArrayList;
import java.util.List;

public class C01Polymorphism {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("iceman");
		list1.add("goose");
		
		List<String> list2 = list1;
		list2.add("maverick");
		list2.add("rooster");
		
		System.out.println(list2);
		
	}
}








