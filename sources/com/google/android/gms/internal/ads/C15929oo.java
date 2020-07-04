package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oo */
final class C15929oo implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15922oh f44826a;

    C15929oo(C15928on onVar, C15922oh ohVar) {
        this.f44826a = ohVar;
    }

    public final void run() {
        try {
            this.f44826a.f44787c.mo41831c();
        } catch (RemoteException e) {
            acd.m45780c("Could not destroy mediation adapter.", e);
        }
    }
}
