package com.p280ss.android.ugc.aweme.setting.p1520h;

import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.setting.model.CommonResponse;
import com.p280ss.android.ugc.aweme.setting.model.RestrictAwemeModel;
import com.p280ss.android.ugc.aweme.setting.p1516d.C37619b;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.setting.h.f */
public final class C37640f extends C34029b<RestrictAwemeModel, C37637c> implements C25678f {
    /* renamed from: b */
    public final void mo56977b() {
        if (((CommonResponse) ((RestrictAwemeModel) this.f88765b).mData).statusCode != 0 || !((CommonResponse) ((RestrictAwemeModel) this.f88765b).mData).result) {
            if (this.f88766c != null) {
                ApiServerException apiServerException = new ApiServerException(((CommonResponse) ((RestrictAwemeModel) this.f88765b).mData).statusCode);
                apiServerException.setErrorMsg(((CommonResponse) ((RestrictAwemeModel) this.f88765b).mData).statusMsg);
                ((C37637c) this.f88766c).mo71985a(apiServerException);
            }
            return;
        }
        if (this.f88766c != null) {
            ((C37637c) this.f88766c).mo71987h();
        }
        C42961az.m136380a(new C37619b());
    }

    /* renamed from: a */
    public final void mo94935a(String str) {
        ((RestrictAwemeModel) this.f88765b).restricAweme(str);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f88766c != null) {
            ((C37637c) this.f88766c).mo71985a(exc);
        }
    }

    public C37640f(RestrictAwemeModel restrictAwemeModel, C37637c cVar) {
        super(restrictAwemeModel, cVar);
        ((RestrictAwemeModel) this.f88765b).addNotifyListener(this);
    }
}
