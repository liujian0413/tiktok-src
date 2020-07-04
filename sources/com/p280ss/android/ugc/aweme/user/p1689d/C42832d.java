package com.p280ss.android.ugc.aweme.user.p1689d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C21683bp;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.user.C42813d.C42814a;

/* renamed from: com.ss.android.ugc.aweme.user.d.d */
public final class C42832d {
    /* renamed from: a */
    private static SharedPreferences m135991a() {
        return C7285c.m22838a(C21683bp.m72587b(), "aweme_user", 0);
    }

    /* renamed from: b */
    private static SharedPreferences m135993b() {
        return C7285c.m22838a(C21683bp.m72587b(), "com.ss.spipe_setting", 0);
    }

    /* renamed from: a */
    public static void m135992a(String str) {
        m135991a().edit().putString("user_info_raw", str).commit();
    }

    /* renamed from: b */
    public static C42814a m135994b(String str) {
        long j = m135993b().getLong("user_id", 0);
        String string = m135993b().getString("session_key", "");
        String string2 = m135993b().getString("user_name", "");
        boolean z = m135993b().getBoolean("user_verified", false);
        String string3 = m135993b().getString("country_code", "");
        if (!TextUtils.equals(str, String.valueOf(j))) {
            return null;
        }
        return C42814a.m135957a(j, string, string2, z, string3);
    }
}
