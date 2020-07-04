package com.bytedance.android.livesdk.fansclub;

import android.text.TextUtils;
import com.bytedance.android.livesdk.config.LiveSettingKeys;

/* renamed from: com.bytedance.android.livesdk.fansclub.c */
public final class C5900c {
    /* renamed from: a */
    public static boolean m18433a(boolean z) {
        if (z || TextUtils.isEmpty((CharSequence) LiveSettingKeys.LIVE_FANS_GROUP_URL.mo10240a())) {
            return false;
        }
        return true;
    }
}
