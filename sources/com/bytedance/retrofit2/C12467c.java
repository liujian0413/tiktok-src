package com.bytedance.retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.c */
public interface C12467c<T> {

    /* renamed from: com.bytedance.retrofit2.c$a */
    public static abstract class C12468a {
        /* renamed from: a */
        public abstract C12467c<?> mo30455a(Type type, Annotation[] annotationArr, C12516p pVar);

        /* renamed from: a */
        protected static Class<?> m36282a(Type type) {
            return C12536v.m36429a(type);
        }

        /* renamed from: a */
        protected static Type m36283a(int i, ParameterizedType parameterizedType) {
            return C12536v.m36432a(0, parameterizedType);
        }
    }

    /* renamed from: a */
    <R> T mo30453a(C12466b<R> bVar);

    /* renamed from: a */
    Type mo30454a();
}
