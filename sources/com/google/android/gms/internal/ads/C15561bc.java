package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.bc */
final class C15561bc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15560bb f41413a;

    C15561bc(C15560bb bbVar) {
        this.f41413a = bbVar;
    }

    public final void run() {
        if (this.f41413a.f41352a != null) {
            try {
                this.f41413a.f41352a.mo41420a(1);
            } catch (RemoteException e) {
                afm.m45780c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
