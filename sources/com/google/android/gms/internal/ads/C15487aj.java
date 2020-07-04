package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.aj */
public final class C15487aj {

    /* renamed from: a */
    public C15478ag f40394a;

    /* renamed from: b */
    private final String f40395b;

    public C15487aj(C15478ag agVar) {
        String str;
        this.f40394a = agVar;
        try {
            str = agVar.mo39300a();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            str = null;
        }
        this.f40395b = str;
    }
}
