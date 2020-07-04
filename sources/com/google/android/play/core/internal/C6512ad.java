package com.google.android.play.core.internal;

import android.os.Bundle;
import com.C1642a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.ad */
public final class C6512ad {
    /* renamed from: a */
    public static Bundle m20216a(List<String> list, List<String> list2) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList(list));
        }
        if (!list2.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList(list2));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        return bundle;
    }

    /* renamed from: a */
    public static <T> C6545z<T> m20217a(Object obj, String str, Class<T> cls) {
        return new C6545z<>(obj, m20223a(obj, str), cls);
    }

    /* renamed from: a */
    public static <R, P0> R m20218a(Class<?> cls, String str, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(m20224a(cls, str, (Class<?>[]) new Class[]{cls3}).invoke(null, new Object[]{p0}));
        } catch (Exception e) {
            throw new C6522ba(C1642a.m8034a("Failed to invoke static method %s on type %s", new Object[]{str, cls}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0, P1> R m20219a(Class<?> cls, String str, Class<R> cls2, Class<P0> cls3, P0 p0, Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(m20224a(cls, str, (Class<?>[]) new Class[]{cls3, cls4}).invoke(null, new Object[]{p0, p1}));
        } catch (Exception e) {
            throw new C6522ba(C1642a.m8034a("Failed to invoke static method %s on type %s", new Object[]{str, cls}), e);
        }
    }

    /* renamed from: a */
    public static <T> T m20220a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static <R, P0> R m20221a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(m20225a(obj, str, (Class<?>[]) new Class[]{cls2}).invoke(obj, new Object[]{p0}));
        } catch (Exception e) {
            throw new C6522ba(C1642a.m8034a("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0, P1, P2> R m20222a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(m20225a(obj, str, (Class<?>[]) new Class[]{cls2, cls3, cls4}).invoke(obj, new Object[]{p0, p1, p2}));
        } catch (Exception e) {
            throw new C6522ba(C1642a.m8034a("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: a */
    private static Field m20223a(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new C6522ba(C1642a.m8034a("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    /* renamed from: a */
    private static Method m20224a(Class<?> cls, String str, Class<?>... clsArr) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new C6522ba(C1642a.m8034a("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    /* renamed from: a */
    private static Method m20225a(Object obj, String str, Class<?>... clsArr) {
        return m20224a(obj.getClass(), str, clsArr);
    }

    /* renamed from: a */
    public static void m20226a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static X509Certificate[][] m20227a(String str) throws C17122c, IOException {
        return C6520at.m20250a(str);
    }

    /* renamed from: b */
    public static <T> C6545z m20228b(Object obj, String str, Class<T> cls) {
        return new C6545z(obj, m20223a(obj, str), cls, 0);
    }
}
