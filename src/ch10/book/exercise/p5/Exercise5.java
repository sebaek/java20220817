package ch10.book.exercise.p5;

public class Exercise5 {
	public void method1() throws NumberFormatException, ClassNotFoundException {

	}
	// 보기4
	public void method5() {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 보기3
	public void method4() {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 보기2
	public void method3() throws Exception {
		method1();
	}
	
	// 보기1
	public void method2() {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
