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
import com.p280ss.android.ugc.aweme.poi.model.C35110f;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.h */
public final class C35278h extends C25640a<C35110f> {

    /* renamed from: a */
    public final PoiFeedApi f92489a = ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(PoiFeedApi.class));

    public final boolean checkParams(Object... objArr) {
        boolean z;
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public final boolean sendRequest(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        C35086h hVar = objArr[0];
        if (hVar != null) {
            C35086h hVar2 = hVar;
            this.f92489a.getPoiCommonBanner(hVar2.f91758i, 53, hVar2.f91750a).mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiParams");
    }
}
