package com.p280ss.android.ugc.aweme.detail.p1160d;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.d.a */
public final class C26056a {

    /* renamed from: a */
    public static final C26056a f68867a = new C26056a();

    private C26056a() {
    }

    /* renamed from: a */
    private static Keva m85582a() {
        Keva repoFromSp = Keva.getRepoFromSp(C6399b.m19921a(), "MainTabPreferences", 0);
        C7573i.m23582a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final boolean m85583a(boolean z) {
        return m85582a().getBoolean("shouldShowHotVideoSwipeUpGuide", true);
    }

    /* renamed from: b */
    public static final void m85584b(boolean z) {
        m85582a().storeBoolean("shouldShowHotVideoSwipeUpGuide", false);
    }

    /* renamed from: c */
    public static final boolean m85585c(boolean z) {
        return m85582a().getBoolean("shouldShowDiscoveryGuide", true);
    }

    /* renamed from: d */
    public static final void m85586d(boolean z) {
        m85582a().storeBoolean("shouldShowDiscoveryGuide", false);
    }

    /* renamed from: e */
    public static final boolean m85587e(boolean z) {
        return m85582a().getBoolean("shouldShowDiscoveryV3Guide", true);
    }

    /* renamed from: f */
    public static final void m85588f(boolean z) {
        m85582a().storeBoolean("shouldShowDiscoveryV3Guide", false);
    }
}
