package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: retrofit2.c */
public interface C48476c<R, T> {

    /* renamed from: retrofit2.c$a */
    public static abstract class C48477a {
        /* renamed from: a */
        public abstract C48476c<?, ?> mo80365a(Type type, Annotation[] annotationArr, C48517m mVar);

        /* renamed from: a */
        protected static Class<?> m150187a(Type type) {
            return C48522o.m150304a(type);
        }

        /* renamed from: a */
        protected static Type m150188a(int i, ParameterizedType parameterizedType) {
            return C48522o.m150307a(0, parameterizedType);
        }
    }

    /* renamed from: a */
    T mo80366a(C48475b<R> bVar);

    /* renamed from: a */
    Type mo80367a();
}
