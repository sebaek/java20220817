package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C03SortedSet {
	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<>();
		TreeSet<Integer> set2 = new TreeSet<>((a, b) -> b - a);
		
		set1.add(200);
		set1.add(50);
		set1.add(10);
		
		set2.add(200);
		set2.add(50);
		set2.add(10);
		
		System.out.println(set1);
		System.out.println(set2);
	}
}




