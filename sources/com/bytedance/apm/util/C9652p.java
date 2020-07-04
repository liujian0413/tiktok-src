package com.bytedance.apm.util;

import android.text.TextUtils;

/* renamed from: com.bytedance.apm.util.p */
public final class C9652p {
    /* renamed from: b */
    public static String m28545b(String str, String str2) {
        TextUtils.isEmpty(str);
        return str;
    }

    /* renamed from: a */
    public static String m28544a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" must not be empty");
        throw new IllegalArgumentException(sb.toString());
    }
}
