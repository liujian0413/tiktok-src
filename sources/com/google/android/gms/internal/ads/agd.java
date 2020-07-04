package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class agd implements Runnable {

    /* renamed from: a */
    private final Future f40169a;

    agd(Future future) {
        this.f40169a = future;
    }

    public final void run() {
        Future future = this.f40169a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
