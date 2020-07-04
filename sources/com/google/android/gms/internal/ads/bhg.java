package com.google.android.gms.internal.ads;

final class bhg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f42003a;

    /* renamed from: b */
    private final /* synthetic */ int f42004b;

    /* renamed from: c */
    private final /* synthetic */ float f42005c;

    /* renamed from: d */
    private final /* synthetic */ bhf f42006d;

    bhg(bhf bhf, int i, int i2, float f) {
        this.f42006d = bhf;
        this.f42003a = i;
        this.f42004b = i2;
        this.f42005c = f;
    }

    public final void run() {
        this.f42006d.f41987e.mo39509a(this.f42003a, this.f42004b, this.f42005c);
    }
}
