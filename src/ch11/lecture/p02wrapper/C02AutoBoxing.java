package ch11.lecture.p02wrapper;

public class C02AutoBoxing {
	public static void main(String[] args) {
		int a = 3;
		// 기본타입을 참조타입으로 변경(boxing)
		Integer b = Integer.valueOf(a);
		
		// 기본타입을 참조타입으로 자동으로 변경(auto boxing)
		Integer c = a; // ok
		
		Object d = a;
		Object e = 99;
		
		Object[] arr = {"java", 3, true};
		
	}
}




