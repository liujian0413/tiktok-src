package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.graphics.Paint;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import com.bytedance.android.livesdk.utils.C9020a;
import com.bytedance.common.p479c.C9682a;
import com.bytedance.common.p479c.C9684b;
import com.bytedance.common.p479c.C9696e;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.browser.view.b */
public final class C4224b {

    /* renamed from: a */
    private WeakReference<Context> f12338a;

    /* renamed from: b */
    private boolean f12339b = true;

    /* renamed from: c */
    private boolean f12340c = true;

    /* renamed from: d */
    private boolean f12341d = true;

    /* renamed from: e */
    private boolean f12342e = true;

    /* renamed from: f */
    private boolean f12343f = true;

    /* renamed from: g */
    private boolean f12344g = true;

    /* renamed from: h */
    private boolean f12345h = true;

    /* renamed from: i */
    private boolean f12346i = true;

    /* renamed from: a */
    public final C4224b mo11781a(boolean z) {
        this.f12346i = z;
        return this;
    }

    /* renamed from: a */
    public static C4224b m14355a(Context context) {
        return new C4224b(context);
    }

    private C4224b(Context context) {
        this.f12338a = new WeakReference<>(context);
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m14357a(View view) {
        if (!(view instanceof WebView)) {
            return false;
        }
        WebView webView = (WebView) view;
        HitTestResult hitTestResult = webView.getHitTestResult();
        if (hitTestResult == null || webView.getSettings() == null) {
            return false;
        }
        if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
            String extra = hitTestResult.getExtra();
            Context context = webView.getContext();
            if (!(extra == null || context == null || !C9020a.m26959a(extra))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11782a(WebView webView) {
        if (webView != null && this.f12338a.get() != null) {
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(this.f12339b);
                } catch (Exception unused) {
                }
                try {
                    if (this.f12340c) {
                        settings.setSupportZoom(true);
                        settings.setBuiltInZoomControls(true);
                        C9682a.m28608a(settings, false);
                    } else {
                        settings.setSupportZoom(false);
                    }
                } catch (Throwable unused2) {
                }
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(this.f12341d);
                settings.setDomStorageEnabled(this.f12343f);
                settings.setAllowFileAccess(this.f12344g);
                settings.setBlockNetworkImage(!this.f12345h);
                if (!this.f12346i) {
                    try {
                        C0991u.m4180a((View) webView, 1, (Paint) null);
                    } catch (Throwable unused3) {
                    }
                }
                C9684b.m28616a(settings, false);
                m14356a(webView, this.f12342e);
                C9696e.m28630a(settings, 2);
                C9696e.m28631a(webView, true);
            }
        }
    }

    /* renamed from: a */
    private static void m14356a(WebView webView, boolean z) {
        if (!z) {
            webView.setOnLongClickListener(null);
            webView.setLongClickable(false);
            return;
        }
        webView.setLongClickable(true);
        webView.setOnLongClickListener(C4225c.f12347a);
    }
}
