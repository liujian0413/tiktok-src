package com.bytedance.android.live.base.p123sp;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.bytedance.android.live.base.sp.a */
public final class C2384a {
    /* renamed from: a */
    public static void m10041a(Context context) {
        if (context != null) {
            SharedPreferences a = C7285c.m22838a(context, "ttlive_sdk_shared_pref_cache", 0);
            if (a != null) {
                a.edit().putLong("key_ttlive_sdk_flow_remind", System.currentTimeMillis()).apply();
            }
        }
    }

    /* renamed from: b */
    public static boolean m10042b(Context context) {
        if (context != null) {
            SharedPreferences a = C7285c.m22838a(context, "ttlive_sdk_shared_pref_cache", 0);
            if (a != null) {
                if (((int) ((System.currentTimeMillis() - a.getLong("key_ttlive_sdk_flow_remind", 0)) / 86400000)) <= 30) {
                    return true;
                }
            }
        }
        return false;
    }
}
