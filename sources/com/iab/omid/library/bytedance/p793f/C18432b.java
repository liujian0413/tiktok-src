package com.iab.omid.library.bytedance.p793f;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.bytedance.f.b */
public final class C18432b extends C18430a {
    public C18432b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo47862a(webView);
    }
}
