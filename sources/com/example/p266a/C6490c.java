package com.example.p266a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.example.a.c */
public final class C6490c {

    /* renamed from: a */
    private static C6489a f18811a;

    /* renamed from: a */
    public static C6489a m20172a() {
        return f18811a;
    }

    /* renamed from: a */
    public static void m20173a(C6489a aVar) {
        f18811a = aVar;
    }

    /* renamed from: a */
    public static WebViewClient m20171a(WebViewClient webViewClient) {
        if (webViewClient == null || !"android.webkit.WebViewClient".equals(webViewClient.getClass().getName())) {
            return webViewClient;
        }
        return new C13071b();
    }

    /* renamed from: a */
    public static boolean m20174a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (m20172a() != null) {
            return m20172a().mo15806a(webView, renderProcessGoneDetail);
        }
        return true;
    }
}
