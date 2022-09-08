package ch06.lecture.p11annotation;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Target;

//@Target(value = { ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Target(value = {TYPE, FIELD, CONSTRUCTOR, METHOD, PARAMETER, LOCAL_VARIABLE})
public @interface MyAnnotation3 {

}
