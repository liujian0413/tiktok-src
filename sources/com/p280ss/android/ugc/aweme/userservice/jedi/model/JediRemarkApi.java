package com.p280ss.android.ugc.aweme.userservice.jedi.model;

import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.p280ss.android.ugc.aweme.services.IMainService;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediRemarkApi */
public interface JediRemarkApi {

    /* renamed from: a */
    public static final C42865a f111359a = C42865a.f111360a;

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediRemarkApi$a */
    public static final class C42865a {

        /* renamed from: a */
        static final /* synthetic */ C42865a f111360a = new C42865a();

        private C42865a() {
        }

        /* renamed from: a */
        public static JediRemarkApi m136065a() {
            IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
            Object service = ServiceManager.get().getService(IMainService.class);
            C7573i.m23582a(service, "ServiceManager.get()\n   …IMainService::class.java)");
            Object create = iRetrofitService.createNewRetrofit(((IMainService) service).getApiUrlPrefix()).create(JediRemarkApi.class);
            C7573i.m23582a(create, "ServiceManager.get()\n   …ediRemarkApi::class.java)");
            return (JediRemarkApi) create;
        }
    }

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/user/remark/name/")
    C7492s<CommitRemarkNameResponse> commitRemarkName(@C7727c(mo20417a = "remark_name") String str, @C7727c(mo20417a = "user_id") String str2, @C7727c(mo20417a = "sec_user_id") String str3);
}
