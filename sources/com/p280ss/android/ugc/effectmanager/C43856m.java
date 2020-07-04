package com.p280ss.android.ugc.effectmanager;

import bolts.C1592h;
import com.p280ss.android.ugc.effectmanager.common.C43739h;

/* renamed from: com.ss.android.ugc.effectmanager.m */
public final class C43856m {

    /* renamed from: a */
    final C43739h<C1592h<C43862o>> f113626a;

    /* renamed from: b */
    volatile C43847l f113627b;

    /* renamed from: a */
    public final synchronized C43847l mo106094a() {
        if (this.f113627b == null) {
            C1592h hVar = (C1592h) this.f113626a.mo105683a();
            try {
                hVar.mo6892g();
                if (!hVar.mo6889d()) {
                    this.f113627b = ((C43862o) hVar.mo6890e()).mo106118a();
                    if (this.f113627b == null) {
                        throw new RuntimeException("config == null");
                    }
                } else {
                    throw new RuntimeException(hVar.mo6891f());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return this.f113627b;
    }

    public C43856m(C43739h<C1592h<C43862o>> hVar) {
        this.f113626a = hVar;
    }
}
