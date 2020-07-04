package com.p280ss.android.ugc.aweme.feed.service;

import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.feed.service.c */
public final class C28679c implements C28681e {
    /* renamed from: a */
    public final int mo73745a() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getShareIconResource();
    }
}
