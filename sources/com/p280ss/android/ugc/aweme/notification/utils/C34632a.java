package com.p280ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.p280ss.android.ttplatformsdk.p912c.C20430b;
import com.p280ss.android.ugc.aweme.account.C6861a;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.a */
public final class C34632a {
    /* renamed from: a */
    private static String m111887a() {
        String str;
        String[] split;
        String str2 = "";
        CookieManager instance = CookieManager.getInstance();
        if (instance == null) {
            str = "";
        } else {
            str = instance.getCookie("https://ib.snssdk.com");
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        for (String str3 : str.split(";")) {
            if (!TextUtils.isEmpty(str3)) {
                String[] split2 = str3.split("=");
                if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                    return split2[1];
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static void m111888a(Context context, String str, String str2) {
        if (C6861a.m21337f().isLogin()) {
            try {
                C20430b.m67785a(context).mo54977a(str, Long.parseLong(str2), m111887a(), null);
            } catch (Exception unused) {
            }
        }
    }
}
