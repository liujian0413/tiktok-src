package com.p280ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.p280ss.android.common.util.NetworkUtils;

/* renamed from: com.ss.android.ugc.aweme.account.util.g */
public final class C22328g {
    /* renamed from: a */
    public static CookieManager m73924a() {
        try {
            return CookieManager.getInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m73926b() {
        return CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost());
    }

    /* renamed from: c */
    public static String m73927c() {
        String b = m73926b();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        String str = "";
        if (!TextUtils.isEmpty(b)) {
            String[] split = b.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2)) {
                    String[] split2 = str2.split("=");
                    if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                        str = split2[1];
                        break;
                    }
                }
                i++;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m73925a(String str) {
        String cookie = CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost());
        CookieManager.getInstance().setAcceptCookie(true);
        if (!TextUtils.isEmpty(cookie)) {
            for (String cookie2 : cookie.split("; ")) {
                CookieManager.getInstance().setCookie(str, cookie2);
            }
        }
    }
}
