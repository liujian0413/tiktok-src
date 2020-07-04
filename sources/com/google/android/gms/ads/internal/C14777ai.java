package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15621de;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.ai */
final class C14777ai implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15621de f38176a;

    /* renamed from: b */
    private final /* synthetic */ C14772ad f38177b;

    C14777ai(C14772ad adVar, C15621de deVar) {
        this.f38177b = adVar;
        this.f38176a = deVar;
    }

    public final void run() {
        try {
            if (this.f38177b.f38140e.f38283r != null) {
                this.f38177b.f38140e.f38283r.mo41635a(this.f38176a);
                this.f38177b.mo37657a(this.f38176a.mo41508n());
            }
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
