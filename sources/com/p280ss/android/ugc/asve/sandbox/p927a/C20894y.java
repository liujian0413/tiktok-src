package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20917e.C20918a;
import com.p280ss.android.vesdk.VEListener.C45210f;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.y */
public final class C20894y extends C20918a {

    /* renamed from: a */
    private final WeakReference<C45210f> f56323a;

    public C20894y(C45210f fVar) {
        C7573i.m23587b(fVar, "listener");
        this.f56323a = new WeakReference<>(fVar);
    }

    /* renamed from: a */
    public final void mo56405a(int i, String str) {
        C45210f fVar = (C45210f) this.f56323a.get();
        if (fVar != null) {
            fVar.mo55926a(i);
        }
    }
}
