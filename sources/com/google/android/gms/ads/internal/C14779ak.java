package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15623dg;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.ak */
final class C14779ak implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15623dg f38180a;

    /* renamed from: b */
    private final /* synthetic */ C14772ad f38181b;

    C14779ak(C14772ad adVar, C15623dg dgVar) {
        this.f38181b = adVar;
        this.f38180a = dgVar;
    }

    public final void run() {
        try {
            if (this.f38181b.f38140e.f38284s != null) {
                this.f38181b.f38140e.f38284s.mo41637a(this.f38180a);
                this.f38181b.mo37657a(this.f38180a.mo41526n());
            }
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
