package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fd */
final class C16940fd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16850bw f47378a;

    /* renamed from: b */
    private final /* synthetic */ C16939fc f47379b;

    C16940fd(C16939fc fcVar, C16850bw bwVar) {
        this.f47379b = fcVar;
        this.f47378a = bwVar;
    }

    public final void run() {
        if (C16928es.m56086a()) {
            this.f47378a.mo43584p().mo43645a((Runnable) this);
            return;
        }
        boolean b = this.f47379b.mo44127b();
        this.f47379b.f47377d = 0;
        if (b) {
            this.f47379b.mo43787a();
        }
    }
}
