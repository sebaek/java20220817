package ch06.lecture.p11annotation;

import ch05.lecture.p04enum.Week;

public @interface MyAnnotation2 {
	String value() default ""; // element(attribute)
	int age() default 0;
	Week week() default Week.MONDAY;
	
	String[] names() default {};
}
