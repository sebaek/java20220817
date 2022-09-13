package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C08GuideLine {
	public static void main(String[] args) {
		// PECS 
		// Produce => extends
		// Consume => super
		
		// g"e"t => "e"xtends
		// p"u"t => s"u"per
		
		// in => extends
		// out => super
	}
	
	public static void method1(ArrayList<? extends Number> list) {
		Number n1 = list.get(0); // get, in, product
//		list.add(3); //put
	}
	
	public static void method2(ArrayList<? super Number> list) {
//		Number n1 = list.get(0); // x
		list.add(3); // put, out, consume
	}
	
}




