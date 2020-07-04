package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dj */
final class C16891dj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16944i f47238a;

    /* renamed from: b */
    private final /* synthetic */ C16888dg f47239b;

    C16891dj(C16888dg dgVar, C16944i iVar) {
        this.f47239b = dgVar;
        this.f47238a = iVar;
    }

    public final void run() {
        synchronized (this.f47239b) {
            this.f47239b.f47232b = false;
            if (!this.f47239b.f47231a.mo43782v()) {
                this.f47239b.f47231a.mo43585q().f47494h.mo44160a("Connected to remote service");
                this.f47239b.f47231a.mo43774a(this.f47238a);
            }
        }
    }
}
