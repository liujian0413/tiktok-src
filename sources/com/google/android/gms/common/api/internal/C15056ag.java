package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.C16970c;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.ag */
final class C15056ag extends C16970c {

    /* renamed from: a */
    private final WeakReference<C15159z> f38946a;

    C15056ag(C15159z zVar) {
        this.f38946a = new WeakReference<>(zVar);
    }

    /* renamed from: a */
    public final void mo38289a(zaj zaj) {
        C15159z zVar = (C15159z) this.f38946a.get();
        if (zVar != null) {
            zVar.f39213a.mo38314a((C15071av) new C15057ah(this, zVar, zVar, zaj));
        }
    }
}
