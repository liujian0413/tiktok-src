package com.bytedance.android.livesdk.action;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bytedance.android.livesdk.action.c */
public @interface C3867c {
    /* renamed from: a */
    String mo11408a();

    /* renamed from: b */
    ThreadMode mo11409b() default ThreadMode.POSTING;
}
