package com.p280ss.android.p817ad.splash.p836g;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ss.android.ad.splash.g.o */
public final class C19138o {
    /* renamed from: c */
    private static boolean m62755c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("sslocal://");
    }

    /* renamed from: a */
    public static boolean m62753a(String str) {
        if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m62754b(String str) {
        if (!m62755c(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if ("microapp".equals(host) || "microgame".equals(host)) {
            return true;
        }
        return false;
    }
}
