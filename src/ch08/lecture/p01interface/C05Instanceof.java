package ch08.lecture.p01interface;

import java.io.Serializable;

public class C05Instanceof {

	public static void main(String[] args) {
		Object s1 = "topgun";
		
		System.out.println(s1 instanceof String); // true
		System.out.println(s1 instanceof Serializable); // true
		System.out.println(s1 instanceof Comparable<?>); // true
		System.out.println(s1 instanceof CharSequence); // true
		System.out.println(s1 instanceof Object); // true
		System.out.println(s1 instanceof StringBuilder); // false
		
	}
}
