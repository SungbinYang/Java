package me.sungbin;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface AnotherAnnotation {

    String value() default "sungbin";

    int number() default 100;
}
