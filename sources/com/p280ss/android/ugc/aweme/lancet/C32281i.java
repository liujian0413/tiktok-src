package com.p280ss.android.ugc.aweme.lancet;

import com.bytedance.ies.bullet.kit.web.WebKitApi;

/* renamed from: com.ss.android.ugc.aweme.lancet.i */
public final class C32281i {

    /* renamed from: a */
    public static boolean f84347a;

    /* renamed from: a */
    public static String m104803a(String str) {
        if (str == null || !str.startsWith(WebKitApi.SCHEME_HTTP) || str.startsWith(WebKitApi.SCHEME_HTTPS)) {
            return str;
        }
        return str.replaceFirst(WebKitApi.SCHEME_HTTP, WebKitApi.SCHEME_HTTPS);
    }
}
