package com.p280ss.android.ugc.effectmanager.network.p1741a;

import com.p280ss.android.ugc.effectmanager.common.p1729d.C43724a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.link.C43849a;

/* renamed from: com.ss.android.ugc.effectmanager.network.a.b */
public final class C43861b extends C43860a {

    /* renamed from: b */
    private C43849a f113633b;

    public C43861b(C43849a aVar) {
        this.f113633b = aVar;
    }

    /* renamed from: a */
    public final boolean mo106117a(C43724a aVar) {
        if ((aVar instanceof C43727d) && ((C43727d) aVar).f113229f.equals("NETWORK")) {
            this.f113633b.mo106067a();
        }
        return false;
    }
}
