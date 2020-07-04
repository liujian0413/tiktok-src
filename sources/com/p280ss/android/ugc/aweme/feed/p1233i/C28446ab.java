package com.p280ss.android.ugc.aweme.feed.p1233i;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.feed.adapter.C28143ao;
import com.p280ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.p280ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.feed.i.ab */
public final class C28446ab extends C34029b<C28143ao, EmptyGuideV2> implements C25678f {
    /* renamed from: a */
    public final void mo72177a() {
        ((C28143ao) this.f88765b).mo71746a();
    }

    /* renamed from: b */
    public final void mo56977b() {
        ((EmptyGuideV2) this.f88766c).mo72037a((SuperAccountList) ((C28143ao) this.f88765b).mData);
    }

    /* renamed from: a */
    public final int mo72176a(String str) {
        if (this.f88765b != null) {
            return ((C28143ao) this.f88765b).mo71745a(str);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo72178a(User user) {
        if (this.f88765b != null) {
            ((C28143ao) this.f88765b).mo71747a(user);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        ((EmptyGuideV2) this.f88766c).mo72038a(exc);
    }

    public C28446ab(C28143ao aoVar, EmptyGuideV2 emptyGuideV2) {
        super(aoVar, emptyGuideV2);
        ((C28143ao) this.f88765b).addNotifyListener(this);
    }
}
