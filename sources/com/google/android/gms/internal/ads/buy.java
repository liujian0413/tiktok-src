package com.google.android.gms.internal.ads;

import android.view.View;

final class buy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f43678a;

    /* renamed from: b */
    private final /* synthetic */ bux f43679b;

    buy(bux bux, View view) {
        this.f43679b = bux;
        this.f43678a = view;
    }

    public final void run() {
        this.f43679b.mo41375a(this.f43678a);
    }
}
