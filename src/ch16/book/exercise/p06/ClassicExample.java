package ch16.book.exercise.p06;

import java.util.Arrays;
import java.util.List;

import ch16.book.exercise.p06.StreamExample.Member;

public class ClassicExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26));
		
		double avg = 0.0;
		
		for (Member member : list) {
			avg += member.getAge();
		}
		
		avg /= list.size();

		System.out.println("평균나이:" + avg);
	}

	static class Member {
		private String name;
		private int age;

		public Member(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}
	}
}
