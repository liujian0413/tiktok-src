package com.p280ss.android.ugc.aweme.translation.p1681b;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42618b;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42620c;
import com.p280ss.android.ugc.aweme.translation.p1682ui.C42628a;

/* renamed from: com.ss.android.ugc.aweme.translation.b.a */
public final class C42622a extends C34029b<C42618b, C42628a> implements C25678f {
    /* renamed from: b */
    public final void mo56977b() {
        C42620c cVar = (C42620c) ((C42618b) this.f88765b).mData;
        if (cVar == null) {
            ((C42628a) this.f88766c).mo74052a(new Exception());
        } else {
            ((C42628a) this.f88766c).mo74048a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        ((C42628a) this.f88766c).mo74052a(exc);
    }

    public C42622a(C42618b bVar, C42628a aVar) {
        super(bVar, aVar);
        ((C42618b) this.f88765b).addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo104216a(String str, String str2, String str3, String str4, int i) {
        ((C42618b) this.f88765b).mo104212a(str, str2, str3, str4, i);
    }
}
