package com.p280ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;

/* renamed from: com.ss.android.ugc.aweme.account.util.h */
public final class C22329h {
    /* renamed from: a */
    public static String m73928a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C6306c.m19563a(bytes, 0, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }
}
