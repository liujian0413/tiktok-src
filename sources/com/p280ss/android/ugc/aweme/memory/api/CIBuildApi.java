package com.p280ss.android.ugc.aweme.memory.api;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6472w;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.memory.api.CIBuildApi */
public final class CIBuildApi {

    /* renamed from: a */
    public static final CIBuildApi f86397a = new CIBuildApi();

    /* renamed from: b */
    private static final Api f86398b = ((Api) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://voffline.byted.org").create(Api.class));

    /* renamed from: com.ss.android.ugc.aweme.memory.api.CIBuildApi$Api */
    interface Api {
        @C6457h(mo15740a = "download/tos/schedule/iOSPackageBackUp/job/{jobIndex}/jenkins_build_result.json")
        C18253l<CIBuildResponse> doGet(@C6472w(mo15754a = "jobIndex") String str);
    }

    private CIBuildApi() {
    }

    /* renamed from: a */
    public static C18253l<CIBuildResponse> m107105a(String str) {
        C7573i.m23587b(str, "jobIndex");
        return f86398b.doGet(str);
    }
}
