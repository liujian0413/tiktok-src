package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.common.util.C15333p;

@C6505uv
final class aom {

    /* renamed from: a */
    private static Boolean f40875a;

    private aom() {
    }

    /* renamed from: a */
    private static boolean m46815a(WebView webView) {
        boolean booleanValue;
        synchronized (aom.class) {
            if (f40875a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f40875a = Boolean.valueOf(true);
                } catch (IllegalStateException unused) {
                    f40875a = Boolean.valueOf(false);
                }
            }
            booleanValue = f40875a.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    static void m46814a(WebView webView, String str) {
        if (!C15333p.m44598e() || !m46815a(webView)) {
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            aon.m46816a(webView, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        webView.evaluateJavascript(str, null);
    }
}
