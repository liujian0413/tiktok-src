package com.bytedance.lighten.loader;

import com.facebook.common.internal.C13310j;
import com.facebook.imagepipeline.p716c.C13586q;

/* renamed from: com.bytedance.lighten.loader.h */
public final class C12155h implements C13310j<C13586q> {

    /* renamed from: a */
    private int f32392a;

    public C12155h() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C13586q mo29879b() {
        int c = m35392c();
        C13586q qVar = new C13586q(c, Integer.MAX_VALUE, c, Integer.MAX_VALUE, c / 8);
        return qVar;
    }

    /* renamed from: c */
    private int m35392c() {
        if (this.f32392a > 0) {
            return this.f32392a;
        }
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        if (min < 33554432) {
            return 2097152;
        }
        return 4194304;
    }

    public C12155h(int i) {
        this.f32392a = i;
    }
}
