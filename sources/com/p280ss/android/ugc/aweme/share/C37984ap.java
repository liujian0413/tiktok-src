package com.p280ss.android.ugc.aweme.share;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.share.ap */
public final class C37984ap {

    /* renamed from: a */
    private static ShareService f98907a;

    /* renamed from: b */
    private static ShareExtService f98908b;

    static {
        m121303c();
    }

    /* renamed from: a */
    public static ShareService m121301a() {
        return f98907a;
    }

    /* renamed from: b */
    public static ShareExtService m121302b() {
        return f98908b;
    }

    /* renamed from: c */
    private static void m121303c() {
        if (f98907a == null) {
            f98907a = (ShareService) ServiceManager.get().getService(ShareService.class);
        }
        if (f98908b == null) {
            f98908b = (ShareExtService) ServiceManager.get().getService(ShareExtService.class);
        }
    }
}
