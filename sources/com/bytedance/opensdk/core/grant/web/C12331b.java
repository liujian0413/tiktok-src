package com.bytedance.opensdk.core.grant.web;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.opensdk.core.base.config.C12310a.C12311a;
import com.example.p266a.C6490c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.grant.web.b */
public final class C12331b {

    /* renamed from: a */
    public static final C12331b f32731a = new C12331b();

    private C12331b() {
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(C12311a.m35749a());
        }
    }

    /* renamed from: a */
    public static void m35807a(WebView webView) {
        C7573i.m23587b(webView, C22912d.f60641a);
        webView.onResume();
    }

    /* renamed from: b */
    public static void m35809b(WebView webView) {
        C7573i.m23587b(webView, C22912d.f60641a);
        webView.onPause();
    }

    /* renamed from: a */
    public final WebView mo30168a(Context context) {
        C7573i.m23587b(context, "context");
        return m35808b(context);
    }

    /* renamed from: c */
    public static void m35810c(WebView webView) {
        C7573i.m23587b(webView, C22912d.f60641a);
        webView.setWebChromeClient(null);
        webView.setWebViewClient(C6490c.m20171a((WebViewClient) null));
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        try {
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static WebView m35808b(Context context) {
        WebView webView = new WebView(context.getApplicationContext());
        webView.setId(R.id.egk);
        WebSettings settings = webView.getSettings();
        C7573i.m23582a((Object) settings, "settings");
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        if (VERSION.SDK_INT >= 21) {
            webView.setNestedScrollingEnabled(true);
        }
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        return webView;
    }
}
