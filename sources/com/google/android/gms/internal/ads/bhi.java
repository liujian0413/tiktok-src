package com.google.android.gms.internal.ads;

final class bhi implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f42009a;

    /* renamed from: b */
    private final /* synthetic */ long f42010b;

    /* renamed from: c */
    private final /* synthetic */ bhf f42011c;

    bhi(bhf bhf, int i, long j) {
        this.f42011c = bhf;
        this.f42009a = i;
        this.f42010b = j;
    }

    public final void run() {
        this.f42011c.f41987e.mo39510a(this.f42009a, this.f42010b);
    }
}
