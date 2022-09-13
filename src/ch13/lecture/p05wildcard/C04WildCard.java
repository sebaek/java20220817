package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C04WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(300);
		
		// ? super Type : LowerBounded Wildcard
		ArrayList<? super Integer> list2 = list1;
		list2.add(500);// x
	}
}
