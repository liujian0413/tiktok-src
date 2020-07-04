package com.p280ss.android.ugc.aweme;

import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.v */
public final class C21783v implements C21654an {
    /* renamed from: e */
    public final void mo57903e() {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setHasShowedUserAntiAddictionViewToday();
    }

    /* renamed from: a */
    public final boolean mo57899a() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).shouldShowAntiAddictionView();
    }

    /* renamed from: b */
    public final int mo57900b() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAntiAddictionContinuePlayId();
    }

    /* renamed from: c */
    public final int mo57901c() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAntiAddictionTextViewId();
    }

    /* renamed from: d */
    public final int mo57902d() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAntiTextResourceId();
    }

    /* renamed from: f */
    public final int mo57904f() {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAntiAddictionViewId();
    }
}
