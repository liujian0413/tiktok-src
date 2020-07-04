package com.p280ss.android.ugc.aweme.commercialize.api;

import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.a */
public final class C24542a {
    /* renamed from: a */
    public static <T> T m80568a(Class<T> cls) {
        return ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(cls);
    }
}
