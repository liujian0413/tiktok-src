package com.p280ss.android.ugc.aweme.poi.p335ui.p1473a;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.poi.C35086h;
import com.p280ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p280ss.android.ugc.aweme.poi.model.PoiQRDetailStruct;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.e */
public final class C35275e extends C25640a<PoiQRDetailStruct> {

    /* renamed from: a */
    static final PoiFeedApi f92488a = ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiFeedApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        C35086h hVar = objArr[0];
        f92488a.getQRDetail(hVar.f91750a, hVar.f91756g, hVar.f91757h).mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
        return true;
    }
}
