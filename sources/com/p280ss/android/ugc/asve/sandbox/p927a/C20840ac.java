package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20974x.C20975a;
import com.p280ss.android.vesdk.C45382z.C45404o;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.ac */
public final class C20840ac extends C20975a {

    /* renamed from: a */
    private final WeakReference<C45404o> f56262a;

    public C20840ac(C45404o oVar) {
        C7573i.m23587b(oVar, "listener");
        this.f56262a = new WeakReference<>(oVar);
    }

    /* renamed from: a */
    public final void mo56366a(boolean z) {
        C45404o oVar = (C45404o) this.f56262a.get();
        if (oVar != null) {
            oVar.mo56377a(z);
        }
    }
}
