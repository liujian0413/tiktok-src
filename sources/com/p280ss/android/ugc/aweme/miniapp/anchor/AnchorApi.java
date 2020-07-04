package com.p280ss.android.ugc.aweme.miniapp.anchor;

import com.bytedance.retrofit2.p264b.C6463n;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33347a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33349c;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33350d;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33351e;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;
import retrofit2.p363b.C7748x;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.AnchorApi */
public final class AnchorApi {

    /* renamed from: a */
    private static final IRetrofit f86970a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: b */
    private static IRetrofitService f86971b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.AnchorApi$RealApi */
    public interface RealApi {
        @C7730f
        C18253l<String> executeGet(@C6463n int i, @C7748x String str);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/anchor/recommend/")
        C18253l<Object> fetchRecommendAnchorList(@C7744t(mo20436a = "zip_uri") String str);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/game/recommend/list")
        C18253l<C33347a> getGameRecommendList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/game/search")
        C18253l<C33347a> getGameSearchList(@C7744t(mo20436a = "key_word") String str, @C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "https://aweme.snssdk.com/web/api/medium/hot/list/")
        C18253l<C33349c> getMediumRecommendList(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "offset") int i2);

        @C7730f(mo20420a = "https://aweme.snssdk.com/web/api/medium/search/")
        C18253l<C33350d> getMediumSearchList(@C7744t(mo20436a = "keyword") String str, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "offset") int i2);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/record/list/")
        C18253l<C33351e> getMicroAppList(@C7744t(mo20436a = "page") int i, @C7744t(mo20436a = "page_size") int i2, @C7744t(mo20436a = "list_type") int i3);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/recommend/list/")
        C18253l<C33351e> getMicroAppRecommendList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "from_source") int i3);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/search/")
        C18253l<C33351e> getMicroAppSearchList(@C7744t(mo20436a = "key_word") String str, @C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "from_source") int i3);
    }

    /* renamed from: a */
    public static C33347a m107700a(int i, int i2) throws Exception {
        try {
            return (C33347a) ((RealApi) f86970a.create(RealApi.class)).getGameRecommendList(i, 20).get();
        } catch (ExecutionException e) {
            throw f86971b.propagateCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static C33349c m107704b(int i, int i2) throws Exception {
        try {
            return (C33349c) ((RealApi) f86970a.create(RealApi.class)).getMediumRecommendList(i, 20).get();
        } catch (ExecutionException e) {
            throw f86971b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C33347a m107701a(String str, int i, int i2) throws Exception {
        try {
            return (C33347a) ((RealApi) f86970a.create(RealApi.class)).getGameSearchList(str, i, 20).get();
        } catch (ExecutionException e) {
            throw f86971b.propagateCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static C33350d m107705b(String str, int i, int i2) throws Exception {
        try {
            return (C33350d) ((RealApi) f86970a.create(RealApi.class)).getMediumSearchList(str, 20, i2).get();
        } catch (ExecutionException e) {
            throw f86971b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C33351e m107702a(int i, int i2, int i3) throws Exception {
        try {
            return (C33351e) ((RealApi) f86970a.create(RealApi.class)).getMicroAppList(i, 20, 0).get();
        } catch (ExecutionException e) {
            throw f86971b.propagateCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static C33351e m107706b(int i, int i2, int i3) throws Exception {
        try {
            return (C33351e) ((RealApi) f86970a.create(RealApi.class)).getMicroAppRecommendList(i, 20, 1).get();
        } catch (ExecutionException e) {
            throw f86971b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C33351e m107703a(String str, int i, int i2, int i3) throws Exception {
        try {
            return (C33351e) ((RealApi) f86970a.create(RealApi.class)).getMicroAppSearchList(str, i, 20, 1).get();
        } catch (ExecutionException e) {
            throw f86971b.propagateCompatibleException(e);
        }
    }
}
