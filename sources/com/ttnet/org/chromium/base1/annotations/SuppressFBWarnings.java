package com.ttnet.org.chromium.base1.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface SuppressFBWarnings {
    String justification() default "";

    String[] value() default {};
}
