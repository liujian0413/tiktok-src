package com.p280ss.android.ugc.aweme.profile.api;

import com.p280ss.android.ugc.aweme.profile.model.NewYearWishResp;
import p346io.reactivex.C7318a;
import p346io.reactivex.C7490k;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.NewYearWishApi */
public interface NewYearWishApi {

    /* renamed from: a */
    public static final C35724a f93690a = C35724a.f93691a;

    /* renamed from: com.ss.android.ugc.aweme.profile.api.NewYearWishApi$a */
    public static final class C35724a {

        /* renamed from: a */
        static final /* synthetic */ C35724a f93691a = new C35724a();

        private C35724a() {
        }
    }

    @C7739o(mo20429a = "/aweme/v3/newyear/dig/wish/")
    C7318a digg(@C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "sec_user_id") String str);

    @C7730f(mo20420a = "/aweme/v3/newyear/user/wish/")
    C7490k<NewYearWishResp> getUserWish(@C7744t(mo20436a = "sec_user_id") String str);

    @C7739o(mo20429a = "/aweme/v3/newyear/remind/wish/")
    C7318a remind(@C7744t(mo20436a = "sec_user_id") String str);

    @C7739o(mo20429a = "/aweme/v3/newyear/dig/wish/")
    C7318a unDigg(@C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "sec_user_id") String str);
}
