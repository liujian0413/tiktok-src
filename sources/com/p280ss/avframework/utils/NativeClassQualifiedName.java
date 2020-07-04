package com.p280ss.avframework.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.ss.avframework.utils.NativeClassQualifiedName */
public @interface NativeClassQualifiedName {
    String value();
}
