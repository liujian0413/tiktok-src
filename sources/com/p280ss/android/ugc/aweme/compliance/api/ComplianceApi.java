package com.p280ss.android.ugc.aweme.compliance.api;

import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.compliance.model.AlgoFreeSettings;
import com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.ComplianceApi */
public interface ComplianceApi {

    /* renamed from: a */
    public static final C25787a f68197a = C25787a.f68198a;

    /* renamed from: com.ss.android.ugc.aweme.compliance.api.ComplianceApi$a */
    public static final class C25787a {

        /* renamed from: a */
        static final /* synthetic */ C25787a f68198a = new C25787a();

        private C25787a() {
        }

        /* renamed from: a */
        public static ComplianceApi m84751a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(ComplianceApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…omplianceApi::class.java)");
            return (ComplianceApi) create;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.api.ComplianceApi$b */
    public static final class C25788b {
    }

    @C7730f(mo20420a = "/aweme/v1/algo/free/settings/")
    C7492s<AlgoFreeSettings> getAlgoFreeSettings();

    @C7730f(mo20420a = "/aweme/v1/compliance/settings/")
    C7492s<ComplianceSetting> getComplianceSetting(@C6474y(mo15757a = "teen_mode_status") int i, @C6474y(mo15757a = "ftc_child_mode") int i2);

    @C7730f(mo20420a = "/aweme/v1/user/set/settings/")
    C7492s<BaseResponse> setVPAContentChoice(@C6474y(mo15757a = "field") String str, @C6474y(mo15757a = "vpa_content_choice") int i);
}
