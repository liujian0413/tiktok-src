package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15628dl;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.aj */
final class C14778aj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15628dl f38178a;

    /* renamed from: b */
    private final /* synthetic */ C14772ad f38179b;

    C14778aj(C14772ad adVar, C15628dl dlVar) {
        this.f38179b = adVar;
        this.f38178a = dlVar;
    }

    public final void run() {
        try {
            if (this.f38179b.f38140e.f38285t != null) {
                this.f38179b.f38140e.f38285t.mo41641a(this.f38178a);
                this.f38179b.mo37657a(this.f38178a.mo41561q());
            }
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
