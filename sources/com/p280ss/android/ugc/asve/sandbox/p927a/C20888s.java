package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20938l.C20939a;
import java.lang.ref.WeakReference;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.s */
public final class C20888s extends C20939a {

    /* renamed from: a */
    private final WeakReference<C7562b<Integer, C7581n>> f56317a;

    public C20888s(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f56317a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo56399a(int i) {
        C7562b bVar = (C7562b) this.f56317a.get();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i));
        }
    }
}
