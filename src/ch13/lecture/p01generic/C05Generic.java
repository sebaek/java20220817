package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C05Generic {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("3");
//		list.add(6);
		list.add("6");
		
		String v1 = list.get(0);
		String v2 = list.get(1);
		
		System.out.println(v1);
		System.out.println(v2);
	}
}








