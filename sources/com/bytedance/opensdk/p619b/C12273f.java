package com.bytedance.opensdk.p619b;

import android.os.Build.VERSION;
import android.webkit.WebView;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.opensdk.b.f */
public final class C12273f {

    /* renamed from: a */
    public static final C12273f f32615a = new C12273f();

    /* renamed from: b */
    private static final C12274a f32616b;

    /* renamed from: com.bytedance.opensdk.b.f$a */
    static class C12274a {
        /* renamed from: a */
        public void mo30082a(WebView webView, String str) {
            C7573i.m23587b(webView, "webView");
            C7573i.m23587b(str, "url");
            try {
                C12276g.m35688a(webView, str);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.bytedance.opensdk.b.f$b */
    static final class C12275b extends C12274a {
        /* renamed from: a */
        public final void mo30082a(WebView webView, String str) {
            C7573i.m23587b(webView, "webView");
            C7573i.m23587b(str, "url");
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
                    C12277h.m35689a(webView, str);
                } catch (Exception unused) {
                }
            }
        }
    }

    private C12273f() {
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f32616b = new C12275b();
        } else {
            f32616b = new C12274a();
        }
    }

    /* renamed from: a */
    public static void m35685a(WebView webView, String str) {
        C7573i.m23587b(webView, "webView");
        C7573i.m23587b(str, "url");
        f32616b.mo30082a(webView, str);
    }
}
