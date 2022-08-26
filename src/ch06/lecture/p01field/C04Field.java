package ch06.lecture.p01field;

public class C04Field {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3();
		MyClass3 o2 = new MyClass3();
		
		System.out.println(o1.color);
		System.out.println(o2.color);
		
		o1.color = "red";
		
		System.out.println(o1.color);
		System.out.println(o2.color);
		
		System.out.println(o1.name); // null
		System.out.println(o1.age); // 0
		System.out.println(o1.hasCar); // false
		
		
	}
}






