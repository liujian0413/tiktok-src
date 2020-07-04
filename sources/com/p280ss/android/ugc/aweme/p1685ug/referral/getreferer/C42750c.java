package com.p280ss.android.ugc.aweme.p1685ug.referral.getreferer;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.getreferer.c */
public final class C42750c extends C34029b<C42748a, C42752e> implements C25678f {
    /* renamed from: a */
    public final void mo57296a(Exception exc) {
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f88766c != null) {
            ((C42752e) this.f88766c).mo104352a((C42751d) ((C42748a) this.f88765b).mData);
        }
    }

    /* renamed from: a */
    public final void mo104361a(String str) {
        ((C42748a) this.f88765b).mo104359a(str);
    }

    public C42750c(C42748a aVar, C42752e eVar) {
        super(aVar, eVar);
        ((C42748a) this.f88765b).addNotifyListener(this);
    }
}
