package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15682fk;
import com.google.android.gms.internal.ads.C15696fy;
import com.google.android.gms.internal.ads.acd;

/* renamed from: com.google.android.gms.ads.internal.bt */
final class C14815bt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15682fk f38326a;

    /* renamed from: b */
    private final /* synthetic */ C14810bo f38327b;

    C14815bt(C14810bo boVar, C15682fk fkVar) {
        this.f38327b = boVar;
        this.f38326a = fkVar;
    }

    public final void run() {
        try {
            ((C15696fy) this.f38327b.f38140e.f38288w.get(this.f38326a.mo41482c())).mo41639a(this.f38326a);
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
