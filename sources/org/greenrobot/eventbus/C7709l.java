package org.greenrobot.eventbus;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: org.greenrobot.eventbus.l */
public @interface C7709l {
    /* renamed from: a */
    ThreadMode mo20400a() default ThreadMode.POSTING;

    /* renamed from: b */
    boolean mo20401b() default false;

    /* renamed from: c */
    int mo20402c() default 0;
}
