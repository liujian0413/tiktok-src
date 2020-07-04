package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15625di;
import com.google.android.gms.internal.ads.C15696fy;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.al */
final class C14780al implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f38182a;

    /* renamed from: b */
    private final /* synthetic */ abj f38183b;

    /* renamed from: c */
    private final /* synthetic */ C14772ad f38184c;

    C14780al(C14772ad adVar, String str, abj abj) {
        this.f38184c = adVar;
        this.f38182a = str;
        this.f38183b = abj;
    }

    public final void run() {
        try {
            ((C15696fy) this.f38184c.f38140e.f38288w.get(this.f38182a)).mo41639a((C15625di) this.f38183b.f39842C);
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
