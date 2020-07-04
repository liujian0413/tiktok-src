package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.vw */
public final class C16125vw extends C16133wd {

    /* renamed from: a */
    private final WeakReference<C16114vl> f45229a;

    public C16125vw(C16114vl vlVar) {
        this.f45229a = new WeakReference<>(vlVar);
    }

    /* renamed from: a */
    public final void mo42036a(zzaxi zzaxi) {
        C16114vl vlVar = (C16114vl) this.f45229a.get();
        if (vlVar != null) {
            vlVar.mo42023a(zzaxi);
        }
    }
}
