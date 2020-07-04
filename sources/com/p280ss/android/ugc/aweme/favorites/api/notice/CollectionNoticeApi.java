package com.p280ss.android.ugc.aweme.favorites.api.notice;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNoticeApi */
public final class CollectionNoticeApi {

    /* renamed from: a */
    static final IRetrofit f73173a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b);

    /* renamed from: b */
    private static IRetrofitService f73174b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNoticeApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/collection/notice/")
        C18253l<CollectionNotice> getCollectionNotice();
    }

    /* renamed from: a */
    public static CollectionNotice m90942a() throws Exception {
        try {
            return (CollectionNotice) ((RealApi) f73173a.create(RealApi.class)).getCollectionNotice().get();
        } catch (ExecutionException e) {
            throw f73174b.propagateCompatibleException(e);
        }
    }
}
