package ch15.book.exercise.p11;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>((s1, s2) -> s1.score - s2.score);
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));

		Student student = treeSet.last();
		System.out.println("최고점수:" + student.score);
		System.out.println("아이디:" + student.id);
	}
}

class Student {
	public String id;
	public int score;

	Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
}
