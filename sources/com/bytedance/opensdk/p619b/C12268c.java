package com.bytedance.opensdk.p619b;

import android.os.Build.VERSION;
import android.webkit.WebView;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.opensdk.b.c */
public final class C12268c {

    /* renamed from: a */
    public static final C12268c f32613a = new C12268c();

    /* renamed from: b */
    private static final C12269a f32614b;

    /* renamed from: com.bytedance.opensdk.b.c$a */
    public static class C12269a {
        /* renamed from: a */
        public void mo30081a(WebView webView, String str) {
            C7573i.m23587b(str, "url");
            if (webView != null) {
                try {
                    C12271d.m35683a(webView, str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.opensdk.b.c$b */
    static final class C12270b extends C12269a {
        /* renamed from: a */
        public final void mo30081a(WebView webView, String str) {
            C7573i.m23587b(str, "url");
            if (webView != null) {
                boolean z = false;
                if (C7634n.m23721b(str, "javascript:", false)) {
                    try {
                        webView.evaluateJavascript(str, null);
                        z = true;
                    } catch (Throwable th) {
                        boolean z2 = th instanceof IllegalStateException;
                    }
                }
                if (!z) {
                    try {
                        C12272e.m35684a(webView, str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private C12268c() {
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f32614b = new C12270b();
        } else {
            f32614b = new C12269a();
        }
    }

    /* renamed from: a */
    public static void m35680a(WebView webView, String str) {
        C7573i.m23587b(webView, "webView");
        C7573i.m23587b(str, "url");
        f32614b.mo30081a(webView, str);
    }
}
