package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15628dl;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.bq */
final class C14812bq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15628dl f38320a;

    /* renamed from: b */
    private final /* synthetic */ C14810bo f38321b;

    C14812bq(C14810bo boVar, C15628dl dlVar) {
        this.f38321b = boVar;
        this.f38320a = dlVar;
    }

    public final void run() {
        try {
            if (this.f38321b.f38140e.f38285t != null) {
                this.f38321b.f38140e.f38285t.mo41641a(this.f38320a);
                this.f38321b.mo37751a(this.f38320a.mo41561q());
            }
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
