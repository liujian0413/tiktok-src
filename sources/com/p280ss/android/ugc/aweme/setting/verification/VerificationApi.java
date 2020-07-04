package com.p280ss.android.ugc.aweme.setting.verification;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.verification.VerificationApi */
public interface VerificationApi {

    /* renamed from: a */
    public static final C37938a f98792a = C37938a.f98793a;

    /* renamed from: com.ss.android.ugc.aweme.setting.verification.VerificationApi$a */
    public static final class C37938a {

        /* renamed from: a */
        static final /* synthetic */ C37938a f98793a = new C37938a();

        /* renamed from: b */
        private static final IRetrofitService f98794b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

        private C37938a() {
        }

        /* renamed from: a */
        public static VerificationApi m121197a() {
            Object create = f98794b.createNewRetrofit(Api.f60502b).create(VerificationApi.class);
            C7573i.m23582a(create, "retrofitService.createNe…ificationApi::class.java)");
            return (VerificationApi) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v1/mtcert/status/")
    C7492s<VerificationResponse> requestVerification(@C7744t(mo20436a = "sec_uid") String str);
}
