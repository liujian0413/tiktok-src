package com.bytedance.android.livesdk.livebuild;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.livebuild.a */
public final class C8404a {

    /* renamed from: a */
    private static Map<Class, C8405b<?>> f23037a;

    static {
        C8406c.m25576a();
    }

    /* renamed from: a */
    public static <T> T m25573a(Class<T> cls) {
        if (f23037a != null && f23037a.containsKey(cls)) {
            C8405b bVar = (C8405b) f23037a.get(cls);
            if (bVar != null) {
                return bVar.mo21567a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m25574a(Class cls, C8405b bVar) {
        if (f23037a == null) {
            f23037a = new HashMap();
        }
        f23037a.put(cls, bVar);
    }
}
