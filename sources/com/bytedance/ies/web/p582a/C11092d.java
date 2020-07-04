package com.bytedance.ies.web.p582a;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p266a.C6490c;

/* renamed from: com.bytedance.ies.web.a.d */
public class C11092d extends WebViewClient {

    /* renamed from: b */
    public C11087a f30167b;

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C6490c.m20174a(webView, renderProcessGoneDetail);
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (this.f30167b != null) {
            this.f30167b.mo27037c(str);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f30167b == null || !this.f30167b.mo27035b(str)) {
            return false;
        }
        return true;
    }
}
