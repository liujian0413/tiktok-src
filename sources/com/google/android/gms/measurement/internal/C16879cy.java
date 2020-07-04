package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cy */
final class C16879cy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16870cp f47187a;

    /* renamed from: b */
    private final /* synthetic */ C16875cu f47188b;

    C16879cy(C16875cu cuVar, C16870cp cpVar) {
        this.f47188b = cuVar;
        this.f47187a = cpVar;
    }

    public final void run() {
        C16944i d = this.f47188b.f47176c;
        if (d == null) {
            this.f47188b.mo43585q().f47487a.mo44160a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f47187a == null) {
                d.mo43686a(0, (String) null, (String) null, this.f47188b.mo43581m().getPackageName());
            } else {
                d.mo43686a(this.f47187a.f47160c, this.f47187a.f47158a, this.f47187a.f47159b, this.f47188b.mo43581m().getPackageName());
            }
            this.f47188b.m55701E();
        } catch (RemoteException e) {
            this.f47188b.mo43585q().f47487a.mo44161a("Failed to send current screen to the service", e);
        }
    }
}
