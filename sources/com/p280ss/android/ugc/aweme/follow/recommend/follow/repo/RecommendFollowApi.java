package com.p280ss.android.ugc.aweme.follow.recommend.follow.repo;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.RecommendFollowApi */
public interface RecommendFollowApi {

    /* renamed from: a */
    public static final C29464a f77721a = C29464a.f77722a;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.RecommendFollowApi$a */
    public static final class C29464a {

        /* renamed from: a */
        static final /* synthetic */ C29464a f77722a = new C29464a();

        private C29464a() {
        }

        /* renamed from: a */
        public static RecommendFollowApi m96959a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RecommendFollowApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…endFollowApi::class.java)");
            return (RecommendFollowApi) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v2/user/recommend/")
    C7492s<RecommendList> recommendList(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "cursor") int i2, @C7744t(mo20436a = "target_user_id") String str, @C7744t(mo20436a = "recommend_type") int i3, @C7744t(mo20436a = "yellow_point_count") int i4, @C7744t(mo20436a = "address_book_access") int i5, @C7744t(mo20436a = "rec_impr_users") String str2, @C7744t(mo20436a = "gps_access") int i6, @C7744t(mo20436a = "sec_target_user_id") String str3);
}
