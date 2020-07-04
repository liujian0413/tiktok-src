package com.google.android.gms.common.internal;

import android.os.Looper;

/* renamed from: com.google.android.gms.common.internal.c */
public final class C15230c {
    /* renamed from: a */
    public static void m44251a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    /* renamed from: a */
    public static void m44252a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    public static void m44253b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException(str);
        }
    }
}
