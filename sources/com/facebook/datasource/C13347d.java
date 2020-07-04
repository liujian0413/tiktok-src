package com.facebook.datasource;

import com.facebook.common.internal.C13310j;

/* renamed from: com.facebook.datasource.d */
public final class C13347d {
    /* renamed from: a */
    public static <T> C13346c<T> m39076a(Throwable th) {
        C13357h h = C13357h.m39111h();
        h.mo32638a(th);
        return h;
    }

    /* renamed from: b */
    public static <T> C13310j<C13346c<T>> m39077b(final Throwable th) {
        return new C13310j<C13346c<T>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C13346c<T> mo29879b() {
                return C13347d.m39076a(th);
            }
        };
    }
}
