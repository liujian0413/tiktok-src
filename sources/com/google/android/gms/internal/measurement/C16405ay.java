package com.google.android.gms.internal.measurement;

import android.os.Build.VERSION;

/* renamed from: com.google.android.gms.internal.measurement.ay */
public final class C16405ay {
    /* renamed from: a */
    public static int m53460a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException unused) {
            C16415bh.m53481a("Invalid version number", VERSION.SDK);
            return 0;
        }
    }
}
