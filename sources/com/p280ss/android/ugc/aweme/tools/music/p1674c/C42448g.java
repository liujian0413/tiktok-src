package com.p280ss.android.ugc.aweme.tools.music.p1674c;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.ttuploader.TTImageUploader;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.c.g */
public final class C42448g {

    /* renamed from: a */
    public static final C42448g f110340a = new C42448g();

    private C42448g() {
    }

    /* renamed from: a */
    public static final TTImageUploader m134904a() {
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        ((IAVServiceProxy) service).getShortVideoPluginService().mo90368a("ttvideouploader");
        try {
            return new TTImageUploader();
        } catch (Throwable unused) {
            return null;
        }
    }
}
