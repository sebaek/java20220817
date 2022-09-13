package ch13.lecture.p01generic;

import java.util.ArrayList;
import java.util.Map;

public class C08Diamond {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		ArrayList<String> list2 = new ArrayList<>(); // 생략 가능
		
		ArrayList<Map<String, Integer>> list3 = new ArrayList<Map<String, Integer>>();
		ArrayList<Map<String, Integer>> list4 = new ArrayList<>();
	}
}
