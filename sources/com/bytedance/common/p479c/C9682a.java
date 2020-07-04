package com.bytedance.common.p479c;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.c.a */
public final class C9682a {

    /* renamed from: a */
    static Method f26424a;

    /* renamed from: b */
    static Method f26425b;

    /* renamed from: c */
    static boolean f26426c;

    /* renamed from: com.bytedance.common.c.a$a */
    static class C9683a {
        /* renamed from: b */
        public static void m28614b(WebView webView) {
            webView.onResume();
        }

        /* renamed from: a */
        public static int m28611a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }

        /* renamed from: a */
        public static void m28613a(WebView webView) {
            webView.onPause();
        }

        /* renamed from: a */
        public static void m28612a(WebSettings webSettings, boolean z) {
            webSettings.setDisplayZoomControls(z);
        }
    }

    /* renamed from: a */
    private static void m28607a() {
        if (!f26426c) {
            f26426c = true;
            try {
                f26424a = WebView.class.getMethod("onPause", null);
                f26425b = WebView.class.getMethod("onResume", null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m28606a(ActivityManager activityManager) {
        if (VERSION.SDK_INT < 11) {
            return -1;
        }
        try {
            return C9683a.m28611a(activityManager);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static void m28610b(WebView webView) {
        if (webView != null) {
            if (VERSION.SDK_INT >= 11) {
                C9683a.m28614b(webView);
                return;
            }
            m28607a();
            if (f26425b != null) {
                try {
                    f26425b.invoke(webView, null);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m28609a(WebView webView) {
        if (webView != null) {
            if (VERSION.SDK_INT >= 11) {
                C9683a.m28613a(webView);
                return;
            }
            m28607a();
            if (f26424a != null) {
                try {
                    f26424a.invoke(webView, null);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m28608a(WebSettings webSettings, boolean z) {
        if (VERSION.SDK_INT >= 11) {
            C9683a.m28612a(webSettings, false);
        }
    }
}
