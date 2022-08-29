package ch06.lecture.p06package;

//import static java.lang.Math.PI;
//import static java.lang.Math.random;
import static java.lang.Math.*;
import static java.lang.Integer.*;

public class C04StaticImport {
	public static void main(String[] args) {
		double r = Math.random();
		System.out.println(r);
		
		System.out.println(Math.PI);
		System.out.println(PI);
		
		System.out.println(random());
		
		System.out.println(MAX_VALUE);
		System.out.println(MIN_VALUE);
	}
}
