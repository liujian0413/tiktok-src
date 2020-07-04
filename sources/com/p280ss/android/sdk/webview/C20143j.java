package com.p280ss.android.sdk.webview;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.web.p582a.C11092d;
import com.example.p266a.C6490c;
import com.p280ss.android.ugc.aweme.lancet.network.C32283c;

/* renamed from: com.ss.android.sdk.webview.j */
public class C20143j extends C11092d {

    /* renamed from: a */
    private WebViewClient f54519a;

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        C32283c.m104805a(str);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C6490c.m20174a(webView, renderProcessGoneDetail);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C32283c.m104805a(str);
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.f54519a != null) {
            this.f54519a.onPageFinished(webView, str);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f54519a != null) {
            this.f54519a.onPageStarted(webView, str, bitmap);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f54519a != null) {
            this.f54519a.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (this.f54519a != null) {
            this.f54519a.onReceivedError(webView, i, str, str2);
        }
    }
}
