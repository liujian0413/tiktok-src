package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.internal.h */
public final class C6699h {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f19154a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f19155b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m20723a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m20723a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m20723a(hashMap, hashMap2, Character.TYPE, Character.class);
        m20723a(hashMap, hashMap2, Double.TYPE, Double.class);
        m20723a(hashMap, hashMap2, Float.TYPE, Float.class);
        m20723a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m20723a(hashMap, hashMap2, Long.TYPE, Long.class);
        m20723a(hashMap, hashMap2, Short.TYPE, Short.class);
        m20723a(hashMap, hashMap2, Void.TYPE, Void.class);
        f19154a = Collections.unmodifiableMap(hashMap);
        f19155b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static <T> Class<T> m20722a(Class<T> cls) {
        Class<T> cls2 = (Class) f19154a.get(C6619a.m20527a(cls));
        if (cls2 == null) {
            return cls;
        }
        return cls2;
    }

    /* renamed from: a */
    public static boolean m20724a(Type type) {
        return f19154a.containsKey(type);
    }

    /* renamed from: a */
    private static void m20723a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
