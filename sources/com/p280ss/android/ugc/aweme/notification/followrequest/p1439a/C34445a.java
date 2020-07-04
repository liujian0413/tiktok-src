package com.p280ss.android.ugc.aweme.notification.followrequest.p1439a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p280ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.a.a */
public final class C34445a extends C25640a<FollowRequestResponse> {

    /* renamed from: a */
    public long f89884a;

    /* renamed from: b */
    public long f89885b = 1;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                C34445a.this.f89884a = System.currentTimeMillis() / 1000;
                return FollowRequestApiManager.m111411a(C34445a.this.f89884a, C34445a.this.f89885b, 0);
            }
        }, 0);
        return true;
    }
}
