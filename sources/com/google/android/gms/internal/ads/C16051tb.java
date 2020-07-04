package com.google.android.gms.internal.ads;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.tb */
final /* synthetic */ class C16051tb implements Runnable {

    /* renamed from: a */
    private final C16050ta f45000a;

    /* renamed from: b */
    private final CountDownLatch f45001b;

    C16051tb(C16050ta taVar, CountDownLatch countDownLatch) {
        this.f45000a = taVar;
        this.f45001b = countDownLatch;
    }

    public final void run() {
        this.f45000a.mo41975a(this.f45001b);
    }
}
