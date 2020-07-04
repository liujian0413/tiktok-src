package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15621de;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.br */
final class C14813br implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15621de f38322a;

    /* renamed from: b */
    private final /* synthetic */ C14810bo f38323b;

    C14813br(C14810bo boVar, C15621de deVar) {
        this.f38323b = boVar;
        this.f38322a = deVar;
    }

    public final void run() {
        try {
            if (this.f38323b.f38140e.f38283r != null) {
                this.f38323b.f38140e.f38283r.mo41635a(this.f38322a);
                this.f38323b.mo37751a(this.f38322a.mo41508n());
            }
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
