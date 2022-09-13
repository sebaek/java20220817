package ch13.lecture.p02inherit;

public class C01Generic {

}

class MyClass1<T> {
	
}

// 하위 타입의 타입 파라미터 갯수는 상위 타입과 같거나 많게
class MyClass2<T> extends MyClass1<T> {
	
}

class MyClass3<T, U> extends MyClass1<T> {
	
}

// 상위 타입의 타입 파라미터 명시 가능
class MyClass4 extends MyClass1<String> {
	
}








