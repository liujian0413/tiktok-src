package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.m */
public final class C25369m implements C25965c {

    /* renamed from: a */
    public boolean f66774a;

    /* renamed from: b */
    public boolean f66775b;

    /* renamed from: c */
    public boolean f66776c;

    /* renamed from: d */
    public long f66777d;

    /* renamed from: e */
    public C25370a f66778e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.m$a */
    public interface C25370a {
        /* renamed from: a */
        void mo65927a();

        /* renamed from: a */
        void mo65928a(long j);

        /* renamed from: b */
        void mo65929b();

        /* renamed from: c */
        void mo65930c();
    }

    /* renamed from: a */
    public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: a */
    public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    /* renamed from: b */
    public final boolean mo64225b(WebView webView, String str) {
        return false;
    }

    /* renamed from: a */
    private static boolean m83416a(String str) {
        return C7573i.m23585a((Object) str, (Object) "about:blank");
    }

    /* renamed from: a */
    public final void mo65926a(boolean z) {
        this.f66776c = z;
        if (z && !this.f66774a) {
            C25370a aVar = this.f66778e;
            if (aVar != null) {
                aVar.mo65930c();
            }
        }
    }

    /* renamed from: a */
    public final void mo64223a(WebView webView, String str) {
        if (!m83416a(str) && !this.f66774a && !this.f66775b && !this.f66776c) {
            this.f66774a = true;
            C25370a aVar = this.f66778e;
            if (aVar != null) {
                aVar.mo65928a(System.currentTimeMillis() - this.f66777d);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64221a(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceError r3) {
        /*
            r0 = this;
            if (r2 == 0) goto L_0x000d
            android.net.Uri r1 = r2.getUrl()
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = r1.toString()
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r1 = m83416a(r1)
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            if (r2 == 0) goto L_0x0029
            boolean r1 = r2.isForMainFrame()
            r2 = 1
            if (r1 != r2) goto L_0x0028
            r0.f66775b = r2
            com.ss.android.ugc.aweme.commercialize.utils.m$a r1 = r0.f66778e
            if (r1 == 0) goto L_0x0028
            r1.mo65929b()
            return
        L_0x0028:
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25369m.mo64221a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    /* renamed from: a */
    public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
        if (!m83416a(str)) {
            this.f66774a = false;
            this.f66775b = false;
            mo65926a(false);
            this.f66777d = System.currentTimeMillis();
            C25370a aVar = this.f66778e;
            if (aVar != null) {
                aVar.mo65927a();
            }
        }
    }

    /* renamed from: a */
    public final void mo64219a(WebView webView, int i, String str, String str2) {
        if (!m83416a(str2)) {
            this.f66775b = true;
            C25370a aVar = this.f66778e;
            if (aVar != null) {
                aVar.mo65929b();
            }
        }
    }
}
