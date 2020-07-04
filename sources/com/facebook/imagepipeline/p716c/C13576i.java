package com.facebook.imagepipeline.p716c;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.internal.C13310j;

/* renamed from: com.facebook.imagepipeline.c.i */
public class C13576i implements C13310j<C13586q> {

    /* renamed from: a */
    private final ActivityManager f35984a;

    /* renamed from: a */
    public C13586q mo29879b() {
        C13586q qVar = new C13586q(m39962c(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return qVar;
    }

    /* renamed from: c */
    private int m39962c() {
        int min = Math.min(this.f35984a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    public C13576i(ActivityManager activityManager) {
        this.f35984a = activityManager;
    }
}
