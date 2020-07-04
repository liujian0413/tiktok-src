package com.bytedance.android.live.core.utils;

import android.text.TextUtils;

/* renamed from: com.bytedance.android.live.core.utils.t */
public final class C3407t {
    /* renamed from: a */
    private static String m12665a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        if (str.contains("_")) {
            return str;
        }
        return TextUtils.concat(new CharSequence[]{str, "_", "0"}).toString();
    }

    /* renamed from: a */
    public static boolean m12666a(String str, String str2) {
        return TextUtils.equals(m12665a(str), m12665a(str2));
    }
}
