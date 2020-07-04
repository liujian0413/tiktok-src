package com.bytedance.common.p479c;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;

/* renamed from: com.bytedance.common.c.b */
public final class C9684b {

    /* renamed from: a */
    static final C9686a f26427a;

    /* renamed from: com.bytedance.common.c.b$a */
    static class C9686a {
        private C9686a() {
        }

        /* renamed from: a */
        public String mo24053a(Context context) {
            return null;
        }

        /* renamed from: a */
        public void mo24054a(WebSettings webSettings, boolean z) {
        }
    }

    /* renamed from: com.bytedance.common.c.b$b */
    static class C9687b extends C9686a {
        private C9687b() {
            super();
        }

        /* renamed from: a */
        public final String mo24053a(Context context) {
            try {
                return WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final void mo24054a(WebSettings webSettings, boolean z) {
            try {
                webSettings.setMediaPlaybackRequiresUserGesture(z);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f26427a = new C9687b();
        } else {
            f26427a = new C9686a();
        }
    }

    /* renamed from: a */
    public static String m28615a(Context context) {
        return f26427a.mo24053a(context);
    }

    /* renamed from: a */
    public static void m28616a(WebSettings webSettings, boolean z) {
        f26427a.mo24054a(webSettings, z);
    }
}
