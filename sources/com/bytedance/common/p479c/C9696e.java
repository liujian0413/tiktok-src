package com.bytedance.common.p479c;

import android.os.Build.VERSION;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.bytedance.common.c.e */
public final class C9696e {

    /* renamed from: a */
    static final C9698a f26430a;

    /* renamed from: com.bytedance.common.c.e$a */
    static class C9698a {
        private C9698a() {
        }

        /* renamed from: a */
        public void mo24058a(WebSettings webSettings, int i) {
        }

        /* renamed from: a */
        public void mo24059a(WebView webView, boolean z) {
        }
    }

    /* renamed from: com.bytedance.common.c.e$b */
    static class C9699b extends C9698a {
        private C9699b() {
            super();
        }

        /* renamed from: a */
        public final void mo24058a(WebSettings webSettings, int i) {
            if (webSettings != null) {
                try {
                    webSettings.setMixedContentMode(i);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo24059a(WebView webView, boolean z) {
            if (webView != null) {
                try {
                    CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
                } catch (Exception unused) {
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f26430a = new C9699b();
        } else {
            f26430a = new C9698a();
        }
    }

    /* renamed from: a */
    public static void m28630a(WebSettings webSettings, int i) {
        f26430a.mo24058a(webSettings, i);
    }

    /* renamed from: a */
    public static void m28631a(WebView webView, boolean z) {
        f26430a.mo24059a(webView, true);
    }
}
