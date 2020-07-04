package com.bytedance.android.live.core.utils;

import android.os.Build.VERSION;
import android.webkit.WebView;

/* renamed from: com.bytedance.android.live.core.utils.w */
public final class C3410w {

    /* renamed from: a */
    static final C3412a f10215a;

    /* renamed from: com.bytedance.android.live.core.utils.w$a */
    static class C3412a {
        private C3412a() {
        }

        /* renamed from: a */
        public void mo10312a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C3414x.m12674a(webView, str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.utils.w$b */
    static class C3413b extends C3412a {
        private C3413b() {
            super();
        }

        /* renamed from: a */
        public final void mo10312a(WebView webView, String str) {
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
                        C3415y.m12675a(webView, str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f10215a = new C3413b();
        } else {
            f10215a = new C3412a();
        }
    }

    /* renamed from: a */
    public static void m12671a(WebView webView, String str) {
        f10215a.mo10312a(webView, str);
    }
}
