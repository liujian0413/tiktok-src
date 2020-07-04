package org.greenrobot.eventbus.p1894a;

import org.greenrobot.eventbus.C48342n;

/* renamed from: org.greenrobot.eventbus.a.b */
public final class C48325b extends C48324a {

    /* renamed from: a */
    private final C48328e[] f123382a;

    /* renamed from: c */
    public final synchronized C48342n[] mo121765c() {
        C48342n[] nVarArr;
        int length = this.f123382a.length;
        nVarArr = new C48342n[length];
        for (int i = 0; i < length; i++) {
            C48328e eVar = this.f123382a[i];
            nVarArr[i] = mo121763a(eVar.f123383a, eVar.f123385c, eVar.f123384b, eVar.f123386d, eVar.f123387e);
        }
        return nVarArr;
    }

    public C48325b(Class cls, boolean z, C48328e[] eVarArr) {
        super(cls, null, true);
        this.f123382a = eVarArr;
    }
}
