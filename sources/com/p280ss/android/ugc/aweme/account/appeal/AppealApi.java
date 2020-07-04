package com.p280ss.android.ugc.aweme.account.appeal;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.account.appeal.AppealApi */
public interface AppealApi {

    /* renamed from: a */
    public static final C21114a f56688a = C21114a.f56689a;

    /* renamed from: com.ss.android.ugc.aweme.account.appeal.AppealApi$a */
    public static final class C21114a {

        /* renamed from: a */
        static final /* synthetic */ C21114a f56689a = new C21114a();

        /* renamed from: b */
        private static final AppealApi f56690b = ((AppealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(AppealApi.class));

        private C21114a() {
        }

        /* renamed from: a */
        public static void m71196a(String str, C1591g<AppealStatusResponse, Void> gVar) {
            C7573i.m23587b(str, "userId");
            C7573i.m23587b(gVar, "continuation");
            f56690b.getUserAppealStatus("6", str).mo6876a(gVar, C1592h.f5958b);
        }
    }

    @C7730f(mo20420a = "/aweme/v2/appeal/status/")
    C1592h<AppealStatusResponse> getUserAppealStatus(@C7744t(mo20436a = "object_type") String str, @C7744t(mo20436a = "object_id") String str2);
}
