package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C14904n;

/* renamed from: com.google.android.gms.internal.ads.qx */
final class C15992qx implements C14904n<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C15981qm f44889a;

    /* renamed from: b */
    private final /* synthetic */ C15938ox f44890b;

    /* renamed from: c */
    private final /* synthetic */ C15989qu f44891c;

    C15992qx(C15989qu quVar, C15981qm qmVar, C15938ox oxVar) {
        this.f44891c = quVar;
        this.f44889a = qmVar;
        this.f44890b = oxVar;
    }

    /* renamed from: a */
    public final void mo37945a(String str) {
        try {
            this.f44889a.mo41911a(str);
        } catch (RemoteException e) {
            afm.m45778b("", e);
        }
    }
}
