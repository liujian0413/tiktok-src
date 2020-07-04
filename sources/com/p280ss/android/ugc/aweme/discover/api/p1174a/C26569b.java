package com.p280ss.android.ugc.aweme.discover.api.p1174a;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.api.a.b */
public final class C26569b {

    /* renamed from: a */
    public static final IRetrofit f70091a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f70095e);

    /* renamed from: b */
    public static final IRetrofit f70092b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a);

    /* renamed from: c */
    public static final IRetrofit f70093c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://i.isnssdk.com");

    /* renamed from: d */
    public static final C26570a f70094d = new C26570a(null);

    /* renamed from: e */
    private static final String f70095e = Api.f60502b;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.a.b$a */
    public static final class C26570a {
        private C26570a() {
        }

        public /* synthetic */ C26570a(C7571f fVar) {
            this();
        }
    }
}
