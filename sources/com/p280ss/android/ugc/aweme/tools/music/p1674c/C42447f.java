package com.p280ss.android.ugc.aweme.tools.music.p1674c;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.c.f */
public final class C42447f {

    /* renamed from: a */
    private static final C6600e f110339a;

    /* renamed from: a */
    public static final C6600e m134903a() {
        return f110339a;
    }

    static {
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        f110339a = ((IAVServiceProxy) service).getNetworkService().getRetrofitFactoryGson();
    }
}
