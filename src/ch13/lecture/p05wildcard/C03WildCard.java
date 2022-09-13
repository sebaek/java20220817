package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C03WildCard {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("maverick");
		list1.add("iceman");
		
		// ? : unbouned wildcard
		ArrayList<?> list2 = list1; //ok
		list2.add(""); // x
		list2.add(200); // x
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(200);
		
		ArrayList<?> list4 = list3;
		list4.add(300); // x
		list4.add(""); // x
		list4.add(new Object()); // x
		Object o1 = list4.get(0);
	}
}






