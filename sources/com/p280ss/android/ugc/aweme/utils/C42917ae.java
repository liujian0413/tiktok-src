package com.p280ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.router.C37286v;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.ae */
public final class C42917ae {
    /* renamed from: a */
    public static String m136252a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("challenge/detail")) {
            List a = C37286v.m119757a(str);
            if (a != null && a.size() > 0) {
                str2 = (String) a.get(a.size() - 1);
            }
        }
        return str2;
    }
}
