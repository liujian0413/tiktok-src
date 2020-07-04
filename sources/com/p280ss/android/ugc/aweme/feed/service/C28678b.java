package com.p280ss.android.ugc.aweme.feed.service;

import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.service.b */
public final class C28678b implements C28680d {
    /* renamed from: a */
    public final boolean mo73744a() {
        Object service = ServiceManager.get().getService(IBridgeService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ridgeService::class.java)");
        return ((IBridgeService) service).isFamiliarFeedFullScreen();
    }
}
