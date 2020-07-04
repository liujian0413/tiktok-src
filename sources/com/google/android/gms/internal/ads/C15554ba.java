package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ba */
final class C15554ba implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15552az f41299a;

    C15554ba(C15552az azVar) {
        this.f41299a = azVar;
    }

    public final void run() {
        if (this.f41299a.f41246a.f41155a != null) {
            try {
                this.f41299a.f41246a.f41155a.mo41420a(1);
            } catch (RemoteException e) {
                afm.m45780c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
