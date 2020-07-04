package com.bytedance.android.livesdkapi.p458j;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.android.livesdkapi.j.c */
public final class C9496c {

    /* renamed from: com.bytedance.android.livesdkapi.j.c$a */
    static class C9497a<T> implements InvocationHandler {

        /* renamed from: a */
        private WeakReference<T> f25987a;

        C9497a(T t) {
            this.f25987a = new WeakReference<>(t);
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2 = this.f25987a.get();
            if (obj2 == null) {
                return null;
            }
            return method.invoke(obj2, objArr);
        }
    }

    /* renamed from: a */
    public static <T> T m28034a(T t) {
        if (t == null) {
            return null;
        }
        try {
            Class cls = t.getClass();
            Class[] interfaces = cls.getInterfaces();
            if (interfaces != null && interfaces.length > 0) {
                t = Proxy.newProxyInstance(cls.getClassLoader(), interfaces, new C9497a(t));
            }
        } catch (Throwable unused) {
        }
        return t;
    }
}
