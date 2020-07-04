package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.ugc.asve.sandbox.p928b.C20914d.C20915a;
import com.p280ss.android.vesdk.C45382z.C45393e;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.q */
public final class C20886q extends C20915a {

    /* renamed from: a */
    private final WeakReference<C45393e> f56315a;

    /* renamed from: a */
    public final boolean mo56397a() {
        C45393e eVar = (C45393e) this.f56315a.get();
        if (eVar != null) {
            return eVar.mo56383a();
        }
        return false;
    }

    public C20886q(C45393e eVar) {
        this.f56315a = new WeakReference<>(eVar);
    }

    /* renamed from: a */
    public final void mo56396a(int i, int i2, int i3, int i4, long j) {
        C45393e eVar = (C45393e) this.f56315a.get();
        if (eVar != null) {
            eVar.mo56382a(null, i, i2, i3, i4, j);
        }
    }
}
