package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15623dg;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.bs */
final class C14814bs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15623dg f38324a;

    /* renamed from: b */
    private final /* synthetic */ C14810bo f38325b;

    C14814bs(C14810bo boVar, C15623dg dgVar) {
        this.f38325b = boVar;
        this.f38324a = dgVar;
    }

    public final void run() {
        try {
            if (this.f38325b.f38140e.f38284s != null) {
                this.f38325b.f38140e.f38284s.mo41637a(this.f38324a);
                this.f38325b.mo37751a(this.f38324a.mo41526n());
            }
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
