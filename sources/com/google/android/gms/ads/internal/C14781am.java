package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15682fk;
import com.google.android.gms.internal.ads.C15696fy;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.am */
final class C14781am implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15682fk f38185a;

    /* renamed from: b */
    private final /* synthetic */ C14772ad f38186b;

    C14781am(C14772ad adVar, C15682fk fkVar) {
        this.f38186b = adVar;
        this.f38185a = fkVar;
    }

    public final void run() {
        try {
            ((C15696fy) this.f38186b.f38140e.f38288w.get(this.f38185a.mo41482c())).mo41639a(this.f38185a);
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
