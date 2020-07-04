package com.p280ss.android.newmedia.p897ui.webview;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.config.AppConfig;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.newmedia.C19937g;
import java.util.HashMap;

/* renamed from: com.ss.android.newmedia.ui.webview.h */
public final class C20006h {

    /* renamed from: a */
    private static String f54138a;

    /* renamed from: b */
    private static boolean f54139b;

    /* renamed from: a */
    public static final void m65928a(String str, WebView webView) {
        m65929a(str, webView, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m65927a(android.content.Context r2, android.webkit.WebView r3) {
        /*
            if (r3 == 0) goto L_0x000d
            android.webkit.WebSettings r0 = r3.getSettings()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getUserAgentString()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r1 != 0) goto L_0x0017
            f54138a = r0
            return r0
        L_0x0017:
            java.lang.String r0 = f54138a
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r0 != 0) goto L_0x0022
            java.lang.String r2 = f54138a
            return r2
        L_0x0022:
            java.lang.String r0 = com.bytedance.common.p479c.C9684b.m28615a(r2)
            f54138a = r0
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r2 = f54138a
            return r2
        L_0x0031:
            boolean r0 = f54139b
            if (r0 != 0) goto L_0x0057
            if (r3 != 0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0057
            r3 = 1
            f54139b = r3
            android.webkit.WebView r3 = new android.webkit.WebView     // Catch:{ Throwable -> 0x0057 }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x0057 }
            android.webkit.WebSettings r2 = r3.getSettings()     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r0 = "newWebview.settings"
            kotlin.jvm.internal.C7573i.m23582a(r2, r0)     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r2 = r2.getUserAgentString()     // Catch:{ Throwable -> 0x0057 }
            f54138a = r2     // Catch:{ Throwable -> 0x0057 }
            r3.destroy()     // Catch:{ Throwable -> 0x0057 }
        L_0x0057:
            java.lang.String r2 = f54138a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.p897ui.webview.C20006h.m65927a(android.content.Context, android.webkit.WebView):java.lang.String");
    }

    /* renamed from: a */
    private static void m65929a(String str, WebView webView, HashMap<String, String> hashMap) {
        if (webView != null && !C6319n.m19593a(str)) {
            boolean a = C19929d.m65759a(str);
            Context context = webView.getContext();
            if (!(webView instanceof SSWebView) && a && context != null) {
                str = AppConfig.getInstance(context).filterUrlOnUIThread(str);
            }
            C19937g.m65773a(webView, str);
        }
    }
}
