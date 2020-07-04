package com.bytedance.polaris.browser;

import android.content.Context;
import android.graphics.Paint;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.common.p479c.C9682a;
import com.bytedance.common.p479c.C9684b;
import com.bytedance.common.p479c.C9696e;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.polaris.browser.c */
final class C12419c {

    /* renamed from: a */
    private static Set<String> f32967a;

    /* renamed from: b */
    private WeakReference<Context> f32968b;

    /* renamed from: c */
    private boolean f32969c = true;

    /* renamed from: d */
    private boolean f32970d = true;

    /* renamed from: e */
    private boolean f32971e = true;

    /* renamed from: f */
    private boolean f32972f = true;

    /* renamed from: g */
    private boolean f32973g = true;

    /* renamed from: h */
    private boolean f32974h = true;

    /* renamed from: i */
    private boolean f32975i = true;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f32967a = linkedHashSet;
        linkedHashSet.add("device_id");
        f32967a.add("ac");
        f32967a.add("channel");
        f32967a.add("aid");
        f32967a.add("device_platform");
        f32967a.add("device_type");
        f32967a.add("os_api");
        f32967a.add("update_version_code");
    }

    /* renamed from: a */
    public final C12419c mo30302a(boolean z) {
        this.f32975i = z;
        return this;
    }

    /* renamed from: a */
    public static C12419c m36109a(Context context) {
        return new C12419c(context);
    }

    private C12419c(Context context) {
        this.f32968b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo30303a(WebView webView) {
        if (webView != null && this.f32968b.get() != null) {
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(this.f32969c);
                } catch (Exception unused) {
                }
                try {
                    if (this.f32970d) {
                        settings.setSupportZoom(true);
                        settings.setBuiltInZoomControls(true);
                        C9682a.m28608a(settings, false);
                    } else {
                        settings.setSupportZoom(false);
                    }
                } catch (Throwable unused2) {
                }
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(this.f32971e);
                settings.setDomStorageEnabled(this.f32972f);
                settings.setAllowFileAccess(this.f32973g);
                settings.setBlockNetworkImage(!this.f32974h);
                if (!this.f32975i) {
                    try {
                        C0991u.m4180a((View) webView, 1, (Paint) null);
                    } catch (Throwable unused3) {
                    }
                }
                C9684b.m28616a(webView.getSettings(), true);
                C9696e.m28630a(webView.getSettings(), 0);
                C9696e.m28631a(webView, true);
            }
        }
    }
}
