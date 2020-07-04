package com.p280ss.android.ugc.aweme.web;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.example.p266a.C6490c;

/* renamed from: com.ss.android.ugc.aweme.web.g */
public class C43443g extends WebViewClient {
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C6490c.m20174a(webView, renderProcessGoneDetail);
    }

    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        new C10741a(webView.getContext()).mo25660b("notification error ssl cert invalid").mo25654a("continue", (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                sslErrorHandler.proceed();
            }
        }).mo25661b("cancel", (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                sslErrorHandler.cancel();
            }
        }).mo25656a().mo25637a();
    }
}
