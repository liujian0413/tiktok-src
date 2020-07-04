package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

/* renamed from: com.google.android.gms.internal.ads.qa */
final class C15969qa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ErrorCode f44877a;

    /* renamed from: b */
    private final /* synthetic */ C15966py f44878b;

    C15969qa(C15966py pyVar, ErrorCode errorCode) {
        this.f44878b = pyVar;
        this.f44877a = errorCode;
    }

    public final void run() {
        try {
            this.f44878b.f44874a.mo41781a(C15970qb.m51933a(this.f44877a));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }
}
