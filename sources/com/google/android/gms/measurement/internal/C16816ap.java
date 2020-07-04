package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ap */
final class C16816ap implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16825ay f46962a;

    /* renamed from: b */
    private final /* synthetic */ C16953r f46963b;

    C16816ap(C16815ao aoVar, C16825ay ayVar, C16953r rVar) {
        this.f46962a = ayVar;
        this.f46963b = rVar;
    }

    public final void run() {
        if (this.f46962a.f47012h == null) {
            this.f46963b.f47487a.mo44160a("Install Referrer Reporter is null");
            return;
        }
        C16812al alVar = this.f46962a.f47012h;
        alVar.mo43621a(alVar.f46955a.mo43581m().getPackageName());
    }
}
