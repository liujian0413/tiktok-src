package com.p280ss.android.ugc.dex.maindexslimming.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: com.ss.android.ugc.dex.maindexslimming.annotation.MainDexIgnore */
public @interface MainDexIgnore {
    int value() default 2317;
}
