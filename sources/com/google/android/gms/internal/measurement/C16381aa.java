package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.aa */
final class C16381aa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16413bf f45855a;

    /* renamed from: b */
    private final /* synthetic */ C16703z f45856b;

    C16381aa(C16703z zVar, C16413bf bfVar) {
        this.f45856b = zVar;
        this.f45855a = bfVar;
    }

    public final void run() {
        if (!this.f45856b.f46668a.mo43229b()) {
            this.f45856b.f46668a.mo43194c("Connected to service after a timeout");
            this.f45856b.f46668a.m54879a(this.f45855a);
        }
    }
}
