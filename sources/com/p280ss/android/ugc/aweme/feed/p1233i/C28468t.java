package com.p280ss.android.ugc.aweme.feed.p1233i;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.api.FeedActionApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.i.t */
public final class C28468t extends C25640a<String> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return FeedActionApi.m92738a((String) objArr[0]);
            }
        }, 0);
        return true;
    }
}
