package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.primitives.e */
public final class C18147e {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f49511a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f49512b;

    /* renamed from: a */
    public static Set<Class<?>> m59985a() {
        return f49512b.keySet();
    }

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m59986a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m59986a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m59986a(hashMap, hashMap2, Character.TYPE, Character.class);
        m59986a(hashMap, hashMap2, Double.TYPE, Double.class);
        m59986a(hashMap, hashMap2, Float.TYPE, Float.class);
        m59986a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m59986a(hashMap, hashMap2, Long.TYPE, Long.class);
        m59986a(hashMap, hashMap2, Short.TYPE, Short.class);
        m59986a(hashMap, hashMap2, Void.TYPE, Void.class);
        f49511a = Collections.unmodifiableMap(hashMap);
        f49512b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static <T> Class<T> m59984a(Class<T> cls) {
        C17439m.m57962a(cls);
        Class<T> cls2 = (Class) f49511a.get(cls);
        if (cls2 == null) {
            return cls;
        }
        return cls2;
    }

    /* renamed from: b */
    public static <T> Class<T> m59987b(Class<T> cls) {
        C17439m.m57962a(cls);
        Class<T> cls2 = (Class) f49512b.get(cls);
        if (cls2 == null) {
            return cls;
        }
        return cls2;
    }

    /* renamed from: a */
    private static void m59986a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
