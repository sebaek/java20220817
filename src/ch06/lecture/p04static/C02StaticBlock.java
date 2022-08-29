package ch06.lecture.p04static;

public class C02StaticBlock {
	public static void main(String[] args) {
		MyClass2 o1 = new MyClass2("maverick");
		System.out.println(o1.name);
		
		System.out.println(MyClass2.company);
		System.out.println(MyClass2.rank);
	}
}
