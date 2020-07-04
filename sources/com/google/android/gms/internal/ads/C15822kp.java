package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.kp */
final class C15822kp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15823kq f44547a;

    /* renamed from: b */
    private final /* synthetic */ C15824kr f44548b;

    C15822kp(C15796jq jqVar, C15823kq kqVar, C15824kr krVar) {
        this.f44547a = kqVar;
        this.f44548b = krVar;
    }

    public final void run() {
        try {
            this.f44547a.mo41681a(this.f44548b);
        } catch (RemoteException e) {
            acd.m45780c("Could not propagate interstitial ad event.", e);
        }
    }
}
