package com.iab.omid.library.bytedance.p789b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.b.d */
public final class C18412d {

    /* renamed from: a */
    private static C18412d f49950a = new C18412d();

    private C18412d() {
    }

    /* renamed from: a */
    public static C18412d m60613a() {
        return f49950a;
    }

    /* renamed from: a */
    private void m60614a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            m60616a(sb, objArr);
            sb.append(")}");
            m60615a(webView, sb);
            return;
        }
        new StringBuilder("The WebView is null for ").append(str);
    }

    /* renamed from: a */
    private void m60615a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            C18415f.m60628a(webView, sb2);
        } else {
            handler.post(new Runnable() {
                public final void run() {
                    C18414e.m60627a(webView, sb2);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m60616a(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append('\"');
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append('\"');
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    /* renamed from: a */
    public static boolean m60617a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder("javascript: ");
        sb.append(str);
        C18415f.m60628a(webView, sb.toString());
        return true;
    }

    /* renamed from: a */
    public final void mo47844a(WebView webView) {
        m60614a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public final void mo47845a(WebView webView, float f) {
        m60614a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo47846a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m60614a(webView, "publishVideoEvent", str, jSONObject);
            return;
        }
        m60614a(webView, "publishVideoEvent", str);
    }

    /* renamed from: a */
    public final void mo47847a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        m60614a(webView, "startSession", str, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public final void mo47848a(WebView webView, JSONObject jSONObject) {
        m60614a(webView, "init", jSONObject);
    }

    /* renamed from: b */
    public final void mo47849b(WebView webView) {
        m60614a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public final void mo47850b(WebView webView, String str) {
        if (str != null) {
            m60617a(webView, "var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);".replace("%SCRIPT_SRC%", str));
        }
    }

    /* renamed from: c */
    public final void mo47851c(WebView webView, String str) {
        m60614a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: d */
    public final void mo47852d(WebView webView, String str) {
        m60614a(webView, "setState", str);
    }
}
