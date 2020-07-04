package com.example.p266a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.example.a.b */
public final class C13071b extends WebViewClient {
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (C6490c.m20172a() != null) {
            return C6490c.m20172a().mo15806a(webView, renderProcessGoneDetail);
        }
        return true;
    }
}
