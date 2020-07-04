package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20905aa.C20906a;
import com.p280ss.android.vesdk.C45382z.C45402m;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.ab */
public final class C20839ab extends C20906a {

    /* renamed from: a */
    private final WeakReference<C45402m> f56261a;

    public C20839ab(C45402m mVar) {
        C7573i.m23587b(mVar, "listener");
        this.f56261a = new WeakReference<>(mVar);
    }

    /* renamed from: a */
    public final void mo56365a(int i, float f) {
        C45402m mVar = (C45402m) this.f56261a.get();
        if (mVar != null) {
            mVar.mo55990a(i, f);
        }
    }
}
