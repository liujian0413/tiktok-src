package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dh */
final class C16889dh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16944i f47234a;

    /* renamed from: b */
    private final /* synthetic */ C16888dg f47235b;

    C16889dh(C16888dg dgVar, C16944i iVar) {
        this.f47235b = dgVar;
        this.f47234a = iVar;
    }

    public final void run() {
        synchronized (this.f47235b) {
            this.f47235b.f47232b = false;
            if (!this.f47235b.f47231a.mo43782v()) {
                this.f47235b.f47231a.mo43585q().f47495i.mo44160a("Connected to service");
                this.f47235b.f47231a.mo43774a(this.f47234a);
            }
        }
    }
}
