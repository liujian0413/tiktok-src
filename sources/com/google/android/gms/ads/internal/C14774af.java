package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15618db;
import com.google.android.gms.internal.ads.C15787jh;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.af */
final /* synthetic */ class C14774af implements Runnable {

    /* renamed from: a */
    private final C14772ad f38164a;

    /* renamed from: b */
    private final C15618db f38165b;

    C14774af(C14772ad adVar, C15618db dbVar) {
        this.f38164a = adVar;
        this.f38165b = dbVar;
    }

    public final void run() {
        C14772ad adVar = this.f38164a;
        C15618db dbVar = this.f38165b;
        try {
            if (adVar.f38140e.f38286u != null) {
                adVar.f38140e.f38286u.mo41674a((C15787jh) dbVar);
            }
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
