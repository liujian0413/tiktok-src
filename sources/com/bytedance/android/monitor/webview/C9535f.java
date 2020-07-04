package com.bytedance.android.monitor.webview;

import android.webkit.WebView;

/* renamed from: com.bytedance.android.monitor.webview.f */
public class C9535f implements C9533d {

    /* renamed from: a */
    private static volatile C9535f f26076a;

    private C9535f() {
    }

    /* renamed from: a */
    public static C9535f m28156a() {
        if (f26076a == null) {
            synchronized (C9535f.class) {
                if (f26076a == null) {
                    f26076a = new C9535f();
                }
            }
        }
        return f26076a;
    }

    /* renamed from: a */
    public final void mo23609a(WebView webView) {
        C9537h.m28173a().mo23635a(webView);
    }

    /* renamed from: b */
    public final void mo23614b(WebView webView) {
        C9537h.m28173a().mo23640b(webView);
    }

    /* renamed from: a */
    public final void mo23610a(WebView webView, String str) {
        C9537h.m28173a().mo23636a(webView, str);
    }

    /* renamed from: c */
    public final void mo23618c(WebView webView, String str, String str2) {
        C9537h.m28173a().mo23644c(webView, str, str2);
    }

    /* renamed from: d */
    public final void mo23619d(WebView webView, String str, String str2) {
        C9537h.m28173a().mo23645d(webView, str, str2);
    }

    /* renamed from: e */
    public final void mo23620e(WebView webView, String str, String str2) {
        C9537h.m28173a().mo23647f(webView, str, str2);
    }

    /* renamed from: f */
    public final void mo23621f(WebView webView, String str, String str2) {
        C9537h.m28173a().mo23646e(webView, str, str2);
    }

    /* renamed from: b */
    public final void mo23615b(WebView webView, String str, String str2) {
        C9537h.m28173a().mo23641b(webView, str, str2);
    }

    /* renamed from: a */
    public final void mo23611a(WebView webView, String str, String str2) {
        C9537h.m28173a().mo23637a(webView, str, str2);
    }

    /* renamed from: b */
    public final void mo23617b(WebView webView, String str, boolean z) {
        C9537h.m28173a().mo23643b(webView, str, z);
    }

    /* renamed from: a */
    public final void mo23613a(WebView webView, String str, boolean z) {
        C9537h.m28173a().mo23639a(webView, str, z);
    }

    /* renamed from: b */
    public final void mo23616b(WebView webView, String str, String str2, String str3, String str4) {
        C9537h.m28173a().mo23642b(webView, str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo23612a(WebView webView, String str, String str2, String str3, String str4) {
        C9537h.m28173a().mo23638a(webView, str, str2, str3, str4);
    }
}
