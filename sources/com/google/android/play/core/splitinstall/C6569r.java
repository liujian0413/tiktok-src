package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitinstall.r */
public final class C6569r {

    /* renamed from: a */
    private static final AtomicReference<C6571t> f18891a = new AtomicReference<>(null);

    /* renamed from: a */
    static C6571t m20399a() {
        return (C6571t) f18891a.get();
    }

    /* renamed from: a */
    public static void m20400a(C6571t tVar) {
        f18891a.compareAndSet(null, tVar);
    }
}
