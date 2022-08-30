package ch06.lecture.p09GetSet;

public class MyClass1 {
	private int age;
	
	// getter
	public int getAge() {
		return age;
	}
	
	// setter
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
}
