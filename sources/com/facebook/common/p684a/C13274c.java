package com.facebook.common.p684a;

/* renamed from: com.facebook.common.a.c */
public final class C13274c implements C13273b {

    /* renamed from: a */
    private static C13274c f35165a;

    private C13274c() {
    }

    /* renamed from: a */
    public static synchronized C13274c m38814a() {
        C13274c cVar;
        synchronized (C13274c.class) {
            if (f35165a == null) {
                f35165a = new C13274c();
            }
            cVar = f35165a;
        }
        return cVar;
    }
}
