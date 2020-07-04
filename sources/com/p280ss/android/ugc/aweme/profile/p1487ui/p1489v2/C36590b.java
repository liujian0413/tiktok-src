package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.util.C42880h;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b */
public final class C36590b {

    /* renamed from: a */
    public static final C36590b f96003a = new C36590b();

    /* renamed from: b */
    private static Keva f96004b;

    private C36590b() {
    }

    /* renamed from: a */
    public static boolean m118072a() {
        if (f96004b == null) {
            return false;
        }
        Keva keva = f96004b;
        if (keva == null) {
            C7573i.m23580a();
        }
        return keva.getBoolean("profile_v2_show_bio_hint", true);
    }

    static {
        try {
            f96004b = Keva.getRepoFromSp(C6399b.m19921a(), "ProfileV2Preferences", 0);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("SharedPreferencesAnnotatedManager getSP failed ");
            sb.append(th.getMessage());
            C42880h.m136156a(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m118071a(boolean z) {
        Keva keva = f96004b;
        if (keva != null) {
            keva.storeBoolean("profile_v2_show_bio_hint", false);
        }
    }
}
