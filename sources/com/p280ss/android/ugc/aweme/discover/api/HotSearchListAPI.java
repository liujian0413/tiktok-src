package com.p280ss.android.ugc.aweme.discover.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchMusicListResponse;
import com.p280ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.p280ss.android.ugc.aweme.discover.model.RankingListCover;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchListAPI */
public final class HotSearchListAPI {

    /* renamed from: a */
    private static IRetrofitService f70062a;

    /* renamed from: b */
    private static API f70063b;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchListAPI$API */
    public interface API {
        @C7730f(mo20420a = "/aweme/v1/hot/search/list/")
        C18253l<HotSearchListResponse> getHotSearchList(@C7744t(mo20436a = "detail_list") int i);

        @C7730f(mo20420a = "/aweme/v1/hot/search/list/")
        C18253l<HotSearchListResponse> getHotSearchList(@C7744t(mo20436a = "detail_list") int i, @C7744t(mo20436a = "source") int i2);

        @C7730f(mo20420a = "/aweme/v1/hotsearch/music/billboard/")
        C18253l<HotSearchMusicListResponse> getHotSearchMusicList();

        @C7730f(mo20420a = "/aweme/v1/hotsearch/aweme/billboard/")
        C18253l<HotVideoListResponse> getHotSearchVideoList();

        @C7730f(mo20420a = "aweme/v1/hotsearch/positive_energy/billboard/")
        C18253l<HotVideoListResponse> getPositiveEnergyList();

        @C7730f(mo20420a = "/aweme/v1/branch/billboard/entrance/")
        C18253l<RankingListCover> getRankingListCover();
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        f70062a = iRetrofitService;
        f70063b = (API) iRetrofitService.createNewRetrofit(Api.f60502b).create(API.class);
    }

    /* renamed from: a */
    public static HotVideoListResponse m87301a() throws Exception {
        try {
            return (HotVideoListResponse) f70063b.getHotSearchVideoList().get();
        } catch (ExecutionException e) {
            throw f70062a.propagateCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static HotVideoListResponse m87302b() throws Exception {
        try {
            return (HotVideoListResponse) f70063b.getPositiveEnergyList().get();
        } catch (ExecutionException e) {
            throw f70062a.propagateCompatibleException(e);
        }
    }
}
