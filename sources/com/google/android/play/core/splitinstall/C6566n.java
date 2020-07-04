package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitinstall.n */
public final class C6566n {

    /* renamed from: a */
    private static final AtomicReference<C6567p> f18886a = new AtomicReference<>(null);

    /* renamed from: a */
    static C6567p m20393a() {
        return (C6567p) f18886a.get();
    }

    /* renamed from: a */
    public static void m20394a(C6567p pVar) {
        f18886a.compareAndSet(null, pVar);
    }
}
