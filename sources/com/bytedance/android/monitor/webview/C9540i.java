package com.bytedance.android.monitor.webview;

import android.webkit.WebView;

/* renamed from: com.bytedance.android.monitor.webview.i */
public class C9540i implements C9533d {

    /* renamed from: a */
    private static volatile C9540i f26104a;

    private C9540i() {
    }

    /* renamed from: a */
    public final void mo23609a(WebView webView) {
    }

    /* renamed from: a */
    public final void mo23610a(WebView webView, String str) {
    }

    /* renamed from: a */
    public final void mo23611a(WebView webView, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo23612a(WebView webView, String str, String str2, String str3, String str4) {
    }

    /* renamed from: a */
    public final void mo23613a(WebView webView, String str, boolean z) {
    }

    /* renamed from: b */
    public final void mo23614b(WebView webView) {
    }

    /* renamed from: b */
    public final void mo23615b(WebView webView, String str, String str2) {
    }

    /* renamed from: b */
    public final void mo23616b(WebView webView, String str, String str2, String str3, String str4) {
    }

    /* renamed from: b */
    public final void mo23617b(WebView webView, String str, boolean z) {
    }

    /* renamed from: c */
    public final void mo23618c(WebView webView, String str, String str2) {
    }

    /* renamed from: d */
    public final void mo23619d(WebView webView, String str, String str2) {
    }

    /* renamed from: e */
    public final void mo23620e(WebView webView, String str, String str2) {
    }

    /* renamed from: f */
    public final void mo23621f(WebView webView, String str, String str2) {
    }

    /* renamed from: a */
    public static C9540i m28211a() {
        if (f26104a == null) {
            synchronized (C9540i.class) {
                if (f26104a == null) {
                    f26104a = new C9540i();
                }
            }
        }
        return f26104a;
    }
}
