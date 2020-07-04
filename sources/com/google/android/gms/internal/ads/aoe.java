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
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

@C6505uv
final class aoe extends aok implements OnGlobalLayoutListener, DownloadListener, ami, C15844lk {

    /* renamed from: A */
    private C15598ci f40825A;

    /* renamed from: B */
    private C15599cj f40826B;

    /* renamed from: C */
    private WeakReference<OnClickListener> f40827C;

    /* renamed from: D */
    private C14836c f40828D;

    /* renamed from: E */
    private afa f40829E;

    /* renamed from: F */
    private final AtomicReference<C15345b> f40830F = new AtomicReference<>();

    /* renamed from: G */
    private int f40831G = -1;

    /* renamed from: H */
    private int f40832H = -1;

    /* renamed from: I */
    private int f40833I = -1;

    /* renamed from: J */
    private int f40834J = -1;

    /* renamed from: K */
    private Map<String, alb> f40835K;

    /* renamed from: L */
    private final WindowManager f40836L;

    /* renamed from: a */
    private final anu f40837a;

    /* renamed from: b */
    private final anw f40838b;

    /* renamed from: c */
    private final bdt f40839c;

    /* renamed from: d */
    private final zzbgz f40840d;

    /* renamed from: e */
    private final C14785aq f40841e;

    /* renamed from: f */
    private final C14816bu f40842f;

    /* renamed from: g */
    private final DisplayMetrics f40843g;

    /* renamed from: h */
    private C14836c f40844h;

    /* renamed from: i */
    private anv f40845i;

    /* renamed from: j */
    private String f40846j;

    /* renamed from: k */
    private boolean f40847k;

    /* renamed from: l */
    private boolean f40848l;

    /* renamed from: m */
    private boolean f40849m;

    /* renamed from: n */
    private int f40850n;

    /* renamed from: o */
    private boolean f40851o = true;

    /* renamed from: p */
    private boolean f40852p;

    /* renamed from: q */
    private String f40853q = "";

    /* renamed from: r */
    private amy f40854r;

    /* renamed from: s */
    private boolean f40855s;

    /* renamed from: t */
    private boolean f40856t;

    /* renamed from: u */
    private C15630dn f40857u;

    /* renamed from: v */
    private C15617da f40858v;

    /* renamed from: w */
    private int f40859w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f40860x;

    /* renamed from: y */
    private C15598ci f40861y;

    /* renamed from: z */
    private C15598ci f40862z;

    protected aoe(anu anu, anw anw, anv anv, String str, boolean z, boolean z2, bdt bdt, zzbgz zzbgz, C15600ck ckVar, C14785aq aqVar, C14816bu buVar) {
        super(anu, anw);
        this.f40837a = anu;
        this.f40838b = anw;
        this.f40845i = anv;
        this.f40846j = str;
        this.f40848l = z;
        this.f40850n = -1;
        this.f40839c = bdt;
        this.f40840d = zzbgz;
        this.f40841e = aqVar;
        this.f40842f = buVar;
        this.f40836L = (WindowManager) getContext().getSystemService("window");
        this.f40843g = acl.m45514a(this.f40836L);
        this.f40829E = new afa(this.f40837a.f40772a, this, this, null);
        C14793ay.m42895a().mo39171a((Context) anu, zzbgz.f45677a, getSettings());
        setDownloadListener(this);
        m46720P();
        if (C15333p.m44596c()) {
            addJavascriptInterface(anb.m46628a(this), "googleAdsJsInterface");
        }
        m46724T();
        this.f40826B = new C15599cj(new C15600ck(true, "make_wv", this.f40846j));
        this.f40826B.f44224a.mo41456a(ckVar);
        this.f40862z = C15593cd.m50345a(this.f40826B.f44224a);
        this.f40826B.mo41452a("native:view_create", this.f40862z);
        this.f40825A = null;
        this.f40861y = null;
        C14793ay.m42896b().mo39203b((Context) anu);
    }

    /* renamed from: D */
    public final void mo39704D() {
    }

    /* renamed from: a */
    public final aib mo39458a() {
        return null;
    }

    /* renamed from: a */
    public final void mo39875a(String str, String str2) {
        C15845ll.m51279a((C15844lk) this, str, str2);
    }

    /* renamed from: a */
    public final void mo39809a(String str, Map map) {
        C15845ll.m51280a((C15844lk) this, str, map);
    }

