package ch13.lecture.p01generic;

public class C07Generic {

}

// 타입파라미터는 여러개 작성 가능
// 타입파라미터명 작성 관습 : 대문자 1글자 

class MyClass<T, U> {
	private T val1;
	private U val2;
	
	public void method1(T v) {
	}
	
	public void method2(U v) {
	}
	
	public T method3() {
		return val1;
	}
	
	public U method4() {
		return val2;
	}
}





