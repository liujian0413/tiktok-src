package com.p280ss.android.ugc.aweme.qrcode.p1496b;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.qrcode.model.C37082c;
import com.p280ss.android.ugc.aweme.qrcode.model.C37083d;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.l */
public final class C37044l extends C34029b<C37083d, C37023b> implements C25678f {
    /* renamed from: b */
    public final void mo56977b() {
        if (this.f88766c != null) {
            ((C37023b) this.f88766c).mo93459a((C37082c) ((C37083d) this.f88765b).mData);
        }
    }

    /* renamed from: a */
    public final void mo93488a(String str) {
        ((C37083d) this.f88765b).mo93535a(str);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f88766c != null) {
            ((C37023b) this.f88766c).mo93460a(exc);
        }
    }

    public C37044l(C37083d dVar, C37023b bVar) {
        super(dVar, bVar);
        dVar.addNotifyListener(this);
    }
}
