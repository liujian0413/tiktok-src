package com.p280ss.android.ugc.aweme.setting;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.setting.az */
public final class C37583az {

    /* renamed from: a */
    private static SharedPreferences f98010a = C7285c.m22838a(AwemeApplication.m21341a(), "share_setting_preference", 0);

    /* renamed from: a */
    public static String m120355a() {
        return f98010a.getString("share_setting_key", "");
    }

    /* renamed from: b */
    public static boolean m120357b() {
        return f98010a.getBoolean("key_has_setting", false);
    }

    /* renamed from: a */
    public static void m120356a(String str) {
        f98010a.edit().putString("share_setting_key", str).commit();
        f98010a.edit().putBoolean("key_has_setting", !TextUtils.isEmpty(str)).commit();
    }
}
