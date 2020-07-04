package com.facebook.imagepipeline.p716c;

import com.facebook.common.internal.C13310j;

/* renamed from: com.facebook.imagepipeline.c.k */
public final class C13578k implements C13310j<C13586q> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public C13586q mo29879b() {
        int c = m39972c();
        C13586q qVar = new C13586q(c, Integer.MAX_VALUE, c, Integer.MAX_VALUE, c / 8);
        return qVar;
    }

    /* renamed from: c */
    private static int m39972c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        if (min < 33554432) {
            return 2097152;
        }
        return 4194304;
    }
}
