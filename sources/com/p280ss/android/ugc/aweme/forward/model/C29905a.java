package com.p280ss.android.ugc.aweme.forward.model;

import bolts.C1591g;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.forward.api.ForwardApi;
import com.p280ss.android.ugc.aweme.net.C34089j;

/* renamed from: com.ss.android.ugc.aweme.forward.model.a */
public final class C29905a extends C25640a<BaseResponse> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        ForwardApi.m97742a(objArr[0]).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        return true;
    }
}
