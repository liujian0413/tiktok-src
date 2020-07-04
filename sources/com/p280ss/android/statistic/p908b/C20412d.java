package com.p280ss.android.statistic.p908b;

import com.p280ss.android.statistic.C20403a;
import com.p280ss.android.statistic.C20408b;

/* renamed from: com.ss.android.statistic.b.d */
public final class C20412d implements C20409a {

    /* renamed from: a */
    private C20409a f55141a;

    public C20412d(C20409a aVar) {
        this.f55141a = aVar;
    }

    /* renamed from: a */
    public final boolean mo54953a(C20408b bVar) {
        return this.f55141a.mo54953a(bVar);
    }

    /* renamed from: a */
    public final boolean mo54954a(C20408b bVar, String str) {
        boolean z;
        if (!this.f55141a.mo54954a(bVar, str)) {
            return false;
        }
        if (bVar.f55139c == null) {
            return true;
        }
        if (bVar.mo54948b() || bVar.mo54949c()) {
            z = true;
        } else {
            z = false;
        }
        if ((!C20403a.f55114b.equals(str) || !bVar.mo54951e()) && ((!C20403a.f55116d.equals(str) || !z) && ((!C20403a.f55113a.equals(str) || !bVar.mo54947a()) && (!C20403a.f55115c.equals(str) || !bVar.mo54950d())))) {
            return false;
        }
        return true;
    }
}
