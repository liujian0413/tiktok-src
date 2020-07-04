package com.p280ss.android.ugc.aweme.feed.p1233i;

import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.app.p1029d.C22915b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.api.FeedActionApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.i.v */
public final class C28471v extends C25640a<C0902i<String, Integer>> {

    /* renamed from: a */
    public int f75069a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 3 && objArr.length != 4)) {
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
                if (objArr.length > 3) {
                    C28471v.this.f75069a = ((Integer) objArr[2]).intValue();
                    return FeedActionApi.m92737a((String) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), C22915b.m75418a((String) objArr[3]));
                }
                C28471v.this.f75069a = ((Integer) objArr[1]).intValue();
                return FeedActionApi.m92736a((String) objArr[0], ((Integer) objArr[1]).intValue(), C22915b.m75418a((String) objArr[2]));
            }
        }, 0);
        return true;
    }
}
