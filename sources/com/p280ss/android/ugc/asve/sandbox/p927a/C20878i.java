package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20920f.C20921a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.i */
public final class C20878i extends C20921a {

    /* renamed from: a */
    private final WeakReference<C19761a> f56307a;

    public C20878i(C19761a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f56307a = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo56387a(int i, int i2) {
        C19761a aVar = (C19761a) this.f56307a.get();
        if (aVar != null) {
            aVar.mo52872b(i, i2);
        }
    }
}
