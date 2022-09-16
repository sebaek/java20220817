package ch15.book;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87); // auto boxing
		scores.add(new Integer(98)); // manual boxing
		
	}
}
