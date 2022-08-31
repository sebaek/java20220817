package ch07.lecture.p02polymorphism;

public class C07Polymorphism {
	public static void main(String[] args) {
		SuperClass4 o1 = new SuperClass4();
		o1.method1();
		o1.method2();
		o1.method3();
		
		SubClass41 o2 = new SubClass41();
		o2.method1();
		o2.method2();
		o2.method3();
		
		SuperClass4 o3 = new SubClass41();
		o3.method1();
		o3.method2();
		o3.method3();
		
		SuperClass4 o4 = new SubClass42();
		o4.method1();
		o4.method2();
		o4.method3();
		
		someMethod1(new SubClass41());
		
		someMethod2(new SuperClass4());
		
		someMethod2(new SubClass41());
		someMethod2(new SubClass42());
	}
	
	public static void someMethod1(SubClass41 o) {
		System.out.println("someMEthod1 실행");
		
		o.method1();
		o.method2();
		o.method3();
	}
	
	public static void someMethod2(SuperClass4 o) {
		System.out.println("#######someMethod2");
		
		o.method1();
		o.method2();
		o.method3();
	}
}













