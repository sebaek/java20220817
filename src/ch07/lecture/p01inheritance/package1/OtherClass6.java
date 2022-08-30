package ch07.lecture.p01inheritance.package1;

public class OtherClass6 {
	public void someMethod() {
		SuperClass6 o1 = new SuperClass6();
//		o1.privateMethod(); //x
		o1.packagePrivateMethod(); // ok
		o1.protectedMethod(); // ok
		o1.publicMethod(); // ok
	}
}
