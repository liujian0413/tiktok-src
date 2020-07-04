package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.xb */
final class C16158xb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Future f45284a;

    C16158xb(C16153wx wxVar, Future future) {
        this.f45284a = future;
    }

    public final void run() {
        if (!this.f45284a.isDone()) {
            this.f45284a.cancel(true);
        }
    }
}
