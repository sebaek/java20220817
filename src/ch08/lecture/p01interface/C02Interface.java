package ch08.lecture.p01interface;

import java.io.Serializable;

public class C02Interface {
	public static void main(String[] args) {
		String s1 = "maverick";
		
		Object o1 = s1;
		Serializable o2 = s1;
		CharSequence o3 = s1;
		Comparable<String> o4 = s1;
		
		System.out.println(s1 instanceof Object); // true
		System.out.println(s1 instanceof Serializable); // true
		System.out.println(s1 instanceof CharSequence); // true
		System.out.println(s1 instanceof Comparable<?>); // true
		
		System.out.println(o1 instanceof Object); // true
		System.out.println(o1 instanceof Serializable); // true
		System.out.println(o1 instanceof CharSequence); // true
		System.out.println(o1 instanceof Comparable<?>); // true
		
		System.out.println(o2 instanceof Object); // true
		System.out.println(o2 instanceof Serializable); // true
		System.out.println(o2 instanceof CharSequence); // true
		System.out.println(o2 instanceof Comparable<?>); // true
		
		System.out.println(o3 instanceof Object); // true
		System.out.println(o3 instanceof Serializable); // true
		System.out.println(o3 instanceof CharSequence); // true
		System.out.println(o3 instanceof Comparable<?>); // true
		
		System.out.println(o4 instanceof Object); // true
		System.out.println(o4 instanceof Serializable); // true
		System.out.println(o4 instanceof CharSequence); // true
		System.out.println(o4 instanceof Comparable<?>); // true
	}
}







