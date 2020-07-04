package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
public class aok extends aog implements aoo {

    /* renamed from: a */
    private final aoi f40871a;

    /* renamed from: b */
    private boolean f40872b;

    /* renamed from: c */
    private boolean f40873c;

    public aok(Context context, aoi aoi) {
        super(context);
        C14793ay.m42898d().mo39097g();
        this.f40871a = aoi;
        super.setWebViewClient(aoi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo39876g(boolean z) {
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    /* renamed from: C */
    public final synchronized boolean mo39897C() {
        return this.f40872b;
    }

    public synchronized void destroy() {
        if (!this.f40872b) {
            this.f40872b = true;
            this.f40871a.f40866d = this;
            mo39876g(false);
            acd.m45438a("Initiating WebView self destruct sequence in 3...");
            acd.m45438a("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                C14793ay.m42898d().mo39089a((Throwable) e, "AdWebViewImpl.loadUrlUnsafe");
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo39899a(aoj aoj) {
        acd.m45438a("Blank page loaded, 1...");
        mo39704D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public synchronized void mo39704D() {
        acd.m45438a("Destroying WebView!");
        mo39458a();
        ago.f40189a.execute(new aol(this));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!mo39897C()) {
                    mo39876g(true);
                }
                mo39458a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: a */
    private final synchronized void mo39458a() {
        if (!this.f40873c) {
            this.f40873c = true;
            C14793ay.m42898d().mo39098h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo39897C()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.acd.m45783e(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aok.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public synchronized void loadUrl(String str) {
        if (!mo39897C()) {
            super.loadUrl(str);
        } else {
            acd.m45783e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!mo39897C()) {
            super.loadData(str, str2, str3);
        } else {
            acd.m45783e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo39897C()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            acd.m45783e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !mo39897C() && super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!mo39897C()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!mo39897C()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!mo39897C()) {
            super.onResume();
        }
    }

    public void stopLoading() {
        if (!mo39897C()) {
            super.stopLoading();
        }
    }

    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo39815d(String str) {
        super.mo39815d(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public final /* synthetic */ void mo39898M() {
        super.destroy();
    }
}
