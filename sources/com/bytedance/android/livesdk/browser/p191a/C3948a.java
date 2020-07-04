package com.bytedance.android.livesdk.browser.p191a;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.web.p582a.C11092d;

/* renamed from: com.bytedance.android.livesdk.browser.a.a */
public class C3948a extends C11092d {

    /* renamed from: a */
    private WebViewClient f11788a;

    public C3948a(WebViewClient webViewClient) {
        this.f11788a = webViewClient;
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.f11788a != null) {
            this.f11788a.onPageFinished(webView, str);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.f11788a != null) {
            this.f11788a.onPageStarted(webView, str, bitmap);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (this.f11788a != null) {
            this.f11788a.onReceivedError(webView, i, str, str2);
        }
    }
}
