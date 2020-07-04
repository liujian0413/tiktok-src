package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.internal.C13310j;
import com.facebook.imagepipeline.p716c.C13586q;

/* renamed from: com.bytedance.lighten.loader.b */
public final class C12148b implements C13310j<C13586q> {

    /* renamed from: a */
    private final ActivityManager f32367a;

    /* renamed from: b */
    private int f32368b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C13586q mo29879b() {
        C13586q qVar = new C13586q(m35378c(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return qVar;
    }

    /* renamed from: c */
    private int m35378c() {
        if (this.f32368b > 0) {
            return this.f32368b;
        }
        int min = Math.min(this.f32367a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
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

    public C12148b(ActivityManager activityManager, int i) {
        this.f32367a = activityManager;
        this.f32368b = i;
    }
}
