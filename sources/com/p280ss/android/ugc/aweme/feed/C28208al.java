package com.p280ss.android.ugc.aweme.feed;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.al */
public final class C28208al {

    /* renamed from: a */
    public static final C28208al f74309a = new C28208al();

    private C28208al() {
    }

    /* renamed from: a */
    public static final int m92714a() {
        return m92720e().getInt("diggUnloginCount", 0);
    }

    /* renamed from: b */
    public static final void m92717b() {
        m92720e().storeBoolean("deviceHasDigged", true);
    }

    /* renamed from: c */
    public static final boolean m92718c() {
        return m92720e().getBoolean("deviceHasDigged", false);
    }

    /* renamed from: d */
    public static final boolean m92719d() {
        return m92720e().getBoolean("hasShowUnloginDiggToast", false);
    }

    /* renamed from: e */
    private static Keva m92720e() {
        Keva repoFromSp = Keva.getRepoFromSp(C6399b.m19921a(), "MainTabPreferences", 0);
        C7573i.m23582a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final void m92715a(int i) {
        m92720e().storeInt("diggUnloginCount", i);
    }

    /* renamed from: a */
    public static final void m92716a(boolean z) {
        m92720e().storeBoolean("hasShowUnloginDiggToast", true);
    }
}
