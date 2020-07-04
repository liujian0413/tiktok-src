package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ss */
final class C16041ss implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ abj f44983a;

    /* renamed from: b */
    private final /* synthetic */ C16039sq f44984b;

    C16041ss(C16039sq sqVar, abj abj) {
        this.f44984b = sqVar;
        this.f44983a = abj;
    }

    public final void run() {
        synchronized (this.f44984b.f44978c) {
            C16039sq sqVar = this.f44984b;
            sqVar.f44976a.mo37611b(this.f44983a);
        }
    }
}
