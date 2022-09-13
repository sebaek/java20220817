package ch13.lecture.p03bound;

public class C01Bound {
	public static void main(String[] args) {
		MyClass1<Object> o1 = new MyClass1<>();
		MyClass1<String> o2 = new MyClass1<>();
		MyClass1<Number> o3 = new MyClass1<>();
		MyClass1<Integer> o4 = new MyClass1<>();
		
		MyClass2<Number> o5 = new MyClass2<>();
		MyClass2<Integer> o6 = new MyClass2<>();
		MyClass2<Double> o7 = new MyClass2<>();
		
		MyClass2<String> o8 = new MyClass2<>();// x
		MyClass2<Object> o9 = new MyClass2<>();// x
	}
}

// 제한된 타입 파라미터
// bounded type parameter
class MyClass2<T extends Number> {
	public void method1(T p) {
		p.doubleValue();
		p.intValue();
		p.byteValue();
	}
}

class MyClass1<T> {
	public void method1(T p) {
		p.toString();
		p.equals(null);
		p.hashCode();
		
		Number n = (Number) p;
		n.doubleValue(); // x
	}
}







