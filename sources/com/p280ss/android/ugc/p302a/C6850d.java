package com.p280ss.android.ugc.p302a;

import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.ss.android.ugc.a.d */
public class C6850d<T> {
    public T get(Class cls, Class cls2) {
        if (cls2 != null) {
            try {
                return cls2.newInstance();
            } catch (Exception unused) {
            }
        }
        if (cls == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("method ");
                sb.append(method.getName());
                sb.append(" is called");
                printStream.println(sb.toString());
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                Class returnType = method.getReturnType();
                if (returnType.isPrimitive()) {
                    return C6848b.m21294a(returnType);
                }
                return method.getDefaultValue();
            }
        });
    }
}
