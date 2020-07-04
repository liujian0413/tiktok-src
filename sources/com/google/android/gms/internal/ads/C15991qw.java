package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C14904n;

/* renamed from: com.google.android.gms.internal.ads.qw */
final class C15991qw implements C14904n<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C15975qg f44886a;

    /* renamed from: b */
    private final /* synthetic */ C15938ox f44887b;

    /* renamed from: c */
    private final /* synthetic */ C15989qu f44888c;

    C15991qw(C15989qu quVar, C15975qg qgVar, C15938ox oxVar) {
        this.f44888c = quVar;
        this.f44886a = qgVar;
        this.f44887b = oxVar;
    }

    /* renamed from: a */
    public final void mo37945a(String str) {
        try {
            this.f44886a.mo41909a(str);
        } catch (RemoteException e) {
            afm.m45778b("", e);
        }
    }
}
