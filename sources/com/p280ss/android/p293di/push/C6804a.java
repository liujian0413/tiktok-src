package com.p280ss.android.p293di.push;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.awemepushapi.IPushApi;

/* renamed from: com.ss.android.di.push.a */
public final class C6804a {
    /* renamed from: a */
    public static IPushApi m21138a() {
        IPushApi iPushApi;
        try {
            iPushApi = (IPushApi) ServiceManager.get().getService(IPushApi.class);
        } catch (Exception unused) {
            iPushApi = null;
        }
        if (iPushApi == null) {
            return new PushServiceMock();
        }
        return iPushApi;
    }
}
