package com.p280ss.android.ugc.aweme.ttwebview;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.ttwebview.a */
public final class C42652a {
    /* renamed from: a */
    public static String m135463a() {
        return "SystemWebView";
    }

    /* renamed from: b */
    public static boolean m135465b() {
        SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "sp_ttwebview_switch", 0);
        if (a != null) {
            return a.getBoolean("sp_ttwebview_switch_key", false);
        }
        return false;
    }

    /* renamed from: a */
    public static void m135464a(boolean z) {
        Editor edit = C7285c.m22838a(C6399b.m19921a(), "sp_ttwebview_switch", 0).edit();
        edit.putBoolean("sp_ttwebview_switch_key", z);
        edit.apply();
    }
}
