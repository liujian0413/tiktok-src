package com.p280ss.android.ugc.aweme.feed.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.feed.api.BackUpApi */
public final class BackUpApi {

    /* renamed from: a */
    private static final IBackUpApi f74318a = ((IBackUpApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(IBackUpApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.BackUpApi$IBackUpApi */
    public interface IBackUpApi {
        @C6457h(mo15740a = "aweme/v1/aweme/statistics/")
        C18253l<AwemeStatisticsResponse> queryAwemeStatistics(@C6474y(mo15757a = "aweme_ids") String str, @C6474y(mo15757a = "type") int i);
    }

    /* renamed from: a */
    public static AwemeStatisticsResponse m92733a(String str, int i) throws Exception {
        return (AwemeStatisticsResponse) f74318a.queryAwemeStatistics(str, i).get();
    }
}
