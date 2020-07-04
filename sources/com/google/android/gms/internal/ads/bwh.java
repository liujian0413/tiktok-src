package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class bwh implements Runnable {

    /* renamed from: a */
    private final agu f44053a;

    /* renamed from: b */
    private final Future f44054b;

    bwh(agu agu, Future future) {
        this.f44053a = agu;
        this.f44054b = future;
    }

    public final void run() {
        agu agu = this.f44053a;
        Future future = this.f44054b;
        if (agu.isCancelled()) {
            future.cancel(true);
        }
    }
}
