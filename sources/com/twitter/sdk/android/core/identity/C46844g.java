package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p266a.C6490c;
import com.twitter.sdk.android.core.internal.p1845a.C46858f;
import java.net.URI;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: com.twitter.sdk.android.core.identity.g */
final class C46844g extends WebViewClient {

    /* renamed from: a */
    private final String f120152a;

    /* renamed from: b */
    private final C46845a f120153b;

    /* renamed from: com.twitter.sdk.android.core.identity.g$a */
    interface C46845a {
        /* renamed from: a */
        void mo117940a(Bundle bundle);

        /* renamed from: a */
        void mo117941a(WebView webView, String str);

        /* renamed from: a */
        void mo117942a(C46847i iVar);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C6490c.m20174a(webView, renderProcessGoneDetail);
    }

    C46844g(String str, C46845a aVar) {
        this.f120152a = str;
        this.f120153b = aVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f120153b.mo117941a(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(this.f120152a)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        TreeMap a = C46858f.m146569a(URI.create(str), false);
        Bundle bundle = new Bundle(a.size());
        for (Entry entry : a.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        this.f120153b.mo117940a(bundle);
        return true;
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.f120153b.mo117942a(new C46847i(sslError.getPrimaryError(), null, null));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.f120153b.mo117942a(new C46847i(i, str, str2));
    }
}
