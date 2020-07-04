package com.p280ss.android.ugc.aweme.friends.recommendlist.repository;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi */
public interface RecommendApi {

    /* renamed from: a */
    public static final C30055a f79034a = C30055a.f79035a;

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi$a */
    public static final class C30055a {

        /* renamed from: a */
        static final /* synthetic */ C30055a f79035a = new C30055a();

        private C30055a() {
        }

        /* renamed from: a */
        public static RecommendApi m98524a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RecommendApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…RecommendApi::class.java)");
            return (RecommendApi) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v1/recommend/user/dislike/")
    C7492s<C7581n> dislikeRecommend(@C7744t(mo20436a = "user_id") String str);

    @C7730f(mo20420a = "/aweme/v2/user/recommend/")
    C7492s<RecommendList> recommendList(@C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "cursor") Integer num2, @C7744t(mo20436a = "target_user_id") String str, @C7744t(mo20436a = "recommend_type") int i, @C7744t(mo20436a = "yellow_point_count") Integer num3, @C7744t(mo20436a = "address_book_access") Integer num4, @C7744t(mo20436a = "rec_impr_users") String str2, @C7744t(mo20436a = "push_user_id") String str3, @C7744t(mo20436a = "gps_access") Integer num5, @C7744t(mo20436a = "sec_target_user_id") String str4);
}
