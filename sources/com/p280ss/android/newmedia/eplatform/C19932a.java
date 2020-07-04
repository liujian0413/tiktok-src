package com.p280ss.android.newmedia.eplatform;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p280ss.android.newmedia.C19944k;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.p971p.C21766a;

/* renamed from: com.ss.android.newmedia.eplatform.a */
public final class C19932a {
    /* renamed from: a */
    public static boolean m65763a(String str) {
        try {
            return TextUtils.equals(Uri.parse(str).getQueryParameter("bbb815f4751d8b93e7f52e43a9a5c429"), "1");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static Boolean m65762a(WebView webView, String str, Boolean bool) {
        if (bool.booleanValue()) {
            if (C21766a.m72786e() == 1 && C19944k.m65783a(str)) {
                C19944k.m65781a(webView);
                return Boolean.valueOf(true);
            } else if (C21766a.m72786e() == 2) {
                if (!TextUtils.isEmpty(str) && ((str.startsWith("http://") || str.startsWith("https://")) && !((SingleWebView) webView).isVisited(str))) {
                    C19944k.m65782a(webView, str);
                    return Boolean.valueOf(true);
                } else if (C19944k.m65783a(str)) {
                    C19944k.m65781a(webView);
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }
}
