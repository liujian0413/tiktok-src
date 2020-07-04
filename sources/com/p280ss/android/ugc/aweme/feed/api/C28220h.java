package com.p280ss.android.ugc.aweme.feed.api;

import com.p280ss.android.ugc.aweme.feed.cache.C28288d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.feed.api.h */
public final class C28220h {

    /* renamed from: a */
    private static volatile IFeedModuleService f74334a;

    /* renamed from: a */
    public static C28288d m92763a() {
        return m92764b().getFeedCacheLoader();
    }

    /* renamed from: b */
    private static IFeedModuleService m92764b() {
        if (f74334a == null) {
            f74334a = (IFeedModuleService) ServiceManager.get().getService(IFeedModuleService.class);
        }
        return f74334a;
    }
}
