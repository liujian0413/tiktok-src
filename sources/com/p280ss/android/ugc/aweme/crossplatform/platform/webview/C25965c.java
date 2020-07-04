package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.c */
public interface C25965c {
    /* renamed from: a */
    void mo64219a(WebView webView, int i, String str, String str2);

    /* renamed from: a */
    void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    /* renamed from: a */
    void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    /* renamed from: a */
    void mo64223a(WebView webView, String str);

    /* renamed from: a */
    void mo64224a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: b */
    boolean mo64225b(WebView webView, String str);
}
