package com.p280ss.android.ugc.aweme.requesttask.idle;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.o */
public final class C37256o {

    /* renamed from: a */
    public static final C37256o f97370a = new C37256o();

    /* renamed from: b */
    private static boolean f97371b;

    private C37256o() {
    }

    /* renamed from: a */
    public static boolean m119712a() {
        return f97371b;
    }

    /* renamed from: b */
    public static void m119713b() {
        try {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).hookVESDKSO();
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static void m119711a(boolean z) {
        f97371b = true;
    }
}
