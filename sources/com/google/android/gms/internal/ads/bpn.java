package com.google.android.gms.internal.ads;

import java.io.IOException;

final class bpn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ IOException f43159a;

    /* renamed from: b */
    private final /* synthetic */ bpj f43160b;

    bpn(bpj bpj, IOException iOException) {
        this.f43160b = bpj;
        this.f43159a = iOException;
    }

    public final void run() {
        this.f43160b.f43133e.mo39619a(this.f43159a);
    }
}
