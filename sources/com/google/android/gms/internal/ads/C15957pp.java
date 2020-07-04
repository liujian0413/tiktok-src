package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C14902l;
import com.google.android.gms.ads.mediation.C14904n;

/* renamed from: com.google.android.gms.internal.ads.pp */
final class C15957pp implements C14904n<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C15938ox f44848a;

    /* renamed from: b */
    private final /* synthetic */ C14902l f44849b;

    /* renamed from: c */
    private final /* synthetic */ C15956po f44850c;

    C15957pp(C15956po poVar, C15938ox oxVar, C14902l lVar) {
        this.f44850c = poVar;
        this.f44848a = oxVar;
        this.f44849b = lVar;
    }

    /* renamed from: a */
    public final void mo37945a(String str) {
        try {
            String canonicalName = this.f44849b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded medation ad: ");
            sb.append(str);
            afm.m45777b(sb.toString());
            this.f44848a.mo41781a(0);
        } catch (RemoteException e) {
            afm.m45778b("", e);
        }
    }
}
