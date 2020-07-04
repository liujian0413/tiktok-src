package com.p280ss.android.ugc.aweme.setting.p1520h;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.p280ss.android.ugc.aweme.setting.model.RestrictInfoModel;

/* renamed from: com.ss.android.ugc.aweme.setting.h.g */
public final class C37641g extends C34029b<RestrictInfoModel, C37638d> implements C25678f {
    /* renamed from: a */
    public final void mo57296a(Exception exc) {
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f88766c != null) {
            ((C37638d) this.f88766c).mo94934a((RestrictInfo) ((RestrictInfoModel) this.f88765b).mData);
        }
    }

    /* renamed from: a */
    public final void mo94936a(String str) {
        ((RestrictInfoModel) this.f88765b).getRestrictInfo(str);
    }

    public C37641g(RestrictInfoModel restrictInfoModel, C37638d dVar) {
        super(restrictInfoModel, dVar);
        ((RestrictInfoModel) this.f88765b).addNotifyListener(this);
    }
}
