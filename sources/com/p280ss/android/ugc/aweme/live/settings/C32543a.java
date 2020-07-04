package com.p280ss.android.ugc.aweme.live.settings;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.live.C32507e;

/* renamed from: com.ss.android.ugc.aweme.live.settings.a */
public final class C32543a {

    /* renamed from: a */
    private static C32543a f84855a = new C32543a();

    /* renamed from: b */
    private LiveSDKSettingApi f84856b;

    /* renamed from: a */
    public static C32543a m105394a() {
        return f84855a;
    }

    /* renamed from: b */
    public final void mo83797b() {
        this.f84856b.querySettings().mo6875a(C32544b.f84857a);
    }

    private C32543a() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C32430a.m105063b());
        this.f84856b = (LiveSDKSettingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(sb.toString()).create(LiveSDKSettingApi.class);
        C32507e.m105301b();
    }

    /* renamed from: a */
    static final /* synthetic */ Void m105395a(C1592h hVar) throws Exception {
        if (!hVar.mo6889d()) {
            C32545c cVar = (C32545c) hVar.mo6890e();
            if (cVar.status_code == 0) {
                C32507e.m105300a(cVar);
            }
        }
        return null;
    }
}
