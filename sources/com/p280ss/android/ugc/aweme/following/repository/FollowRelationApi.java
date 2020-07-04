package com.p280ss.android.ugc.aweme.following.repository;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.following.model.C29564a;
import com.p280ss.android.ugc.aweme.following.model.C29567c;
import com.p280ss.android.ugc.aweme.following.model.C29570e;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.following.repository.FollowRelationApi */
public interface FollowRelationApi {

    /* renamed from: a */
    public static final C29584a f77952a = C29584a.f77953a;

    /* renamed from: com.ss.android.ugc.aweme.following.repository.FollowRelationApi$a */
    public static final class C29584a {

        /* renamed from: a */
        static final /* synthetic */ C29584a f77953a = new C29584a();

        private C29584a() {
        }

        /* renamed from: a */
        public static FollowRelationApi m97122a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FollowRelationApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…wRelationApi::class.java)");
            return (FollowRelationApi) create;
        }
    }

    @C7730f(mo20420a = "aweme/v1/connected/relation/list")
    C7492s<C29564a> queryConnectedList(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "cursor") Integer num, @C7744t(mo20436a = "count") Integer num2);

    @C7730f(mo20420a = "/aweme/v1/user/follower/list/")
    C7492s<C29567c> queryFollowerList(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2, @C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "offset") int i2, @C7744t(mo20436a = "source_type") int i3, @C7744t(mo20436a = "address_book_access") int i4, @C7744t(mo20436a = "gps_access") int i5);

    @C7730f(mo20420a = "/aweme/v1/user/following/list/")
    C7492s<C29570e> queryFollowingList(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2, @C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "offset") int i2, @C7744t(mo20436a = "source_type") int i3, @C7744t(mo20436a = "address_book_access") int i4, @C7744t(mo20436a = "gps_access") int i5);
}
