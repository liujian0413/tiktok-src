package com.p280ss.android.ugc.aweme.commercialize.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.GameStationApi */
public final class GameStationApi {

    /* renamed from: a */
    private static final IRetrofit f64784a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: b */
    private static IRetrofitService f64785b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.GameStationApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/aweme/")
        C18253l<FeedItemList> getVideoList(@C7744t(mo20436a = "micro_app_id") String str, @C7744t(mo20436a = "hashtag_name") String str2, @C7744t(mo20436a = "count") long j, @C7744t(mo20436a = "cursor") long j2);
    }

    /* renamed from: a */
    public static FeedItemList m80563a(String str, String str2, long j, long j2) throws Exception {
        try {
            return (FeedItemList) ((RealApi) f64784a.create(RealApi.class)).getVideoList(str, str2, j, j2).get();
        } catch (ExecutionException e) {
            throw f64785b.propagateCompatibleException(e);
        }
    }
}
