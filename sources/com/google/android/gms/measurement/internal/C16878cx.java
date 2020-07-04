package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cx */
final class C16878cx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f47185a;

    /* renamed from: b */
    private final /* synthetic */ C16875cu f47186b;

    C16878cx(C16875cu cuVar, zzk zzk) {
        this.f47186b = cuVar;
        this.f47185a = zzk;
    }

    public final void run() {
        C16944i d = this.f47186b.f47176c;
        if (d == null) {
            this.f47186b.mo43585q().f47487a.mo44160a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.mo43690a(this.f47185a);
            this.f47186b.mo43775a(d, null, this.f47185a);
            this.f47186b.m55701E();
        } catch (RemoteException e) {
            this.f47186b.mo43585q().f47487a.mo44161a("Failed to send app launch to the service", e);
        }
    }
}
