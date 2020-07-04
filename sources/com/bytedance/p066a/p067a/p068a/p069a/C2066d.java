package com.bytedance.p066a.p067a.p068a.p069a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bytedance.a.a.a.a.d */
public @interface C2066d {
    /* renamed from: a */
    String mo7718a();

    /* renamed from: b */
    int mo7719b() default 0;

    /* renamed from: c */
    long mo7720c() default 0;

    /* renamed from: d */
    double mo7721d() default 0.0d;

    /* renamed from: e */
    float mo7722e() default 0.0f;

    /* renamed from: f */
    boolean mo7723f() default false;

    /* renamed from: g */
    String mo7724g() default "";
}
