package com.p280ss.android.ugc.aweme.app;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.app.h */
public final class C22989h {

    /* renamed from: a */
    public static final String f60760a;

    /* renamed from: b */
    public static final String f60761b;

    /* renamed from: c */
    public static final CommonApi f60762c = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CommonApi.class));

    /* renamed from: d */
    private static final String f60763d;

    /* renamed from: a */
    public static void m75626a() {
        C23397p.m76735a().mo60807a(null, new Callable() {
            public final Object call() throws Exception {
                Api.m75214a((String) C22989h.f60762c.doGet(C22989h.f60760a).execute().f33302b, C22989h.f60760a);
                return null;
            }
        }, 0);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/check/in/");
        f60760a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Api.f60502b);
        sb2.append("/aweme/v1/check/out/");
        f60761b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Api.f60502b);
        sb3.append("/aweme/v1/device/update/");
        f60763d = sb3.toString();
    }
}
