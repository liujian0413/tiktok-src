package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzyv;

/* renamed from: com.google.android.gms.ads.internal.k */
final class C14829k implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzyv f38373a;

    /* renamed from: b */
    private final /* synthetic */ C14828j f38374b;

    C14829k(C14828j jVar, zzyv zzyv) {
        this.f38374b = jVar;
        this.f38373a = zzyv;
    }

    public final void run() {
        synchronized (this.f38374b.f38372t) {
            if (this.f38374b.m43054d()) {
                this.f38374b.m43051b(this.f38373a);
            } else {
                this.f38374b.m43052b(this.f38373a, 1);
            }
        }
    }
}
