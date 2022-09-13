package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C04ArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add("6");
	
		int v1 = (Integer) list.get(0);
		int v2 = (Integer) list.get(1);
		
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println("프로그램 종료.");
	}
}
