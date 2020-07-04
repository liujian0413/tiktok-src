package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bq */
final class C16844bq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzfv f47083a;

    /* renamed from: b */
    private final /* synthetic */ zzk f47084b;

    /* renamed from: c */
    private final /* synthetic */ C16828ba f47085c;

    C16844bq(C16828ba baVar, zzfv zzfv, zzk zzk) {
        this.f47085c = baVar;
        this.f47083a = zzfv;
        this.f47084b = zzk;
    }

    public final void run() {
        this.f47085c.f47035a.mo43873n();
        this.f47085c.f47035a.mo43850a(this.f47083a, this.f47084b);
    }
}
