package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class buz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bur f43680a;

    /* renamed from: b */
    final /* synthetic */ WebView f43681b;

    /* renamed from: c */
    final /* synthetic */ boolean f43682c;

    /* renamed from: d */
    final /* synthetic */ bux f43683d;

    /* renamed from: e */
    private ValueCallback<String> f43684e = new bva(this);

    buz(bux bux, bur bur, WebView webView, boolean z) {
        this.f43683d = bux;
        this.f43680a = bur;
        this.f43681b = webView;
        this.f43682c = z;
    }

    public final void run() {
        if (this.f43681b.getSettings().getJavaScriptEnabled()) {
            try {
                this.f43681b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f43684e);
            } catch (Throwable unused) {
                this.f43684e.onReceiveValue("");
            }
        }
    }
}
