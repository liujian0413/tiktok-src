package retrofit2.p363b;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: retrofit2.b.h */
public @interface C7732h {
    /* renamed from: a */
    String mo20422a();

    /* renamed from: b */
    String mo20423b() default "";

    /* renamed from: c */
    boolean mo20424c() default false;
}
