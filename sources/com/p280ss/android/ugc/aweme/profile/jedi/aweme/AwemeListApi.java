package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.MediaMixList;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi */
public interface AwemeListApi {

    /* renamed from: a */
    public static final C35830a f93880a = C35830a.f93881a;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi$a */
    public static final class C35830a {

        /* renamed from: a */
        static final /* synthetic */ C35830a f93881a = new C35830a();

        private C35830a() {
        }

        /* renamed from: a */
        public static AwemeListApi m115658a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(AwemeListApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…AwemeListApi::class.java)");
            return (AwemeListApi) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v1/aweme/listcollection/")
    C7492s<FeedItemList> getCollectAweme(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "cursor") long j);

    @C7730f(mo20420a = "/aweme/v1/aweme/favorite/")
    C7492s<FeedItemList> getFavoriteAweme(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2, @C7744t(mo20436a = "max_cursor") long j);

    @C7730f(mo20420a = "/aweme/v1/mix/list/")
    C7492s<MediaMixList> getMediaMixList(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "cursor") long j);

    @C7730f(mo20420a = "/aweme/v1/aweme/post/")
    C7492s<FeedItemList> getPublishAweme(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2, @C7744t(mo20436a = "max_cursor") long j);
}
