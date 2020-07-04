package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C14904n;

/* renamed from: com.google.android.gms.internal.ads.qv */
final class C15990qv implements C14904n<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C15973qe f44884a;

    /* renamed from: b */
    private final /* synthetic */ C15938ox f44885b;

    C15990qv(C15989qu quVar, C15973qe qeVar, C15938ox oxVar) {
        this.f44884a = qeVar;
        this.f44885b = oxVar;
    }

    /* renamed from: a */
    public final void mo37945a(String str) {
        try {
            this.f44884a.mo41908a(str);
        } catch (RemoteException e) {
            afm.m45778b("", e);
        }
    }
}
