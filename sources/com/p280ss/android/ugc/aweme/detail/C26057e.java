package com.p280ss.android.ugc.aweme.detail;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.detail.e */
public final class C26057e {
    /* renamed from: a */
    public static boolean m85589a(String str) {
        if (TextUtils.equals("from_follow_page", str) || TextUtils.equals("from_user_state_tab", str) || TextUtils.equals("from_search_mix", str) || TextUtils.equals("from_poi_detail", str) || TextUtils.equals("poi_rate", str) || TextUtils.equals("from_commerce_banner", str) || TextUtils.equals("from_familiar_tab", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m85590b(String str) {
        if (TextUtils.equals("from_follow_page", str) || TextUtils.equals("from_user_state_tab", str) || TextUtils.equals("from_chat", str) || TextUtils.equals("from_launch_forward", str) || TextUtils.equals("from_forward_push", str) || TextUtils.equals("from_familiar_tab", str)) {
            return true;
        }
        return false;
    }
}
