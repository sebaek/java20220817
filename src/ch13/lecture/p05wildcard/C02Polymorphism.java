package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C02Polymorphism {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		
		ArrayList<Object> list2 = list1; // x
		list2.add(new Object());
	}
}
