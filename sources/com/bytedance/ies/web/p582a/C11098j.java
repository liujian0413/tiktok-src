package com.bytedance.ies.web.p582a;

import android.os.Build.VERSION;
import android.webkit.WebView;

/* renamed from: com.bytedance.ies.web.a.j */
public final class C11098j {

    /* renamed from: a */
    static final C11100a f30174a;

    /* renamed from: com.bytedance.ies.web.a.j$a */
    static class C11100a {
        private C11100a() {
        }

        /* renamed from: a */
        public void mo27075a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C11102k.m32515a(webView, str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.web.a.j$b */
    static class C11101b extends C11100a {
        private C11101b() {
            super();
        }

        /* renamed from: a */
        public final void mo27075a(WebView webView, String str) {
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
                        C11103l.m32516a(webView, str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f30174a = new C11101b();
        } else {
            f30174a = new C11100a();
        }
    }

    /* renamed from: a */
    public static void m32512a(WebView webView, String str) {
        f30174a.mo27075a(webView, str);
    }
}
