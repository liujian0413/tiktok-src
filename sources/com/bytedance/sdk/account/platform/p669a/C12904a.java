package com.bytedance.sdk.account.platform.p669a;

import com.bytedance.sdk.account.platform.api.C12906b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.account.platform.a.a */
public final class C12904a {

    /* renamed from: a */
    private static Map<Class, C12906b> f34118a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T extends C12906b> T m37574a(Class<T> cls) {
        return (C12906b) f34118a.get(cls);
    }

    /* renamed from: a */
    public static <T extends C12906b> void m37575a(Class<T> cls, C12906b bVar) {
        if (bVar != null) {
            f34118a.put(cls, bVar);
        }
    }
}
