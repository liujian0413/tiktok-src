package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C14785aq;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14816bu;
import com.google.android.gms.ads.internal.overlay.C14836c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.C15333p;
import com.google.android.gms.common.util.C15334q;
import com.google.android.gms.dynamic.C15345b;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
final class amu extends WebView implements OnGlobalLayoutListener, DownloadListener, ami {

    /* renamed from: A */
    private C15630dn f40700A;

    /* renamed from: B */
    private C15617da f40701B;

    /* renamed from: C */
    private int f40702C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f40703D;

    /* renamed from: E */
    private C15598ci f40704E;

    /* renamed from: F */
    private C15598ci f40705F;

    /* renamed from: G */
    private C15598ci f40706G;

    /* renamed from: H */
    private C15599cj f40707H;

    /* renamed from: I */
    private WeakReference<OnClickListener> f40708I;

    /* renamed from: J */
    private C14836c f40709J;

    /* renamed from: K */
    private boolean f40710K;

    /* renamed from: L */
    private afa f40711L;

    /* renamed from: M */
    private int f40712M = -1;

    /* renamed from: N */
    private int f40713N = -1;

    /* renamed from: O */
    private int f40714O = -1;

    /* renamed from: P */
    private int f40715P = -1;

    /* renamed from: Q */
    private Map<String, alb> f40716Q;

    /* renamed from: R */
    private final WindowManager f40717R;

    /* renamed from: S */
    private final bwl f40718S;

    /* renamed from: a */
    private final anu f40719a;

    /* renamed from: b */
    private final bdt f40720b;

    /* renamed from: c */
    private final zzbgz f40721c;

    /* renamed from: d */
    private final C14785aq f40722d;

    /* renamed from: e */
    private final C14816bu f40723e;

    /* renamed from: f */
    private final DisplayMetrics f40724f;

    /* renamed from: g */
    private final float f40725g;

    /* renamed from: h */
    private boolean f40726h;

    /* renamed from: i */
    private boolean f40727i;

    /* renamed from: j */
    private amj f40728j;

    /* renamed from: k */
    private C14836c f40729k;

    /* renamed from: l */
    private C15345b f40730l;

    /* renamed from: m */
    private anv f40731m;

    /* renamed from: n */
    private String f40732n;

    /* renamed from: o */
    private boolean f40733o;

    /* renamed from: p */
    private boolean f40734p;

    /* renamed from: q */
    private boolean f40735q;

    /* renamed from: r */
    private boolean f40736r;

    /* renamed from: s */
    private Boolean f40737s;

    /* renamed from: t */
    private int f40738t;

    /* renamed from: u */
    private boolean f40739u = true;

    /* renamed from: v */
    private boolean f40740v;

    /* renamed from: w */
    private String f40741w = "";

    /* renamed from: x */
    private amy f40742x;

    /* renamed from: y */
    private boolean f40743y;

    /* renamed from: z */
    private boolean f40744z;

    /* renamed from: a */
    static amu m46520a(Context context, anv anv, String str, boolean z, boolean z2, bdt bdt, zzbgz zzbgz, C15600ck ckVar, C14785aq aqVar, C14816bu buVar, bwl bwl) {
        Context context2 = context;
        amu amu = new amu(new anu(context), anv, str, z, z2, bdt, zzbgz, ckVar, aqVar, buVar, bwl);
        return amu;
    }

