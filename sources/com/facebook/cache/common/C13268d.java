package com.facebook.cache.common;

/* renamed from: com.facebook.cache.common.d */
public final class C13268d implements CacheErrorLogger {

    /* renamed from: a */
    private static C13268d f35162a;

    private C13268d() {
    }

    /* renamed from: a */
    public static synchronized C13268d m38807a() {
        C13268d dVar;
        synchronized (C13268d.class) {
            if (f35162a == null) {
                f35162a = new C13268d();
            }
            dVar = f35162a;
        }
        return dVar;
    }
}
