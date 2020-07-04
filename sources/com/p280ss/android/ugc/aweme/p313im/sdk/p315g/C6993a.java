package com.p280ss.android.ugc.aweme.p313im.sdk.p315g;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.g.a */
public final class C6993a {
    /* renamed from: a */
    public static IIMService m21772a() {
        return IMService.inst();
    }

    /* renamed from: a */
    public static <T> T m21773a(Class<T> cls) {
        return ServiceManager.get().getService(cls);
    }
}
