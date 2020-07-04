package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20950p.C20951a;
import java.lang.ref.WeakReference;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.l */
public final class C20881l extends C20951a {

    /* renamed from: a */
    private final WeakReference<C7562b<Long, C7581n>> f56310a;

    public C20881l(C7562b<? super Long, C7581n> bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f56310a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo56390a(long j) {
        C7562b bVar = (C7562b) this.f56310a.get();
        if (bVar != null) {
            bVar.invoke(Long.valueOf(j));
        }
    }
}
