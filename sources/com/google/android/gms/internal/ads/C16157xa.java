package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14793ay;

/* renamed from: com.google.android.gms.internal.ads.xa */
final class C16157xa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzaxe f45281a;

    /* renamed from: b */
    private final /* synthetic */ C16132wc f45282b;

    /* renamed from: c */
    private final /* synthetic */ C16153wx f45283c;

    C16157xa(C16153wx wxVar, zzaxe zzaxe, C16132wc wcVar) {
        this.f45283c = wxVar;
        this.f45281a = zzaxe;
        this.f45282b = wcVar;
    }

    public final void run() {
        zzaxi zzaxi;
        try {
            zzaxi = this.f45283c.mo42041a(this.f45281a);
        } catch (Exception e) {
            C14793ay.m42898d().mo39089a((Throwable) e, "AdRequestServiceImpl.loadAdAsync");
            acd.m45780c("Could not fetch ad response due to an Exception.", e);
            zzaxi = null;
        }
        if (zzaxi == null) {
            zzaxi = new zzaxi(0);
        }
        try {
            this.f45282b.mo42036a(zzaxi);
        } catch (RemoteException e2) {
            acd.m45780c("Fail to forward ad response.", e2);
        }
    }
}
