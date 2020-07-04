package com.p280ss.android.ugc.aweme.journey;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.journey.d */
public final class C32231d {

    /* renamed from: a */
    public static final C32231d f84177a = new C32231d();

    /* renamed from: b */
    private static final JourneyApi f84178b = ((JourneyApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(JourneyApi.class));

    private C32231d() {
    }

    /* renamed from: a */
    public static JourneyApi m104535a() {
        return f84178b;
    }
}
