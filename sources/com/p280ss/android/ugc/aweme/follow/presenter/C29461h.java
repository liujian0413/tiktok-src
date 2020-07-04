package com.p280ss.android.ugc.aweme.follow.presenter;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.follow.api.FollowingAwemeCountApi;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.h */
public final class C29461h extends C25640a<C29460g> {

    /* renamed from: a */
    public static final FollowingAwemeCountApi f77712a = ((FollowingAwemeCountApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FollowingAwemeCountApi.class));

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return C29461h.f77712a.getFollowingsLatestAwemePublishCount(((Integer) objArr[0]).intValue()).get();
            }
        }, 0);
        return super.sendRequest(objArr);
    }
}
