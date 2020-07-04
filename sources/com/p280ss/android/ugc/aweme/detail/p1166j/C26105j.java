package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.detail.api.DetailApi;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.detail.j.j */
public final class C26105j extends C25640a<Aweme> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        final String str = objArr[0];
        final String str2 = "";
        if (objArr.length > 1 && objArr[1] != null) {
            str2 = (String) objArr[1];
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return DetailApi.m85567a(str, str2);
            }
        }, 0);
        return true;
    }
}
