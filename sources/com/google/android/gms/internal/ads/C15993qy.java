package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C14901k;
import com.google.android.gms.ads.mediation.C14904n;

/* renamed from: com.google.android.gms.internal.ads.qy */
final class C15993qy implements C14904n<C14901k, Object> {

    /* renamed from: a */
    private final /* synthetic */ C15977qi f44892a;

    /* renamed from: b */
    private final /* synthetic */ C15938ox f44893b;

    C15993qy(C15989qu quVar, C15977qi qiVar, C15938ox oxVar) {
        this.f44892a = qiVar;
        this.f44893b = oxVar;
    }

    /* renamed from: a */
    public final void mo37945a(String str) {
        try {
            this.f44892a.mo41910a(str);
        } catch (RemoteException e) {
            afm.m45778b("", e);
        }
    }
}
