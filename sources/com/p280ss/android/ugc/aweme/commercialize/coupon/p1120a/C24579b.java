package com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a;

import com.p280ss.android.ugc.aweme.commercialize.coupon.model.C24593a;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.b */
public final class C24579b extends C34029b<C24577a, C24583e> implements C25678f {
    /* renamed from: b */
    public final void mo56977b() {
        if (this.f88766c != null) {
            C24593a aVar = (C24593a) ((C24577a) this.f88765b).mData;
            if (aVar == null) {
                ((C24583e) this.f88766c).mo64377a(new Exception());
                return;
            }
            ((C24583e) this.f88766c).mo64376a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f88766c != null) {
            ((C24583e) this.f88766c).mo64377a(exc);
        }
    }

    public C24579b(C24577a aVar, C24583e eVar) {
        super(aVar, eVar);
        aVar.addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo64373a(int i, String str) {
        ((C24577a) this.f88765b).mo64371a(i, str);
    }
}
