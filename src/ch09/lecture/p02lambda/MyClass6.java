package ch09.lecture.p02lambda;

public class MyClass6 {
	public static void main(String[] args) {
		MyInterface6 o1 = () -> {
			int d = (int) (Math.random() * 6) + 1; 
			return d;
		};
		
		int n1 = o1.method();
		System.out.println(n1);
		System.out.println(o1.method());
		
		MyInterface6 o2 = () -> {
			return (int) (Math.random() * 6) + 1;
		};
		System.out.println(o2.method());
		
		MyInterface6 o3 = () -> (int) (Math.random() * 6) + 1;
		System.out.println(o3.method());
		
	}
}

interface MyInterface6 {
	int method();
}






