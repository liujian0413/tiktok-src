package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class agc implements Runnable {

    /* renamed from: a */
    private final agu f40168a;

    agc(agu agu) {
        this.f40168a = agu;
    }

    public final void run() {
        this.f40168a.mo39332a(new TimeoutException());
    }
}
