package com.bytedance.sdk.account.utils;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.account.utils.g */
public final class C12914g {
    /* renamed from: a */
    public static String m37592a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append("/");
        return sb.toString();
    }
}
