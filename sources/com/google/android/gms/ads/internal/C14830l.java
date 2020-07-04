package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzyv;

/* renamed from: com.google.android.gms.ads.internal.l */
final class C14830l implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzyv f38375a;

    /* renamed from: b */
    private final /* synthetic */ int f38376b;

    /* renamed from: c */
    private final /* synthetic */ C14828j f38377c;

    C14830l(C14828j jVar, zzyv zzyv, int i) {
        this.f38377c = jVar;
        this.f38375a = zzyv;
        this.f38376b = i;
    }

    public final void run() {
        synchronized (this.f38377c.f38372t) {
            this.f38377c.m43052b(this.f38375a, this.f38376b);
        }
    }
}
