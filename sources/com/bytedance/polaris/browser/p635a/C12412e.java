package com.bytedance.polaris.browser.p635a;

import android.os.Build.VERSION;
import android.webkit.WebView;

/* renamed from: com.bytedance.polaris.browser.a.e */
public final class C12412e {

    /* renamed from: a */
    static final C12414a f32966a;

    /* renamed from: com.bytedance.polaris.browser.a.e$a */
    static class C12414a {
        private C12414a() {
        }

        /* renamed from: a */
        public void mo30301a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C12416f.m36106a(webView, str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.polaris.browser.a.e$b */
    static class C12415b extends C12414a {
        private C12415b() {
            super();
        }

        /* renamed from: a */
        public final void mo30301a(WebView webView, String str) {
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
                        C12417g.m36107a(webView, str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f32966a = new C12415b();
        } else {
            f32966a = new C12414a();
        }
    }

    /* renamed from: a */
    public static void m36103a(WebView webView, String str) {
        f32966a.mo30301a(webView, str);
    }
}
