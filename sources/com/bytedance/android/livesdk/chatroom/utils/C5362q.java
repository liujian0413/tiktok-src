package com.bytedance.android.livesdk.chatroom.utils;

import android.text.TextUtils;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.q */
public final class C5362q {
    /* renamed from: a */
    public static boolean m17094a(String str) {
        if (TextUtils.equals(str, "hourly_rank") || TextUtils.equals(str, "regional_rank")) {
            return true;
        }
        return false;
    }
}
