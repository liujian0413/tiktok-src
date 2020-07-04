package com.squareup.wire;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WireFieldNoEnum {
    String adapter();

    String keyAdapter() default "";

    int label() default 1;

    boolean redacted() default false;

    int tag();
}
