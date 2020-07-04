package com.bytedance.android.live.utility;

import com.bytedance.android.live.base.C2324b;
import com.taobao.android.dexposed.ClassUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.utility.c */
public final class C3596c {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, Object> f10777a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static <T extends C2324b> T m13172a(Class<T> cls) {
        T t = (C2324b) f10777a.get(cls);
        if (t != null) {
            return t;
        }
        try {
            C2324b bVar = (C2324b) m13173a(cls, "$$impl");
            try {
                m13174a(cls, (T) bVar);
            } catch (Exception unused) {
            }
            return bVar;
        } catch (Exception unused2) {
            return t;
        }
    }

    /* renamed from: a */
    public static <T extends C2324b> void m13174a(Class<T> cls, T t) {
        f10777a.put(cls, t);
    }

    /* renamed from: a */
    private static <T, C> T m13173a(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName.replace('.', '_'));
        sb.append(str);
        String sb2 = sb.toString();
        try {
            if (name.isEmpty()) {
                str2 = sb2;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(name);
                sb3.append(ClassUtils.PACKAGE_SEPARATOR);
                sb3.append(sb2);
                str2 = sb3.toString();
            }
            return Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder("cannot find implementation for ");
            sb4.append(cls.getCanonicalName());
            sb4.append(". ");
            sb4.append(sb2);
            sb4.append(" does not exist");
            throw new RuntimeException(sb4.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder sb5 = new StringBuilder("Cannot access the constructor");
            sb5.append(cls.getCanonicalName());
            throw new RuntimeException(sb5.toString());
        } catch (InstantiationException unused3) {
            StringBuilder sb6 = new StringBuilder("Failed to create an instance of ");
            sb6.append(cls.getCanonicalName());
            throw new RuntimeException(sb6.toString());
        }
    }
}
