package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C05PolyMorphism {
	public static void main(String[] args) {
		String[] arr1 = new String[3];
		arr1[0] = "bob";
		
		Scanner[] arr2 = new Scanner[3];
		arr2[0] = new Scanner("");
		
		Object[] arr3 = new Object[3];
		arr3[0] = new Object();
		arr3[1] = "iceman";
		arr3[2] = new Scanner("");
	}
}






