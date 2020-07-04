package com.bytedance.retrofit2.p264b;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bytedance.retrofit2.b.j */
public @interface C6459j {
    /* renamed from: a */
    String mo15742a();

    /* renamed from: b */
    String mo15743b() default "";

    /* renamed from: c */
    boolean mo15744c() default false;
}
