package ch06.lecture.p11annotation;

import ch05.lecture.p04enum.Week;

public class C02Element {
	@MyAnnotation2(value = "coyote")
	private int i;
	
	@MyAnnotation2(value = "iceman")
	private int j;
	
	@MyAnnotation2("maverick") // value = 생략 가능
	private int k;
	
	@MyAnnotation2
	private int l;
	
	@MyAnnotation2(value = "iceman", age = 30)
	private int m;
	
	@MyAnnotation2(week = Week.TUESDAY)
	private int o;
	
	@MyAnnotation2(names = {"maverick", "phoenix"})
	private int p;
	
	@MyAnnotation2(names = {"rooster"})
	private int q;
	
	@MyAnnotation2(names = "rooster")
	private int r;
}





















