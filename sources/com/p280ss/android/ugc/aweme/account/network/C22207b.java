package com.p280ss.android.ugc.aweme.account.network;

import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.services.interceptor.IInterceptor;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.network.b */
public final class C22207b {
    /* renamed from: a */
    public static boolean m73672a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/passport/")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Map<String, String> m73671a(int i, String str, String str2) {
        IInterceptor a = C22214d.m73690a(i);
        if (a == null) {
            return new ArrayMap();
        }
        return a.tryToIntercept(str, str2, i);
    }
}
