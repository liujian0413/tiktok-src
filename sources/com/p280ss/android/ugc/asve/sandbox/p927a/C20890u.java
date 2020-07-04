package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20926h.C20927a;
import java.lang.ref.WeakReference;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.u */
public final class C20890u extends C20927a {

    /* renamed from: a */
    private final WeakReference<C7562b<Integer, C7581n>> f56319a;

    public C20890u(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f56319a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo56401a(int i) {
        C7562b bVar = (C7562b) this.f56319a.get();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i));
        }
    }
}
