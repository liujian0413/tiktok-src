package com.p280ss.android.ugc.aweme.detail;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.d */
public final class C26055d {

    /* renamed from: a */
    public static final C26055d f68866a = new C26055d();

    private C26055d() {
    }

    /* renamed from: a */
    private static Keva m85577a() {
        Keva repoFromSp = Keva.getRepoFromSp(C6399b.m19921a(), "DetailActivityGuidePreferences", 0);
        C7573i.m23582a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final boolean m85578a(boolean z) {
        return m85577a().getBoolean("hasShowGuide", false);
    }

    /* renamed from: b */
    public static final void m85579b(boolean z) {
        m85577a().storeBoolean("hasShowGuide", true);
    }

    /* renamed from: c */
    public static final boolean m85580c(boolean z) {
        return m85577a().getBoolean("hasSwipeUp", false);
    }

    /* renamed from: d */
    public static final void m85581d(boolean z) {
        m85577a().storeBoolean("hasSwipeUp", true);
    }
}