    /* renamed from: a */
    public final void mo39810a(String str, JSONObject jSONObject) {
        C15845ll.m51282b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo39814b(String str, JSONObject jSONObject) {
        C15845ll.m51281a((C15844lk) this, str, jSONObject);
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: e */
    public final C14816bu mo39467e() {
        return this.f40842f;
    }

    /* renamed from: N */
    private final boolean m46718N() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f40838b.mo39782b() && !this.f40838b.mo39863c()) {
            return false;
        }
        int b = afb.m45732b(this.f40843g, this.f40843g.widthPixels);
        int b2 = afb.m45732b(this.f40843g, this.f40843g.heightPixels);
        Activity activity = this.f40837a.f40772a;
        if (activity == null || activity.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            int[] a = acl.m45539a(activity);
            int b3 = afb.m45732b(this.f40843g, a[0]);
            i = afb.m45732b(this.f40843g, a[1]);
            i2 = b3;
        }
        if (this.f40832H == b && this.f40831G == b2 && this.f40833I == i2 && this.f40834J == i) {
            return false;
        }
        if (!(this.f40832H == b && this.f40831G == b2)) {
            z = true;
        }
        this.f40832H = b;
        this.f40831G = b2;
        this.f40833I = i2;
        this.f40834J = i;
        new C16014rs(this).mo41950a(b, b2, i2, i, this.f40843g.density, this.f40836L.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo39722a(String str, String str2, String str3) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43801av)).booleanValue()) {
            str2 = ank.m46637a(str2, ank.m46636a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    /* renamed from: d */
    public final synchronized void mo39815d(String str) {
        if (!mo39897C()) {
            super.mo39815d(str);
        } else {
            acd.m45783e("The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: o */
    public final void mo39745o() {
        m46719O();
        HashMap hashMap = new HashMap(1);
        hashMap.put(C38347c.f99551f, this.f40840d.f45677a);
        C15845ll.m51280a((C15844lk) this, "onhide", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo39713a(int i) {
        if (i == 0) {
            C15593cd.m50346a(this.f40826B.f44224a, this.f40862z, "aebb2");
        }
        m46719O();
        if (this.f40826B.f44224a != null) {
            this.f40826B.f44224a.mo41458a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(C38347c.f99551f, this.f40840d.f45677a);
        C15845ll.m51280a((C15844lk) this, "onhide", (Map) hashMap);
    }

    /* renamed from: O */
    private final void m46719O() {
        C15593cd.m50346a(this.f40826B.f44224a, this.f40862z, "aeh2");
    }

    /* renamed from: p */
    public final void mo39748p() {
        if (this.f40861y == null) {
            C15593cd.m50346a(this.f40826B.f44224a, this.f40862z, "aes2");
            this.f40861y = C15593cd.m50345a(this.f40826B.f44224a);
            this.f40826B.mo41452a("native:view_show", this.f40861y);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(C38347c.f99551f, this.f40840d.f45677a);
        C15845ll.m51280a((C15844lk) this, "onshow", (Map) hashMap);
    }

    /* renamed from: q */
    public final void mo39749q() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C14793ay.m42899e().mo39212b()));
        hashMap.put("app_volume", String.valueOf(C14793ay.m42899e().mo39209a()));
        hashMap.put("device_volume", String.valueOf(adh.m45630a(getContext())));
        C15845ll.m51280a((C15844lk) this, "volume", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo39463a(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        C15845ll.m51280a((C15844lk) this, "onCacheAccessComplete", (Map) hashMap);
    }

    /* renamed from: s */
    public final synchronized C14836c mo39751s() {
        return this.f40844h;
    }

    /* renamed from: A */
    public final C15345b mo39701A() {
        return (C15345b) this.f40830F.get();
    }

    /* renamed from: t */
    public final synchronized C14836c mo39758t() {
        return this.f40828D;
    }

    /* renamed from: u */
    public final synchronized anv mo39759u() {
        return this.f40845i;
    }

    /* renamed from: v */
    public final synchronized String mo39760v() {
        return this.f40846j;
    }

    /* renamed from: x */
    public final WebViewClient mo39762x() {
        return this.f40838b;
    }

    /* renamed from: y */
    public final synchronized boolean mo39763y() {
        return this.f40847k;
    }

    /* renamed from: z */
    public final bdt mo39764z() {
        return this.f40839c;
    }

    /* renamed from: k */
    public final zzbgz mo39472k() {
        return this.f40840d;
    }

    /* renamed from: B */
    public final synchronized boolean mo39702B() {
        return this.f40848l;
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
        if (this.f40838b.mo39863c()) {
            synchronized (this) {
                if (this.f40857u != null) {
                    this.f40857u.mo41542a(motionEvent);
                }
            }
        } else if (this.f40839c != null) {
            this.f40839c.mo40534a(motionEvent);
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
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d8 A[SYNTHETIC, Splitter:B:109:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x00de=Splitter:B:64:0x00de, B:116:0x01ee=Splitter:B:116:0x01ee} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo39897C()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r7.f40848l     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            com.google.android.gms.internal.ads.anv r0 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo39850f()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01ee
        L_0x0021:
            com.google.android.gms.internal.ads.anv r0 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo39852h()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.anv r0 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo39851g()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15585bw.f43826bT     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.bt r1 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.mo41272a(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.amy r0 = r7.mo39464b()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo39582g()     // Catch:{ all -> 0x01f3 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
            float r1 = (float) r9     // Catch:{ all -> 0x01f3 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r8     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01f3 }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01f3 }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01f3 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.anv r0 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo39848d()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15585bw.f43829bW     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.bt r1 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.mo41272a(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.C15333p.m44596c()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.aof r1 = new com.google.android.gms.internal.ads.aof     // Catch:{ all -> 0x01f3 }
            r1.<init>(r7)     // Catch:{ all -> 0x01f3 }
            r7.mo39721a(r0, r1)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.mo39815d(r0)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r0 = r7.f40860x     // Catch:{ all -> 0x01f3 }
            r1 = -1
            if (r0 == r1) goto L_0x00d5
            int r9 = r7.f40860x     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r0 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            float r0 = r0.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.anv r0 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo39849e()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r9 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
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
            com.google.android.gms.internal.ads.anv r2 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f40776b     // Catch:{ all -> 0x01f3 }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.anv r2 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f40775a     // Catch:{ all -> 0x01f3 }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C15585bw.f43876cQ     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.bt r6 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r4 = r6.mo41272a(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01f3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r4 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.anv r4 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            int r4 = r4.f40776b     // Catch:{ all -> 0x01f3 }
            float r4 = (float) r4     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            com.google.android.gms.internal.ads.anv r0 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            int r0 = r0.f40775a     // Catch:{ all -> 0x01f3 }
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r5 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            float r5 = r5.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r2 == 0) goto L_0x016e
            r2 = r3
        L_0x016e:
            r0 = 8
            if (r2 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.anv r2 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f40776b     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r2     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r3 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            float r3 = r3.density     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.anv r3 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            int r3 = r3.f40775a     // Catch:{ all -> 0x01f3 }
            float r3 = (float) r3     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01f3 }
            float r8 = (float) r8     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f40843g     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r5.<init>(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01f3 }
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r3)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            r5.append(r9)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.acd.m45783e(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01d3
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01f3 }
        L_0x01d3:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01d8:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01e1
            r7.setVisibility(r1)     // Catch:{ all -> 0x01f3 }
        L_0x01e1:
            com.google.android.gms.internal.ads.anv r8 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            int r8 = r8.f40776b     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.anv r9 = r7.f40845i     // Catch:{ all -> 0x01f3 }
            int r9 = r9.f40775a     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01ee:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01f3:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aoe.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean N = m46718N();
        C14836c s = mo39751s();
        if (s != null && N) {
            s.mo37829o();
        }
    }

    /* renamed from: a */
    public final synchronized void mo39715a(C14836c cVar) {
        this.f40844h = cVar;
    }

    /* renamed from: a */
    public final void mo39716a(C15345b bVar) {
        this.f40830F.set(bVar);
    }

    /* renamed from: b */
    public final synchronized void mo39723b(C14836c cVar) {
        this.f40828D = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo39717a(anv anv) {
        this.f40845i = anv;
        requestLayout();
    }

    /* renamed from: b */
    public final synchronized void mo39726b(boolean z) {
        boolean z2 = z != this.f40848l;
        this.f40848l = z;
        m46720P();
        if (z2) {
            new C16014rs(this).mo41954c(z ? "expanded" : "default");
        }
    }

    /* renamed from: H */
    public final void mo39708H() {
        this.f40829E.mo39269a();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo39897C()) {
            this.f40829E.mo39271c();
        }
        boolean z = this.f40855s;
        if (this.f40838b != null && this.f40838b.mo39863c()) {
            if (!this.f40856t) {
                OnGlobalLayoutListener d = this.f40838b.mo39865d();
                if (d != null) {
                    ahd.m45860a((View) this, d);
                }
                OnScrollChangedListener e = this.f40838b.mo39867e();
                if (e != null) {
                    ahd.m45861a((View) this, e);
                }
                this.f40856t = true;
            }
            m46718N();
            z = true;
        }
        m46727h(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo39897C()) {
                this.f40829E.mo39272d();
            }
            super.onDetachedFromWindow();
            if (this.f40856t && this.f40838b != null && this.f40838b.mo39863c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f40838b.mo39865d();
                if (d != null) {
                    C14793ay.m42896b().mo39198a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f40838b.mo39867e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f40856t = false;
            }
        }
        m46727h(false);
    }

    /* renamed from: a */
    public final void mo39714a(Context context) {
        this.f40837a.setBaseContext(context);
        this.f40829E.f40129a = this.f40837a.f40772a;
    }

    /* renamed from: c */
    public final synchronized void mo39727c(boolean z) {
        if (this.f40844h != null) {
            this.f40844h.mo37814a(this.f40838b.mo39782b(), z);
        } else {
            this.f40847k = z;
        }
    }

    public final synchronized int getRequestedOrientation() {
        return this.f40850n;
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f40850n = i;
        if (this.f40844h != null) {
            this.f40844h.mo37809a(this.f40850n);
        }
    }

    /* renamed from: d */
    public final Activity mo39466d() {
        return this.f40837a.f40772a;
    }

    /* renamed from: r */
    public final Context mo39750r() {
        return this.f40837a.f40773b;
    }

    /* renamed from: P */
    private final synchronized void m46720P() {
        if (!this.f40848l) {
            if (!this.f40845i.mo39849e()) {
                if (VERSION.SDK_INT < 18) {
                    acd.m45777b("Disabling hardware acceleration on an AdView.");
                    m46721Q();
                    return;
                }
                acd.m45777b("Enabling hardware acceleration on an AdView.");
                m46722R();
                return;
            }
        }
        acd.m45777b("Enabling hardware acceleration on an overlay.");
        m46722R();
    }

    /* renamed from: Q */
    private final synchronized void m46721Q() {
        if (!this.f40849m) {
            setLayerType(1, null);
        }
        this.f40849m = true;
    }

    /* renamed from: R */
    private final synchronized void m46722R() {
        if (this.f40849m) {
            setLayerType(0, null);
        }
        this.f40849m = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final synchronized void mo39876g(boolean z) {
        if (!z) {
            try {
                m46724T();
                this.f40829E.mo39270b();
                if (this.f40844h != null) {
                    this.f40844h.mo37808a();
                    this.f40844h.mo37825k();
                    this.f40844h = null;
                }
            } finally {
            }
        }
        this.f40830F.set(null);
        this.f40838b.mo39868k();
        ala.m46250a((aik) this);
        m46723S();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            if (!(this.f40838b == null || this.f40838b.f40781b == null)) {
                this.f40838b.f40781b.mo37768a();
            }
        }
    }

    /* renamed from: I */
    public final void mo39709I() {
        if (this.f40825A == null) {
            this.f40825A = C15593cd.m50345a(this.f40826B.f44224a);
            this.f40826B.mo41452a("native:view_load", this.f40825A);
        }
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            acd.m45778b("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            acd.m45778b("Could not resume webview.", e);
        }
    }

    /* renamed from: L */
    public final void mo39712L() {
        acd.m45438a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: f */
    public final void mo39731f(boolean z) {
        this.f40838b.f40782c = z;
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            acd.m45778b("Could not stop loading webview.", e);
        }
    }

    /* renamed from: d */
    public final synchronized void mo39728d(boolean z) {
        this.f40851o = z;
    }

    /* renamed from: E */
    public final synchronized boolean mo39705E() {
        return this.f40851o;
    }

    /* renamed from: F */
    public final synchronized boolean mo39706F() {
        return this.f40852p;
    }

    /* renamed from: z_ */
    public final synchronized void mo37683z_() {
        this.f40852p = true;
        if (this.f40841e != null) {
            this.f40841e.mo37683z_();
        }
    }

    /* renamed from: A_ */
    public final synchronized void mo37682A_() {
        this.f40852p = false;
        if (this.f40841e != null) {
            this.f40841e.mo37682A_();
        }
    }

    /* renamed from: S */
    private final synchronized void m46723S() {
        if (this.f40835K != null) {
            for (alb b : this.f40835K.values()) {
                b.mo38266b();
            }
        }
        this.f40835K = null;
    }

    /* renamed from: a */
    public final synchronized void mo39461a(String str, alb alb) {
        if (this.f40835K == null) {
            this.f40835K = new HashMap();
        }
        this.f40835K.put(str, alb);
    }

    /* renamed from: a */
    public final synchronized alb mo39459a(String str) {
        if (this.f40835K == null) {
            return null;
        }
        return (alb) this.f40835K.get(str);
    }

    /* renamed from: b */
    public final synchronized void mo39724b(String str) {
        if (str == null) {
            str = "";
        }
        this.f40853q = str;
    }

    /* renamed from: g */
    public final synchronized String mo39469g() {
        return this.f40853q;
    }

    /* renamed from: c */
    public final C15598ci mo39465c() {
        return this.f40862z;
    }

    /* renamed from: j */
    public final C15599cj mo39471j() {
        return this.f40826B;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f40827C = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f40827C.get();
    }

    /* renamed from: a */
    public final synchronized void mo39719a(C15630dn dnVar) {
        this.f40857u = dnVar;
    }

    /* renamed from: J */
    public final synchronized C15630dn mo39710J() {
        return this.f40857u;
    }

    /* renamed from: n */
    public final synchronized void mo39475n() {
        if (this.f40858v != null) {
            this.f40858v.mo41478a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo39718a(C15617da daVar) {
        this.f40858v = daVar;
    }

    /* renamed from: b */
    public final synchronized amy mo39464b() {
        return this.f40854r;
    }

    /* renamed from: a */
    public final synchronized void mo39460a(amy amy) {
        if (this.f40854r != null) {
            acd.m45779c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f40854r = amy;
        }
    }

    /* renamed from: G */
    public final synchronized boolean mo39707G() {
        return this.f40859w > 0;
    }

    /* renamed from: e */
    public final synchronized void mo39730e(boolean z) {
        this.f40859w += z ? 1 : -1;
        if (this.f40859w <= 0 && this.f40844h != null) {
            this.f40844h.mo37831q();
        }
    }

    /* renamed from: T */
    private final void m46724T() {
        if (this.f40826B != null) {
            C15600ck ckVar = this.f40826B.f44224a;
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
        this.f40838b.f40780a = z;
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
        this.f40838b.mo39853a(zzc);
    }

    /* renamed from: a */
    public final void mo39811a(boolean z, int i) {
        this.f40838b.mo39858a(z, i);
    }

    /* renamed from: a */
    public final void mo39812a(boolean z, int i, String str) {
        this.f40838b.mo39859a(z, i, str);
    }

    /* renamed from: a */
    public final void mo39813a(boolean z, int i, String str, String str2) {
        this.f40838b.mo39860a(z, i, str, str2);
    }

    /* renamed from: a */
    public final void mo39036a(bue bue) {
        synchronized (this) {
            this.f40855s = bue.f43595a;
        }
        m46727h(bue.f43595a);
    }

    /* renamed from: h */
    private final void m46727h(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        C15845ll.m51280a((C15844lk) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo39721a(String str, C15742hq<? super ami> hqVar) {
        if (this.f40838b != null) {
            this.f40838b.mo39857a(str, hqVar);
        }
    }

    /* renamed from: b */
    public final void mo39725b(String str, C15742hq<? super ami> hqVar) {
        if (this.f40838b != null) {
            this.f40838b.mo39862b(str, hqVar);
        }
    }

    /* renamed from: a */
    public final void mo39720a(String str, C15334q<C15742hq<? super ami>> qVar) {
        if (this.f40838b != null) {
            this.f40838b.mo39856a(str, qVar);
        }
    }

    /* renamed from: w */
    public final /* synthetic */ anp mo39761w() {
        return this.f40838b;
    }
}
