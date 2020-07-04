package com.bytedance.opensdk.core.grant.web;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: com.bytedance.opensdk.core.grant.web.a */
public interface C12328a {
    /* renamed from: a */
    void mo30119a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo30120a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    /* renamed from: a */
    void mo30121a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    /* renamed from: a */
    void mo30122a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: a */
    boolean mo30125a(WebView webView, WebResourceRequest webResourceRequest);

    /* renamed from: a */
    boolean mo30126a(WebView webView, String str);

    /* renamed from: b */
    void mo30128b(WebView webView, String str);
}
