package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.u */
public final class C25379u implements C25965c {

    /* renamed from: a */
    public boolean f66789a;

    /* renamed from: b */
    public boolean f66790b;

    /* renamed from: c */
    public boolean f66791c;

    /* renamed from: d */
    public long f66792d;

    /* renamed from: e */
    public C25380a f66793e;

    /* renamed from: f */
    private boolean f66794f = true;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.u$a */
    public interface C25380a {
        /* renamed from: a */
        void mo65936a();

        /* renamed from: b */
        void mo65937b();

        /* renamed from: c */
        void mo65938c();
    }

    /* renamed from: a */
    public final void mo65934a() {
        this.f66794f = true;
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
    private static boolean m83504a(String str) {
        return C7573i.m23585a((Object) str, (Object) "about:blank");
    }

    /* renamed from: a */
    public final void mo65935a(boolean z) {
        this.f66791c = z;
        if (z && !this.f66789a && this.f66793e != null) {
            System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo64223a(WebView webView, String str) {
        if (!m83504a(str)) {
            if (this.f66794f) {
                this.f66794f = false;
                if (webView != null) {
                    webView.clearHistory();
                }
            }
            if (!this.f66789a && !this.f66790b && !this.f66791c) {
                this.f66789a = true;
            }
            C25380a aVar = this.f66793e;
            if (aVar != null) {
                aVar.mo65938c();
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
            boolean r1 = m83504a(r1)
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            if (r2 == 0) goto L_0x0029
            boolean r1 = r2.isForMainFrame()
            r2 = 1
            if (r1 != r2) goto L_0x0028
            r0.f66790b = r2
            com.ss.android.ugc.aweme.commercialize.utils.u$a r1 = r0.f66793e
            if (r1 == 0) goto L_0x0028
            r1.mo65937b()
            return
        L_0x0028:
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25379u.mo64221a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    /* renamed from: a */
    public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
        if (!m83504a(str)) {
            this.f66789a = false;
            this.f66790b = false;
            mo65935a(false);
            this.f66792d = System.currentTimeMillis();
            C25380a aVar = this.f66793e;
            if (aVar != null) {
                aVar.mo65936a();
            }
        }
    }

    /* renamed from: a */
    public final void mo64219a(WebView webView, int i, String str, String str2) {
        if (!m83504a(str2)) {
            this.f66790b = true;
            C25380a aVar = this.f66793e;
            if (aVar != null) {
                aVar.mo65937b();
            }
        }
    }
}
