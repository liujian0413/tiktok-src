package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

/* renamed from: com.google.android.gms.internal.ads.pz */
final class C15967pz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ErrorCode f44875a;

    /* renamed from: b */
    private final /* synthetic */ C15966py f44876b;

    C15967pz(C15966py pyVar, ErrorCode errorCode) {
        this.f44876b = pyVar;
        this.f44875a = errorCode;
    }

    public final void run() {
        try {
            this.f44876b.f44874a.mo41781a(C15970qb.m51933a(this.f44875a));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }
}
