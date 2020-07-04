package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public final class C15325h implements C15322e {

    /* renamed from: a */
    private static final C15325h f39595a = new C15325h();

    /* renamed from: d */
    public static C15322e m44574d() {
        return f39595a;
    }

    /* renamed from: a */
    public final long mo38684a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo38685b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo38686c() {
        return System.nanoTime();
    }

    private C15325h() {
    }
}
