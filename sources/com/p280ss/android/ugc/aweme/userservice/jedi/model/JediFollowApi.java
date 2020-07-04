package com.p280ss.android.ugc.aweme.userservice.jedi.model;

import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.services.IMainService;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi */
public interface JediFollowApi {

    /* renamed from: a */
    public static final C42864a f111357a = C42864a.f111358a;

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi$a */
    public static final class C42864a {

        /* renamed from: a */
        static final /* synthetic */ C42864a f111358a = new C42864a();

        private C42864a() {
        }

        /* renamed from: a */
        public static JediFollowApi m136064a() {
            IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
            Object service = ServiceManager.get().getService(IMainService.class);
            C7573i.m23582a(service, "ServiceManager.get()\n   …IMainService::class.java)");
            Object create = iRetrofitService.createNewRetrofit(((IMainService) service).getApiUrlPrefix()).create(JediFollowApi.class);
            C7573i.m23582a(create, "ServiceManager.get()\n   …ediFollowApi::class.java)");
            return (JediFollowApi) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v1/commit/follow/user/")
    C7492s<FollowStatus> follow(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2, @C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "channel_id") int i2, @C7744t(mo20436a = "from") Integer num, @C7744t(mo20436a = "item_id") String str3, @C7744t(mo20436a = "from_pre") Integer num2);
}
