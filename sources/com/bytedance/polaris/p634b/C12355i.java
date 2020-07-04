package com.bytedance.polaris.p634b;

import android.os.Build.VERSION;
import android.webkit.WebView;

/* renamed from: com.bytedance.polaris.b.i */
public final class C12355i {

    /* renamed from: a */
    static final C12357a f32803a;

    /* renamed from: com.bytedance.polaris.b.i$a */
    static class C12357a {
        private C12357a() {
        }

        /* renamed from: a */
        public void mo30197a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C12359j.m35895a(webView, str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.polaris.b.i$b */
    static class C12358b extends C12357a {
        private C12358b() {
            super();
        }

        /* renamed from: a */
        public final void mo30197a(WebView webView, String str) {
            if (webView != null) {
                boolean z = false;
                if (str != null && str.startsWith("javascript:")) {
                    try {
                        webView.evaluateJavascript(str, null);
                        z = true;
                    } catch (Throwable th) {
                        boolean z2 = th instanceof IllegalStateException;
                    }
                }
                if (!z) {
                    try {
                        C12360k.m35896a(webView, str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f32803a = new C12358b();
        } else {
            f32803a = new C12357a();
        }
    }

    /* renamed from: a */
    public static void m35892a(WebView webView, String str) {
        f32803a.mo30197a(webView, str);
    }
}
