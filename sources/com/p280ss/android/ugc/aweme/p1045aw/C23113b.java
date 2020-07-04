package com.p280ss.android.ugc.aweme.p1045aw;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.aw.b */
public final class C23113b {
    /* renamed from: a */
    public static void m75955a(Context context) {
        if (context != null) {
            SharedPreferences a = C7285c.m22838a(context, "pref_name", 0);
            if (!a.getBoolean("pref_short_cut", false)) {
                C23112a.m75954a(context, context.getPackageName());
                a.edit().putBoolean("pref_short_cut", true).apply();
            }
        }
    }
}
