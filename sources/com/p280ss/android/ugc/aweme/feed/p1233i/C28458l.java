package com.p280ss.android.ugc.aweme.feed.p1233i;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.api.FeedStatsApi;
import com.p280ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.i.l */
public final class C28458l extends C25640a<PrivateUrlModel> {

    /* renamed from: a */
    public static final FeedStatsApi f75052a = ((FeedStatsApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FeedStatsApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
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
                return C28458l.f75052a.feedStats((String) objArr[0], ((Integer) objArr[1]).intValue()).get();
            }
        }, 0);
        return true;
    }
}
