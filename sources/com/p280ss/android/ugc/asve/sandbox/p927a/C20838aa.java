package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20980z.C20981a;
import com.p280ss.android.vesdk.C45336r;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.aa */
public final class C20838aa extends C20981a {

    /* renamed from: a */
    private final WeakReference<C45336r> f56260a;

    public C20838aa(C45336r rVar) {
        C7573i.m23587b(rVar, "listener");
        this.f56260a = new WeakReference<>(rVar);
    }

    /* renamed from: a */
    public final void mo56364a(boolean z, boolean z2) {
        C45336r rVar = (C45336r) this.f56260a.get();
        if (rVar != null) {
            rVar.mo56380a(z, z2);
        }
    }
}