    /* renamed from: a */
    public final aib mo39458a() {
        return null;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    private amu(anu anu, anv anv, String str, boolean z, boolean z2, bdt bdt, zzbgz zzbgz, C15600ck ckVar, C14785aq aqVar, C14816bu buVar, bwl bwl) {
        super(anu);
        this.f40719a = anu;
        this.f40731m = anv;
        this.f40732n = str;
        this.f40735q = z;
        this.f40738t = -1;
        this.f40720b = bdt;
        this.f40721c = zzbgz;
        this.f40722d = aqVar;
        this.f40723e = buVar;
        this.f40717R = (WindowManager) getContext().getSystemService("window");
        this.f40724f = acl.m45514a(this.f40717R);
        this.f40725g = this.f40724f.density;
        this.f40718S = bwl;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            acd.m45778b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        C14793ay.m42895a().mo39171a((Context) anu, zzbgz.f45677a, settings);
        C14793ay.m42896b().mo39200a(getContext(), settings);
        setDownloadListener(this);
        m46512Q();
        if (C15333p.m44596c()) {
            addJavascriptInterface(anb.m46628a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f40711L = new afa(this.f40719a.f40772a, this, this, null);
        m46517V();
        this.f40707H = new C15599cj(new C15600ck(true, "make_wv", this.f40732n));
        this.f40707H.f44224a.mo41456a(ckVar);
        this.f40705F = C15593cd.m50345a(this.f40707H.f44224a);
        this.f40707H.mo41452a("native:view_create", this.f40705F);
        this.f40706G = null;
        this.f40704E = null;
        C14793ay.m42896b().mo39203b((Context) anu);
        C14793ay.m42898d().mo39097g();
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof amj) {
            this.f40728j = (amj) webViewClient;
        }
    }

    /* renamed from: e */
    public final C14816bu mo39467e() {
        return this.f40723e;
    }

    /* renamed from: M */
    private final boolean m46508M() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f40728j.mo39782b() && !this.f40728j.mo39783c()) {
            return false;
        }
        int b = afb.m45732b(this.f40724f, this.f40724f.widthPixels);
        int b2 = afb.m45732b(this.f40724f, this.f40724f.heightPixels);
        Activity activity = this.f40719a.f40772a;
        if (activity == null || activity.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            int[] a = acl.m45539a(activity);
            int b3 = afb.m45732b(this.f40724f, a[0]);
            i = afb.m45732b(this.f40724f, a[1]);
            i2 = b3;
        }
        if (this.f40713N == b && this.f40712M == b2 && this.f40714O == i2 && this.f40715P == i) {
            return false;
        }
        if (!(this.f40713N == b && this.f40712M == b2)) {
            z = true;
        }
        this.f40713N = b;
        this.f40712M = b2;
        this.f40714O = i2;
        this.f40715P = i;
        new C16014rs(this).mo41950a(b, b2, i2, i, this.f40724f.density, this.f40717R.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: a */
    public final void mo39809a(String str, Map<String, ?> map) {
        try {
            mo39810a(str, C14793ay.m42895a().mo39170a(map));
        } catch (JSONException unused) {
            acd.m45783e("Could not convert parameters to JSON.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo39703C()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.acd.m45784f(r2)     // Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.amu.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: c */
    private final synchronized void m46525c(String str) {
        if (!mo39703C()) {
            loadUrl(str);
        } else {
            acd.m45783e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo39703C()) {
            try {
                amv.m46599a(this, str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                C14793ay.m42898d().mo39089a(e, "AdWebViewImpl.loadUrl");
                acd.m45780c("Could not call loadUrl. ", e);
            }
        } else {
            acd.m45783e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: e */
    private final synchronized void m46526e(String str) {
        try {
            amv.m46599a(this, str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            C14793ay.m42898d().mo39089a(e, "AdWebViewImpl.loadUrlUnsafe");
            acd.m45780c("Could not call loadUrl. ", e);
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo39703C()) {
            super.loadData(str, str2, str3);
        } else {
            acd.m45783e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo39703C()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            acd.m45783e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: a */
    public final synchronized void mo39722a(String str, String str2, String str3) {
        if (!mo39703C()) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43801av)).booleanValue()) {
                str2 = ank.m46637a(str2, ank.m46636a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
            return;
        }
        acd.m45783e("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: a */
    private final synchronized void m46523a(String str, ValueCallback<String> valueCallback) {
        if (!mo39703C()) {
            evaluateJavascript(str, null);
        } else {
            acd.m45783e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: f */
    private final void m46527f(String str) {
        if (C15333p.m44598e()) {
            if (m46510O() == null) {
                m46509N();
            }
            if (m46510O().booleanValue()) {
                m46523a(str, null);
                return;
            }
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            m46525c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        String str3 = "javascript:";
        String valueOf2 = String.valueOf(str);
        m46525c(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
    }

    /* renamed from: d */
    public final void mo39815d(String str) {
        m46527f(str);
    }

    /* renamed from: N */
    private final synchronized void m46509N() {
        this.f40737s = C14793ay.m42898d().mo39091b();
        if (this.f40737s == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m46522a(Boolean.valueOf(true));
            } catch (IllegalStateException unused) {
                m46522a(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    private final void m46522a(Boolean bool) {
        synchronized (this) {
            this.f40737s = bool;
        }
        C14793ay.m42898d().mo39088a(bool);
    }

    /* renamed from: O */
    private final synchronized Boolean m46510O() {
        return this.f40737s;
    }

    /* renamed from: b */
    public final void mo39814b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        m46527f(sb.toString());
    }

    /* renamed from: a */
    public final void mo39810a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        acd.m45777b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        m46527f(sb.toString());
    }

    /* renamed from: o */
    public final void mo39745o() {
        m46511P();
        HashMap hashMap = new HashMap(1);
        hashMap.put(C38347c.f99551f, this.f40721c.f45677a);
        mo39809a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo39713a(int i) {
        if (i == 0) {
            C15593cd.m50346a(this.f40707H.f44224a, this.f40705F, "aebb2");
        }
        m46511P();
        if (this.f40707H.f44224a != null) {
            this.f40707H.f44224a.mo41458a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(C38347c.f99551f, this.f40721c.f45677a);
        mo39809a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: P */
    private final void m46511P() {
        C15593cd.m50346a(this.f40707H.f44224a, this.f40705F, "aeh2");
    }

    /* renamed from: p */
    public final void mo39748p() {
        if (this.f40704E == null) {
            C15593cd.m50346a(this.f40707H.f44224a, this.f40705F, "aes2");
            this.f40704E = C15593cd.m50345a(this.f40707H.f44224a);
            this.f40707H.mo41452a("native:view_show", this.f40704E);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(C38347c.f99551f, this.f40721c.f45677a);
        mo39809a("onshow", (Map<String, ?>) hashMap);
    }

    /* renamed from: q */
    public final void mo39749q() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C14793ay.m42899e().mo39212b()));
        hashMap.put("app_volume", String.valueOf(C14793ay.m42899e().mo39209a()));
        hashMap.put("device_volume", String.valueOf(adh.m45630a(getContext())));
        mo39809a("volume", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo39463a(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        mo39809a("onCacheAccessComplete", (Map<String, ?>) hashMap);
    }

    /* renamed from: s */
    public final synchronized C14836c mo39751s() {
        return this.f40729k;
    }

    /* renamed from: A */
    public final synchronized C15345b mo39701A() {
        return this.f40730l;
    }

    /* renamed from: t */
    public final synchronized C14836c mo39758t() {
        return this.f40709J;
    }

    /* renamed from: u */
    public final synchronized anv mo39759u() {
        return this.f40731m;
    }

    /* renamed from: v */
    public final synchronized String mo39760v() {
        return this.f40732n;
    }

    /* renamed from: x */
    public final WebViewClient mo39762x() {
        return this.f40728j;
    }

    /* renamed from: y */
    public final synchronized boolean mo39763y() {
        return this.f40733o;
    }

    /* renamed from: z */
    public final bdt mo39764z() {
        return this.f40720b;
    }

    /* renamed from: k */
    public final zzbgz mo39472k() {
        return this.f40721c;
    }

    /* renamed from: B */
    public final synchronized boolean mo39702B() {
        return this.f40735q;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            acl.m45526a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            acd.m45777b(sb.toString());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40728j.mo39783c()) {
            synchronized (this) {
                if (this.f40700A != null) {
                    this.f40700A.mo41542a(motionEvent);
                }
            }
        } else if (this.f40720b != null) {
            this.f40720b.mo40534a(motionEvent);
        }
        if (mo39703C()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() != 8 || ((axisValue <= 0.0f || canScrollVertically(-1)) && ((axisValue >= 0.0f || canScrollVertically(1)) && ((axisValue2 <= 0.0f || canScrollHorizontally(-1)) && (axisValue2 >= 0.0f || canScrollHorizontally(1)))))) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d7 A[SYNTHETIC, Splitter:B:112:0x01d7] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:122:0x01fa=Splitter:B:122:0x01fa, B:64:0x00de=Splitter:B:64:0x00de} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo39703C()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            boolean r0 = r7.f40735q     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            com.google.android.gms.internal.ads.anv r0 = r7.f40731m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo39850f()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0021
            goto L_0x01fa
        L_0x0021:
            com.google.android.gms.internal.ads.anv r0 = r7.f40731m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo39852h()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.anv r0 = r7.f40731m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo39851g()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15585bw.f43826bT     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.bt r1 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.mo41272a(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.amy r0 = r7.mo39464b()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo39582g()     // Catch:{ all -> 0x01ff }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            float r1 = (float) r9     // Catch:{ all -> 0x01ff }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01ff }
            float r2 = (float) r8     // Catch:{ all -> 0x01ff }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01ff }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01ff }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01ff }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01ff }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.anv r0 = r7.f40731m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo39848d()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15585bw.f43829bW     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.bt r1 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.mo41272a(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.C15333p.m44596c()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.amw r1 = new com.google.android.gms.internal.ads.amw     // Catch:{ all -> 0x01ff }
            r1.<init>(r7)     // Catch:{ all -> 0x01ff }
            r7.mo39721a(r0, r1)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.m46527f(r0)     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r0 = r7.f40724f     // Catch:{ all -> 0x01ff }
            float r0 = r0.density     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r1 = r7.f40703D     // Catch:{ all -> 0x01ff }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            int r9 = r7.f40703D     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.anv r0 = r7.f40731m     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.mo39849e()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.f40724f     // Catch:{ all -> 0x01ff }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r9 = r7.f40724f     // Catch:{ all -> 0x01ff }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x0118
            if (r0 != r3) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0119
        L_0x0118:
            r0 = r8
        L_0x0119:
            if (r2 == r4) goto L_0x011d
            if (r2 != r3) goto L_0x011e
        L_0x011d:
            r5 = r9
        L_0x011e:
            com.google.android.gms.internal.ads.anv r2 = r7.f40731m     // Catch:{ all -> 0x01ff }
            int r2 = r2.f40776b     // Catch:{ all -> 0x01ff }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.anv r2 = r7.f40731m     // Catch:{ all -> 0x01ff }
            int r2 = r2.f40775a     // Catch:{ all -> 0x01ff }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C15585bw.f43876cQ     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.bt r6 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x01ff }
            java.lang.Object r4 = r6.mo41272a(r4)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01ff }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r4 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.anv r4 = r7.f40731m     // Catch:{ all -> 0x01ff }
            int r4 = r4.f40776b     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r6 = r7.f40725g     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r6 = r7.f40725g     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            com.google.android.gms.internal.ads.anv r0 = r7.f40731m     // Catch:{ all -> 0x01ff }
            int r0 = r0.f40775a     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.f40725g     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01ff }
            float r5 = r7.f40725g     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            r0 = 1
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r2 == 0) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r0 = r2
        L_0x0168:
            r2 = 8
            if (r0 == 0) goto L_0x01d7
            com.google.android.gms.internal.ads.anv r0 = r7.f40731m     // Catch:{ all -> 0x01ff }
            int r0 = r0.f40776b     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.f40725g     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.anv r4 = r7.f40731m     // Catch:{ all -> 0x01ff }
            int r4 = r4.f40775a     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r5 = r7.f40725g     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01ff }
            float r8 = (float) r8     // Catch:{ all -> 0x01ff }
            float r5 = r7.f40725g     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r5 = r7.f40725g     // Catch:{ all -> 0x01ff }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ff }
            r6.<init>(r5)     // Catch:{ all -> 0x01ff }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01ff }
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "x"
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r4)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = " dp, but only has "
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            r6.append(r9)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.acd.m45783e(r8)     // Catch:{ all -> 0x01ff }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01c5
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01ff }
        L_0x01c5:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            boolean r8 = r7.f40726h     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01f8
            com.google.android.gms.internal.ads.bwl r8 = r7.f40718S     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzxh$zza$zzb r9 = com.google.android.gms.internal.ads.zzxh.zza.zzb.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01ff }
            r8.mo41410a(r9)     // Catch:{ all -> 0x01ff }
            r7.f40726h = r3     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01d7:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01e0
            r7.setVisibility(r1)     // Catch:{ all -> 0x01ff }
        L_0x01e0:
            boolean r8 = r7.f40727i     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01ed
            com.google.android.gms.internal.ads.bwl r8 = r7.f40718S     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.zzxh$zza$zzb r9 = com.google.android.gms.internal.ads.zzxh.zza.zzb.BANNER_SIZE_VALID     // Catch:{ all -> 0x01ff }
            r8.mo41410a(r9)     // Catch:{ all -> 0x01ff }
            r7.f40727i = r3     // Catch:{ all -> 0x01ff }
        L_0x01ed:
            com.google.android.gms.internal.ads.anv r8 = r7.f40731m     // Catch:{ all -> 0x01ff }
            int r8 = r8.f40776b     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.anv r9 = r7.f40731m     // Catch:{ all -> 0x01ff }
            int r9 = r9.f40775a     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
        L_0x01f8:
            monitor-exit(r7)
            return
        L_0x01fa:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01ff:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.amu.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean M = m46508M();
        C14836c s = mo39751s();
        if (s != null && M) {
            s.mo37829o();
        }
    }

    /* renamed from: a */
    public final synchronized void mo39715a(C14836c cVar) {
        this.f40729k = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo39716a(C15345b bVar) {
        this.f40730l = bVar;
    }

    /* renamed from: b */
    public final synchronized void mo39723b(C14836c cVar) {
        this.f40709J = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo39717a(anv anv) {
        this.f40731m = anv;
        requestLayout();
    }

    /* renamed from: b */
    public final synchronized void mo39726b(boolean z) {
        boolean z2 = z != this.f40735q;
        this.f40735q = z;
        m46512Q();
        if (z2) {
            new C16014rs(this).mo41954c(z ? "expanded" : "default");
        }
    }

    /* renamed from: H */
    public final void mo39708H() {
        this.f40711L.mo39269a();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo39703C()) {
            this.f40711L.mo39271c();
        }
        boolean z = this.f40743y;
        if (this.f40728j != null && this.f40728j.mo39783c()) {
            if (!this.f40744z) {
                OnGlobalLayoutListener d = this.f40728j.mo39784d();
                if (d != null) {
                    ahd.m45860a((View) this, d);
                }
                OnScrollChangedListener e = this.f40728j.mo39785e();
                if (e != null) {
                    ahd.m45861a((View) this, e);
                }
                this.f40744z = true;
            }
            m46508M();
            z = true;
        }
        m46528g(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo39703C()) {
                this.f40711L.mo39272d();
            }
            super.onDetachedFromWindow();
            if (this.f40744z && this.f40728j != null && this.f40728j.mo39783c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f40728j.mo39784d();
                if (d != null) {
                    C14793ay.m42896b().mo39198a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f40728j.mo39785e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f40744z = false;
            }
        }
        m46528g(false);
    }

    /* renamed from: a */
    public final void mo39714a(Context context) {
        this.f40719a.setBaseContext(context);
        this.f40711L.f40129a = this.f40719a.f40772a;
    }

    /* renamed from: c */
    public final synchronized void mo39727c(boolean z) {
        if (this.f40729k != null) {
            this.f40729k.mo37814a(this.f40728j.mo39782b(), z);
        } else {
            this.f40733o = z;
        }
    }

    public final synchronized int getRequestedOrientation() {
        return this.f40738t;
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f40738t = i;
        if (this.f40729k != null) {
            this.f40729k.mo37809a(this.f40738t);
        }
    }

    /* renamed from: d */
    public final Activity mo39466d() {
        return this.f40719a.f40772a;
    }

    /* renamed from: r */
    public final Context mo39750r() {
        return this.f40719a.f40773b;
    }

    /* renamed from: Q */
    private final synchronized void m46512Q() {
        if (!this.f40735q) {
            if (!this.f40731m.mo39849e()) {
                if (VERSION.SDK_INT < 18) {
                    acd.m45777b("Disabling hardware acceleration on an AdView.");
                    m46513R();
                    return;
                }
                acd.m45777b("Enabling hardware acceleration on an AdView.");
                m46514S();
                return;
            }
        }
        acd.m45777b("Enabling hardware acceleration on an overlay.");
        m46514S();
    }

    /* renamed from: R */
    private final synchronized void m46513R() {
        if (!this.f40736r) {
            setLayerType(1, null);
        }
        this.f40736r = true;
    }

    /* renamed from: S */
    private final synchronized void m46514S() {
        if (this.f40736r) {
            setLayerType(0, null);
        }
        this.f40736r = false;
    }

    public final synchronized void destroy() {
        m46517V();
        this.f40711L.mo39270b();
        if (this.f40729k != null) {
            this.f40729k.mo37808a();
            this.f40729k.mo37825k();
            this.f40729k = null;
        }
        this.f40730l = null;
        this.f40728j.mo39791k();
        if (!this.f40734p) {
            ala.m46250a((aik) this);
            m46516U();
            this.f40734p = true;
            acd.m45438a("Initiating WebView self destruct sequence in 3...");
            acd.m45438a("Loading blank page in WebView, 2...");
            m46526e("about:blank");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f40734p) {
                    this.f40728j.mo39791k();
                    ala.m46250a((aik) this);
                    m46516U();
                    m46515T();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: D */
    public final synchronized void mo39704D() {
        acd.m45438a("Destroying WebView!");
        m46515T();
        acl.f40003a.post(new amx(this));
    }

    /* renamed from: T */
    private final synchronized void m46515T() {
        if (!this.f40710K) {
            this.f40710K = true;
            C14793ay.m42898d().mo39098h();
        }
    }

    /* renamed from: C */
    public final synchronized boolean mo39703C() {
        return this.f40734p;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (!mo39703C()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (!(this.f40728j == null || this.f40728j.f40648b == null)) {
                    this.f40728j.f40648b.mo37768a();
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo39709I() {
        if (this.f40706G == null) {
            this.f40706G = C15593cd.m50345a(this.f40707H.f44224a);
            this.f40707H.mo41452a("native:view_load", this.f40706G);
        }
    }

    public final void onPause() {
        if (!mo39703C()) {
            try {
                super.onPause();
            } catch (Exception e) {
                acd.m45778b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo39703C()) {
            try {
                super.onResume();
            } catch (Exception e) {
                acd.m45778b("Could not resume webview.", e);
            }
        }
    }

    /* renamed from: L */
    public final void mo39712L() {
        acd.m45438a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: f */
    public final void mo39731f(boolean z) {
        this.f40728j.f40650d = z;
    }

    public final void stopLoading() {
        if (!mo39703C()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                acd.m45778b("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo39728d(boolean z) {
        this.f40739u = z;
    }

    /* renamed from: E */
    public final synchronized boolean mo39705E() {
        return this.f40739u;
    }

    /* renamed from: F */
    public final synchronized boolean mo39706F() {
        return this.f40740v;
    }

    /* renamed from: z_ */
    public final synchronized void mo37683z_() {
        this.f40740v = true;
        if (this.f40722d != null) {
            this.f40722d.mo37683z_();
        }
    }

    /* renamed from: A_ */
    public final synchronized void mo37682A_() {
        this.f40740v = false;
        if (this.f40722d != null) {
            this.f40722d.mo37682A_();
        }
    }

    /* renamed from: U */
    private final synchronized void m46516U() {
        if (this.f40716Q != null) {
            for (alb b : this.f40716Q.values()) {
                b.mo38266b();
            }
        }
        this.f40716Q = null;
    }

    /* renamed from: a */
    public final synchronized void mo39461a(String str, alb alb) {
        if (this.f40716Q == null) {
            this.f40716Q = new HashMap();
        }
        this.f40716Q.put(str, alb);
    }

    /* renamed from: a */
    public final synchronized alb mo39459a(String str) {
        if (this.f40716Q == null) {
            return null;
        }
        return (alb) this.f40716Q.get(str);
    }

    /* renamed from: b */
    public final synchronized void mo39724b(String str) {
        if (str == null) {
            str = "";
        }
        this.f40741w = str;
    }

    /* renamed from: g */
    public final synchronized String mo39469g() {
        return this.f40741w;
    }

    /* renamed from: n */
    public final synchronized void mo39475n() {
        if (this.f40701B != null) {
            this.f40701B.mo41478a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo39718a(C15617da daVar) {
        this.f40701B = daVar;
    }

    /* renamed from: c */
    public final C15598ci mo39465c() {
        return this.f40705F;
    }

    /* renamed from: j */
    public final C15599cj mo39471j() {
        return this.f40707H;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f40708I = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f40708I.get();
    }

    /* renamed from: a */
    public final synchronized void mo39719a(C15630dn dnVar) {
        this.f40700A = dnVar;
    }

    /* renamed from: J */
    public final synchronized C15630dn mo39710J() {
        return this.f40700A;
    }

    /* renamed from: b */
    public final synchronized amy mo39464b() {
        return this.f40742x;
    }

    /* renamed from: a */
    public final synchronized void mo39460a(amy amy) {
        if (this.f40742x != null) {
            acd.m45779c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f40742x = amy;
        }
    }

    /* renamed from: G */
    public final synchronized boolean mo39707G() {
        return this.f40702C > 0;
    }

    /* renamed from: e */
    public final synchronized void mo39730e(boolean z) {
        this.f40702C += z ? 1 : -1;
        if (this.f40702C <= 0 && this.f40729k != null) {
            this.f40729k.mo37831q();
        }
    }

    /* renamed from: V */
    private final void m46517V() {
        if (this.f40707H != null) {
            C15600ck ckVar = this.f40707H.f44224a;
            if (!(ckVar == null || C14793ay.m42898d().mo39086a() == null)) {
                C14793ay.m42898d().mo39086a().mo41449a(ckVar);
            }
        }
    }

    /* renamed from: K */
    public final void mo39711K() {
        setBackgroundColor(0);
    }

    /* renamed from: a */
    public final void mo39462a(boolean z) {
        this.f40728j.f40647a = z;
    }

    /* renamed from: f */
    public final void mo39468f() {
        C14836c s = mo39751s();
        if (s != null) {
            s.mo37830p();
        }
    }

    /* renamed from: l */
    public final int mo39473l() {
        return getMeasuredHeight();
    }

    /* renamed from: m */
    public final int mo39474m() {
        return getMeasuredWidth();
    }

    /* renamed from: a */
    public final void mo39808a(zzc zzc) {
        this.f40728j.mo39770a(zzc);
    }

    /* renamed from: a */
    public final void mo39811a(boolean z, int i) {
        this.f40728j.mo39778a(z, i);
    }

    /* renamed from: a */
    public final void mo39812a(boolean z, int i, String str) {
        this.f40728j.mo39779a(z, i, str);
    }

    /* renamed from: a */
    public final void mo39813a(boolean z, int i, String str, String str2) {
        this.f40728j.mo39780a(z, i, str, str2);
    }

    /* renamed from: a */
    public final void mo39036a(bue bue) {
        synchronized (this) {
            this.f40743y = bue.f43595a;
        }
        m46528g(bue.f43595a);
    }

    /* renamed from: g */
    private final void m46528g(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo39809a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo39721a(String str, C15742hq<? super ami> hqVar) {
        if (this.f40728j != null) {
            this.f40728j.mo39777a(str, hqVar);
        }
    }

    /* renamed from: b */
    public final void mo39725b(String str, C15742hq<? super ami> hqVar) {
        if (this.f40728j != null) {
            this.f40728j.mo39781b(str, hqVar);
        }
    }

    /* renamed from: a */
    public final void mo39720a(String str, C15334q<C15742hq<? super ami>> qVar) {
        if (this.f40728j != null) {
            this.f40728j.mo39776a(str, qVar);
        }
    }

    /* renamed from: w */
    public final /* synthetic */ anp mo39761w() {
        return this.f40728j;
    }
}
