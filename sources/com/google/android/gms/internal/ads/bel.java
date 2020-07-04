package com.google.android.gms.internal.ads;

final class bel implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bqk f41782a;

    /* renamed from: b */
    private final /* synthetic */ bdn f41783b;

    bel(bdn bdn, bqk bqk) {
        this.f41783b = bdn;
        this.f41782a = bqk;
    }

    public final void run() {
        try {
            this.f41783b.f41698c.put(this.f41782a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
