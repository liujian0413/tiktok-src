package com.p280ss.android.sdk.webview;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.p555c.C10702a;
import com.bytedance.ies.p555c.C10713b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.sdk.webview.h */
public final class C20140h {

    /* renamed from: a */
    private C10702a f54515a;

    /* renamed from: b */
    private C20141a f54516b;

    /* renamed from: com.ss.android.sdk.webview.h$a */
    public interface C20141a {
        /* renamed from: a */
        WebResourceResponse mo53904a(String str);
    }

    /* renamed from: a */
    public final C20140h mo53901a(C20141a aVar) {
        this.f54516b = aVar;
        return this;
    }

    /* renamed from: a */
    public final C20140h mo53900a(C10713b bVar) {
        this.f54515a.mo25585a(bVar);
        return this;
    }

    /* renamed from: a */
    public final C20140h mo53902a(List<Pattern> list) {
        this.f54515a.mo25586a(list);
        return this;
    }

    public C20140h(String str) {
        this.f54515a = C10702a.m31260a(C6399b.m19921a(), C6399b.m19934j(), AppLog.getServerDeviceId(), str);
    }

    /* renamed from: a */
    public final C20140h mo53903a(boolean z) {
        this.f54515a.mo25587a(z);
        return this;
    }

    /* renamed from: a */
    public final synchronized WebResourceResponse mo53899a(WebView webView, String str) {
        if (this.f54516b != null) {
            WebResourceResponse a = this.f54516b.mo53904a(str);
            if (a != null) {
                return a;
            }
        }
        try {
            return this.f54515a.mo25584a(webView, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
