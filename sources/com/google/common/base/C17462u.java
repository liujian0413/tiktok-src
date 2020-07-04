package com.google.common.base;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.common.base.u */
public final class C17462u {

    /* renamed from: a */
    public static final Object f48424a;

    /* renamed from: b */
    public static final Method f48425b;

    /* renamed from: c */
    public static final Method f48426c;

    static {
        Method method;
        Object a = m58020a();
        f48424a = a;
        Method method2 = null;
        if (a == null) {
            method = null;
        } else {
            method = m58025b();
        }
        f48425b = method;
        if (f48424a != null) {
            method2 = m58027c();
        }
        f48426c = method2;
    }

    /* renamed from: a */
    private static Object m58020a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Method m58025b() {
        return m58021a("getStackTraceElement", (Class<?>[]) new Class[]{Throwable.class, Integer.TYPE});
    }

    /* renamed from: c */
    private static Method m58027c() {
        try {
            Method a = m58021a("getStackTraceDepth", (Class<?>[]) new Class[]{Throwable.class});
            if (a == null) {
                return null;
            }
            a.invoke(m58020a(), new Object[]{new Throwable()});
            return a;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static void m58028c(Throwable th) {
        if (th != null) {
            m58022a(th);
        }
    }

    /* renamed from: b */
    public static String m58024b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static void m58022a(Throwable th) {
        C17439m.m57962a(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* renamed from: a */
    public static <X extends Throwable> void m58023a(Throwable th, Class<X> cls) throws Throwable {
        m58029c(th, cls);
        m58028c(th);
    }

    /* renamed from: a */
    private static Method m58021a(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static <X extends Throwable> void m58029c(Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            m58026b(th, cls);
        }
    }

    /* renamed from: b */
    private static <X extends Throwable> void m58026b(Throwable th, Class<X> cls) throws Throwable {
        C17439m.m57962a(th);
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
