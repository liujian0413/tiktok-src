package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.comment.e.q */
public final class C24121q extends C24102b<BaseResponse> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62511a(Object obj) {
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 3) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new C24122r(objArr[0], objArr[1], objArr[2].booleanValue()), 0);
        return true;
    }
}
