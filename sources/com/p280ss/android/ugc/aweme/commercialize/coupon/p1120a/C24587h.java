package com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.h */
public final class C24587h extends C34029b<C24585g, C24584f> implements C25678f {
    /* renamed from: a */
    public final void mo57296a(Exception exc) {
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f88766c != null) {
            User user = (User) ((C24585g) this.f88765b).mData;
            if (user == null) {
                new Exception();
                return;
            }
            ((C24584f) this.f88766c).mo64378a(user);
        }
    }

    /* renamed from: a */
    public final void mo64381a(String str) {
        ((C24585g) this.f88765b).mo64379a(str);
    }

    public C24587h(C24585g gVar, C24584f fVar) {
        super(gVar, fVar);
        gVar.addNotifyListener(this);
    }
}
