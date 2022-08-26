package ch06.lecture.p01field;

public class C03Field {
	public static void main(String[] args) {
		MyClass2 o1 = new MyClass2();
		
		o1.name = "java";
		o1.color = "blue";
		o1.age = 90;
		o1.score = 3.14;
		
		System.out.println(o1.name);
		System.out.println(o1.color);
		System.out.println(o1.age);
		System.out.println(o1.score);
		
		MyClass2 o2 = new MyClass2();
		
		o2.name = "maverick";
		o2.color = "black";
		o2.age = 50;
		o2.score = 99.9;
		
		System.out.println(o2.name);
		System.out.println(o2.color);
		System.out.println(o2.age);
		System.out.println(o2.score);
		
		MyClass2 o3 = o1;
		
		System.out.println(o3.name);
		System.out.println(o3.score);
	}
}






