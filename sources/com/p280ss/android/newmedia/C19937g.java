package com.p280ss.android.newmedia;

import android.os.Build.VERSION;
import android.webkit.WebView;

/* renamed from: com.ss.android.newmedia.g */
public final class C19937g {

    /* renamed from: a */
    static final C19939a f54030a;

    /* renamed from: com.ss.android.newmedia.g$a */
    static class C19939a {
        private C19939a() {
        }

        /* renamed from: a */
        public void mo53443a(WebView webView, String str) {
            if (webView != null) {
                try {
                    C19941h.m65776a(webView, str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.newmedia.g$b */
    static class C19940b extends C19939a {
        private C19940b() {
            super();
        }

        /* renamed from: a */
        public final void mo53443a(WebView webView, String str) {
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
                        C19942i.m65777a(webView, str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f54030a = new C19940b();
        } else {
            f54030a = new C19939a();
        }
    }

    /* renamed from: a */
    public static void m65773a(WebView webView, String str) {
        f54030a.mo53443a(webView, str);
    }
}
