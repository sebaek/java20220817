package ch15.book.exercise.p10;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		Student s1 = new Student("blue", 96);
		Student s2 = new Student("red", 96);
		treeSet.add(s1);
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		treeSet.add(s2);

		System.out.println(treeSet.size());
		System.out.println(s1.equals(s2));

		Student student = treeSet.last();
		System.out.println("최고점수:" + student.score);
		System.out.println("아이디:" + student.id);
	}
}

class Student implements Comparable<Student> {
	public String id;
	public int score;

	Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (score != other.score)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}
}
