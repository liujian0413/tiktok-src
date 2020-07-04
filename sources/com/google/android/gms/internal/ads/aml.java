package com.google.android.gms.internal.ads;

import android.view.View;

final class aml implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f40672a;

    /* renamed from: b */
    private final /* synthetic */ aag f40673b;

    /* renamed from: c */
    private final /* synthetic */ int f40674c;

    /* renamed from: d */
    private final /* synthetic */ amj f40675d;

    aml(amj amj, View view, aag aag, int i) {
        this.f40675d = amj;
        this.f40672a = view;
        this.f40673b = aag;
        this.f40674c = i;
    }

    public final void run() {
        this.f40675d.m46392a(this.f40672a, this.f40673b, this.f40674c - 1);
    }
}
