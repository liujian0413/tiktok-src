package com.p280ss.android.ugc.aweme.setting.personalization.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.personalization.api.PersonalizationApi */
public final class PersonalizationApi {

    /* renamed from: a */
    public static final API f98161a;

    /* renamed from: b */
    public static final C37680a f98162b = new C37680a(null);

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.api.PersonalizationApi$API */
    public interface API {
        @C7730f(mo20420a = "/aweme/v1/personality/ad/get/")
        C1592h<Resp> getPersonalizationSetting(@C7744t(mo20436a = "system_disallow_personalized") boolean z);

        @C7739o(mo20429a = "/aweme/v1/personality/ad/set/")
        C1592h<BaseResponse> setPersonalizationSetting(@C7744t(mo20436a = "mode") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.api.PersonalizationApi$a */
    public static final class C37680a {
        private C37680a() {
        }

        /* renamed from: a */
        public static API m120517a() {
            return PersonalizationApi.f98161a;
        }

        public /* synthetic */ C37680a(C7571f fVar) {
            this();
        }
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(API.class);
        C7573i.m23582a(create, "ServiceManager.get().get…ationApi.API::class.java)");
        f98161a = (API) create;
    }
}
