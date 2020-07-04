package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.az */
final class C15552az extends byw {

    /* renamed from: a */
    final /* synthetic */ C15544ax f41246a;

    private C15552az(C15544ax axVar) {
        this.f41246a = axVar;
    }

    /* renamed from: a */
    public final String mo37780a() throws RemoteException {
        return null;
    }

    /* renamed from: b */
    public final String mo37783b() throws RemoteException {
        return null;
    }

    /* renamed from: c */
    public final boolean mo37784c() throws RemoteException {
        return false;
    }

    /* renamed from: a */
    public final void mo37781a(zzyv zzyv) throws RemoteException {
        mo37782a(zzyv, 1);
    }

    /* renamed from: a */
    public final void mo37782a(zzyv zzyv, int i) throws RemoteException {
        afm.m45779c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        afb.f40136a.post(new C15554ba(this));
    }
}
