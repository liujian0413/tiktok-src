package com.p280ss.avframework.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: com.ss.avframework.utils.CalledByNative */
public @interface CalledByNative {
    String value() default "";
}
