package com.p280ss.android.ugc.aweme.app.application;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.ies.ugc.aweme.network.C10944e;

/* renamed from: com.ss.android.ugc.aweme.app.application.f */
public final class C22868f {
    /* renamed from: a */
    public static String m75331a() {
        String[] split;
        try {
            if (C10944e.m32115b() == null) {
                return "";
            }
            String cookie = CookieManager.getInstance().getCookie(C10944e.m32115b().f29628j);
            if (TextUtils.isEmpty(cookie)) {
                return "";
            }
            if (cookie.contains("sessionid=")) {
                for (String str : cookie.split(";")) {
                    if (str.trim().startsWith("sessionid=")) {
                        return str.substring(11);
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
        }
    }
}
