package com.p280ss.android.ugc.aweme.poi.model;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.poi.api.PoiCouponApi;

/* renamed from: com.ss.android.ugc.aweme.poi.model.g */
public final class C35117g extends C25640a<PoiJoinActivityResponse> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        PoiCouponApi.m113164a(objArr[0], objArr[1].intValue()).mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
        return true;
    }
}
