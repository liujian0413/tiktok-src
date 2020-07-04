package com.google.android.gms.internal.ads;

final class bta implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f43497a;

    /* renamed from: b */
    private final /* synthetic */ int f43498b;

    /* renamed from: c */
    private final /* synthetic */ int f43499c;

    /* renamed from: d */
    private final /* synthetic */ float f43500d;

    /* renamed from: e */
    private final /* synthetic */ bsv f43501e;

    bta(bsv bsv, int i, int i2, int i3, float f) {
        this.f43501e = bsv;
        this.f43497a = i;
        this.f43498b = i2;
        this.f43499c = i3;
        this.f43500d = f;
    }

    public final void run() {
        this.f43501e.f43477b.mo39616a(this.f43497a, this.f43498b, this.f43499c, this.f43500d);
    }
}
