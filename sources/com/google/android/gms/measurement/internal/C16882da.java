package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.da */
final class C16882da implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f47200a;

    /* renamed from: b */
    private final /* synthetic */ C16875cu f47201b;

    C16882da(C16875cu cuVar, zzk zzk) {
        this.f47201b = cuVar;
        this.f47200a = zzk;
    }

    public final void run() {
        C16944i d = this.f47201b.f47176c;
        if (d == null) {
            this.f47201b.mo43585q().f47487a.mo44160a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.mo43695b(this.f47200a);
            this.f47201b.m55701E();
        } catch (RemoteException e) {
            this.f47201b.mo43585q().f47487a.mo44161a("Failed to send measurementEnabled to the service", e);
        }
    }
}
