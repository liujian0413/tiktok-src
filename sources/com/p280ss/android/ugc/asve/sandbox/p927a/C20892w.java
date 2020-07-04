package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20929i.C20930a;
import java.lang.ref.WeakReference;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.w */
public final class C20892w extends C20930a {

    /* renamed from: a */
    private final WeakReference<C7562b<Integer, C7581n>> f56321a;

    public C20892w(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f56321a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo56403a(int i) {
        C7562b bVar = (C7562b) this.f56321a.get();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i));
        }
    }
}
