package com.facebook.cache.common;

/* renamed from: com.facebook.cache.common.e */
public final class C13269e implements CacheEventListener {

    /* renamed from: a */
    private static C13269e f35163a;

    private C13269e() {
    }

    /* renamed from: a */
    public static synchronized C13269e m38808a() {
        C13269e eVar;
        synchronized (C13269e.class) {
            if (f35163a == null) {
                f35163a = new C13269e();
            }
            eVar = f35163a;
        }
        return eVar;
    }
}
