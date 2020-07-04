package com.p280ss.android.ugc.aweme.setting.p1520h;

import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.setting.model.CommonResponse;
import com.p280ss.android.ugc.aweme.setting.model.RestrictUserModel;

/* renamed from: com.ss.android.ugc.aweme.setting.h.h */
public final class C37642h extends C34029b<RestrictUserModel, C37639e> implements C25678f {
    /* renamed from: b */
    public final void mo56977b() {
        if (((CommonResponse) ((RestrictUserModel) this.f88765b).mData).statusCode != 0 || !((CommonResponse) ((RestrictUserModel) this.f88765b).mData).result) {
            if (this.f88766c != null) {
                ApiServerException apiServerException = new ApiServerException(((CommonResponse) ((RestrictUserModel) this.f88765b).mData).statusCode);
                apiServerException.setErrorMsg(((CommonResponse) ((RestrictUserModel) this.f88765b).mData).statusMsg);
                ((C37639e) this.f88766c).mo71986b(apiServerException);
            }
        } else if (this.f88766c != null) {
            ((C37639e) this.f88766c).mo71988i();
        }
    }

    /* renamed from: a */
    public final void mo94937a(String str) {
        ((RestrictUserModel) this.f88765b).restricUser(str);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f88766c != null) {
            ((C37639e) this.f88766c).mo71986b(exc);
        }
    }

    public C37642h(RestrictUserModel restrictUserModel, C37639e eVar) {
        super(restrictUserModel, eVar);
        ((RestrictUserModel) this.f88765b).addNotifyListener(this);
    }
}
