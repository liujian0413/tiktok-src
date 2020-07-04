package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.as */
final class C15068as extends C15085bh {

    /* renamed from: a */
    private WeakReference<C15061al> f38988a;

    C15068as(C15061al alVar) {
        this.f38988a = new WeakReference<>(alVar);
    }

    /* renamed from: a */
    public final void mo38309a() {
        C15061al alVar = (C15061al) this.f38988a.get();
        if (alVar != null) {
            alVar.m43683o();
        }
    }
}
