package com.p280ss.android.ugc.aweme.newfollow.model;

import android.text.TextUtils;
import bolts.C1591g;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.friends.api.C30030b;
import com.p280ss.android.ugc.aweme.friends.api.RecommendApi;
import com.p280ss.android.ugc.aweme.net.C34089j;

/* renamed from: com.ss.android.ugc.aweme.newfollow.model.d */
public final class C34147d extends C25640a<BaseResponse> {

    /* renamed from: a */
    private RecommendApi f88987a = C30030b.m98492a();

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof String) || TextUtils.isEmpty(objArr[0])) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        this.f88987a.dislikeRecommend(1, objArr[0]).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        return true;
    }
}
