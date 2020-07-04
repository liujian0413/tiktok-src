package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p022v4.view.C0991u;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.example.p266a.C6490c;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14817bv;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C14836c;
import com.google.android.gms.ads.internal.overlay.C14845l;
import com.google.android.gms.ads.internal.overlay.C14847n;
import com.google.android.gms.ads.internal.overlay.C14853t;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.C15334q;
import com.google.android.gms.internal.ads.zzxh.zza.zzb;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

@C6505uv
public class amj extends WebViewClient implements anp {

    /* renamed from: e */
    private static final String[] f40641e = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: f */
    private static final String[] f40642f = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: A */
    private boolean f40643A;

    /* renamed from: B */
    private boolean f40644B;

    /* renamed from: C */
    private int f40645C;

    /* renamed from: D */
    private OnAttachStateChangeListener f40646D;

    /* renamed from: a */
    public boolean f40647a;

    /* renamed from: b */
    public ant f40648b;

    /* renamed from: c */
    protected aag f40649c;

    /* renamed from: d */
    public boolean f40650d;

    /* renamed from: g */
    private ami f40651g;

    /* renamed from: h */
    private final bwl f40652h;

    /* renamed from: i */
    private final HashMap<String, List<C15742hq<? super ami>>> f40653i;

    /* renamed from: j */
    private final Object f40654j;

    /* renamed from: k */
    private bxr f40655k;

    /* renamed from: l */
    private C14847n f40656l;

    /* renamed from: m */
    private anq f40657m;

    /* renamed from: n */
    private anr f40658n;

    /* renamed from: o */
    private C15721gw f40659o;

    /* renamed from: p */
    private C15723gy f40660p;

    /* renamed from: q */
    private ans f40661q;

    /* renamed from: r */
    private boolean f40662r;

    /* renamed from: s */
    private boolean f40663s;

    /* renamed from: t */
    private OnGlobalLayoutListener f40664t;

    /* renamed from: u */
    private OnScrollChangedListener f40665u;

    /* renamed from: v */
    private boolean f40666v;

    /* renamed from: w */
    private C14853t f40667w;

    /* renamed from: x */
    private final C16013rr f40668x;

    /* renamed from: y */
    private C14817bv f40669y;

    /* renamed from: z */
    private C16002rg f40670z;

    public amj(ami ami, bwl bwl, boolean z) {
        this(ami, bwl, z, new C16013rr(ami, ami.mo39750r(), new C15569bh(ami.getContext())), null);
    }

    private amj(ami ami, bwl bwl, boolean z, C16013rr rrVar, C16002rg rgVar) {
        this.f40653i = new HashMap<>();
        this.f40654j = new Object();
        this.f40647a = false;
        this.f40652h = bwl;
        this.f40651g = ami;
        this.f40662r = z;
        this.f40668x = rrVar;
        this.f40670z = null;
    }

    /* renamed from: a */
    public final void mo39768a(int i, int i2, boolean z) {
        this.f40668x.mo41948a(i, i2);
        if (this.f40670z != null) {
            this.f40670z.mo41932a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo39775a(bxr bxr, C15721gw gwVar, C14847n nVar, C15723gy gyVar, C14853t tVar, boolean z, C15753ia iaVar, C14817bv bvVar, C16015rt rtVar, aag aag) {
        if (bvVar == null) {
            bvVar = new C14817bv(this.f40651g.getContext(), aag, null);
        }
        this.f40670z = new C16002rg(this.f40651g, rtVar);
        this.f40649c = aag;
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43754aA)).booleanValue()) {
            mo39777a("/adMetadata", (C15742hq<? super ami>) new C15720gv<Object>(gwVar));
        }
        mo39777a("/appEvent", (C15742hq<? super ami>) new C15722gx<Object>(gyVar));
        mo39777a("/backButton", C15726ha.f44461j);
        mo39777a("/refresh", C15726ha.f44462k);
        mo39777a("/canOpenURLs", C15726ha.f44452a);
        mo39777a("/canOpenIntents", C15726ha.f44453b);
        mo39777a("/click", C15726ha.f44454c);
        mo39777a("/close", C15726ha.f44455d);
        mo39777a("/customClose", C15726ha.f44456e);
        mo39777a("/instrument", C15726ha.f44465n);
        mo39777a("/delayPageLoaded", C15726ha.f44467p);
        mo39777a("/delayPageClosed", C15726ha.f44468q);
        mo39777a("/getLocationInfo", C15726ha.f44469r);
        mo39777a("/httpTrack", C15726ha.f44457f);
        mo39777a("/log", C15726ha.f44458g);
        mo39777a("/mraid", (C15742hq<? super ami>) new C15756id<Object>(bvVar, this.f40670z, rtVar));
        mo39777a("/mraidLoaded", (C15742hq<? super ami>) this.f40668x);
        mo39777a("/open", (C15742hq<? super ami>) new C15757ie<Object>(bvVar, this.f40670z));
        mo39777a("/precache", (C15742hq<? super ami>) new alk<Object>());
        mo39777a("/touch", C15726ha.f44460i);
        mo39777a("/video", C15726ha.f44463l);
        mo39777a("/videoMeta", C15726ha.f44464m);
        if (C14793ay.m42913s().mo39043a(this.f40651g.getContext())) {
            mo39777a("/logScionEvent", (C15742hq<? super ami>) new C15755ic<Object>(this.f40651g.getContext()));
        }
        if (iaVar != null) {
            mo39777a("/setInterstitialProperties", (C15742hq<? super ami>) new C15751hz<Object>(iaVar));
        }
        this.f40655k = bxr;
        this.f40656l = nVar;
        this.f40659o = gwVar;
        this.f40660p = gyVar;
        this.f40667w = tVar;
        this.f40669y = bvVar;
        this.f40647a = z;
    }

    /* renamed from: a */
    public final C14817bv mo39766a() {
        return this.f40669y;
    }

    /* renamed from: b */
    public final boolean mo39782b() {
        boolean z;
        synchronized (this.f40654j) {
            z = this.f40662r;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo39783c() {
        boolean z;
        synchronized (this.f40654j) {
            z = this.f40663s;
        }
        return z;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener mo39784d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f40654j) {
            onGlobalLayoutListener = this.f40664t;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final OnScrollChangedListener mo39785e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f40654j) {
            onScrollChangedListener = this.f40665u;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo39786f() {
        boolean z;
        synchronized (this.f40654j) {
            z = this.f40666v;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0.f40658n == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0.f40658n.mo39844a();
        r0.f40658n = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        m46397p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f40643A = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f40654j
            monitor-enter(r1)
            com.google.android.gms.internal.ads.ami r2 = r0.f40651g     // Catch:{ all -> 0x002b }
            boolean r2 = r2.mo39703C()     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.acd.m45438a(r2)     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.ami r2 = r0.f40651g     // Catch:{ all -> 0x002b }
            r2.mo39704D()     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            r1 = 1
            r0.f40643A = r1
            com.google.android.gms.internal.ads.anr r1 = r0.f40658n
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.anr r1 = r0.f40658n
            r1.mo39844a()
            r1 = 0
            r0.f40658n = r1
        L_0x0027:
            r0.m46397p()
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.amj.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m46392a(View view, aag aag, int i) {
        if (aag.mo39032b() && i > 0) {
            aag.mo39028a(view);
            if (aag.mo39032b()) {
                acl.f40003a.postDelayed(new aml(this, view, aag, i), 100);
            }
        }
    }

    /* renamed from: o */
    private final void m46396o() {
        if (this.f40646D != null) {
            this.f40651g.getView().removeOnAttachStateChangeListener(this.f40646D);
        }
    }

    /* renamed from: g */
    public final void mo39787g() {
        aag aag = this.f40649c;
        if (aag != null) {
            WebView webView = this.f40651g.getWebView();
            if (C0991u.m4170G(webView)) {
                m46392a((View) webView, aag, 10);
                return;
            }
            m46396o();
            this.f40646D = new amm(this, aag);
            this.f40651g.getView().addOnAttachStateChangeListener(this.f40646D);
        }
    }

    /* renamed from: h */
    public final void mo39788h() {
        synchronized (this.f40654j) {
            this.f40666v = true;
        }
        this.f40645C++;
        m46397p();
    }

    /* renamed from: i */
    public final void mo39789i() {
        this.f40645C--;
        m46397p();
    }

    /* renamed from: j */
    public final void mo39790j() {
        this.f40644B = true;
        m46397p();
    }

    /* renamed from: p */
    private final void m46397p() {
        if (this.f40657m != null && ((this.f40643A && this.f40645C <= 0) || this.f40644B)) {
            this.f40657m.mo37832a(!this.f40644B);
            this.f40657m = null;
        }
        this.f40651g.mo39709I();
    }

    /* renamed from: a */
    public final void mo39770a(zzc zzc) {
        C14847n nVar;
        boolean B = this.f40651g.mo39702B();
        bxr bxr = (!B || this.f40651g.mo39759u().mo39849e()) ? this.f40655k : null;
        if (B) {
            nVar = null;
        } else {
            nVar = this.f40656l;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, bxr, nVar, this.f40667w, this.f40651g.mo39472k());
        m46393a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo39778a(boolean z, int i) {
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!this.f40651g.mo39702B() || this.f40651g.mo39759u().mo39849e()) ? this.f40655k : null, this.f40656l, this.f40667w, this.f40651g, z, i, this.f40651g.mo39472k());
        m46393a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo39779a(boolean z, int i, String str) {
        C14847n nVar;
        boolean B = this.f40651g.mo39702B();
        bxr bxr = (!B || this.f40651g.mo39759u().mo39849e()) ? this.f40655k : null;
        if (B) {
            nVar = null;
        } else {
            nVar = new amn(this.f40651g, this.f40656l);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bxr, nVar, this.f40659o, this.f40660p, this.f40667w, this.f40651g, z, i, str, this.f40651g.mo39472k());
        m46393a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo39780a(boolean z, int i, String str, String str2) {
        C14847n nVar;
        boolean B = this.f40651g.mo39702B();
        bxr bxr = (!B || this.f40651g.mo39759u().mo39849e()) ? this.f40655k : null;
        if (B) {
            nVar = null;
        } else {
            nVar = new amn(this.f40651g, this.f40656l);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bxr, nVar, this.f40659o, this.f40660p, this.f40667w, this.f40651g, z, i, str, str2, this.f40651g.mo39472k());
        m46393a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    private final void m46393a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f40670z != null ? this.f40670z.mo41935a() : false;
        Context context = this.f40651g.getContext();
        if (!a) {
            z = true;
        }
        C14845l.m43136a(context, adOverlayInfoParcel, z);
        if (this.f40649c != null) {
            String str = adOverlayInfoParcel.f38419l;
            if (str == null && adOverlayInfoParcel.f38408a != null) {
                str = adOverlayInfoParcel.f38408a.f38467a;
            }
            this.f40649c.mo39029a(str);
        }
    }

    /* renamed from: a */
    public final void mo39777a(String str, C15742hq<? super ami> hqVar) {
        synchronized (this.f40654j) {
            List list = (List) this.f40653i.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f40653i.put(str, list);
            }
            list.add(hqVar);
        }
    }

    /* renamed from: b */
    public final void mo39781b(String str, C15742hq<? super ami> hqVar) {
        synchronized (this.f40654j) {
            List list = (List) this.f40653i.get(str);
            if (list != null) {
                list.remove(hqVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo39776a(String str, C15334q<C15742hq<? super ami>> qVar) {
        synchronized (this.f40654j) {
            List<C15742hq> list = (List) this.f40653i.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C15742hq hqVar : list) {
                    if (qVar.mo38687a(hqVar)) {
                        arrayList.add(hqVar);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: k */
    public final void mo39791k() {
        if (this.f40649c != null) {
            this.f40649c.mo39034d();
            this.f40649c = null;
        }
        m46396o();
        synchronized (this.f40654j) {
            this.f40653i.clear();
            this.f40655k = null;
            this.f40656l = null;
            this.f40657m = null;
            this.f40658n = null;
            this.f40659o = null;
            this.f40660p = null;
            this.f40647a = false;
            this.f40662r = false;
            this.f40663s = false;
            this.f40666v = false;
            this.f40667w = null;
            this.f40661q = null;
            if (this.f40670z != null) {
                this.f40670z.mo41934a(true);
                this.f40670z = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo39771a(anq anq) {
        this.f40657m = anq;
    }

    /* renamed from: a */
    public final void mo39772a(anr anr) {
        this.f40658n = anr;
    }

    /* renamed from: a */
    public final void mo39773a(ans ans) {
        this.f40661q = ans;
    }

    /* renamed from: a */
    public final void mo39774a(ant ant) {
        this.f40648b = ant;
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        acd.m45438a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m46391a(parse);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 < f40641e.length) {
                str3 = f40641e[i2];
                m46390a(this.f40651g.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        m46390a(this.f40651g.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= f40642f.length) {
                str = String.valueOf(primaryError);
            } else {
                str = f40642f[primaryError];
            }
            m46390a(this.f40651g.getContext(), "ssl_err", str, sslError.getUrl());
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    /* renamed from: a */
    private final void m46390a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43845bm)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            String str5 = "host";
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString(str5, str4);
                    C14793ay.m42895a().mo39172a(context, this.f40651g.mo39472k().f45677a, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString(str5, str4);
            C14793ay.m42895a().mo39172a(context, this.f40651g.mo39472k().f45677a, "gmob-apps", bundle, true);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(str);
        acd.m45438a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f40647a && webView == this.f40651g.getWebView()) {
                String scheme = parse.getScheme();
                if (WebKitApi.SCHEME_HTTP.equalsIgnoreCase(scheme) || WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(scheme)) {
                    if (this.f40655k != null) {
                        this.f40655k.mo7870v_();
                        if (this.f40649c != null) {
                            this.f40649c.mo39029a(str);
                        }
                        this.f40655k = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f40651g.getWebView().willNotDraw()) {
                try {
                    bdt z = this.f40651g.mo39764z();
                    if (z != null && z.mo40535a(parse)) {
                        parse = z.mo40533a(parse, this.f40651g.getContext(), this.f40651g.getView(), this.f40651g.mo39466d());
                    }
                } catch (zzdh unused) {
                    String str3 = "Unable to append parameter to URL: ";
                    String valueOf2 = String.valueOf(str);
                    acd.m45783e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                }
                if (this.f40669y == null || this.f40669y.mo37761b()) {
                    zzc zzc = new zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null);
                    mo39770a(zzc);
                } else {
                    this.f40669y.mo37760a(str);
                }
            } else {
                String str4 = "AdWebView unable to handle URL: ";
                String valueOf3 = String.valueOf(str);
                acd.m45783e(valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4));
            }
        } else {
            m46391a(parse);
        }
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo39765a(str, Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo39765a(String str, Map<String, String> map) {
        try {
            String a = abd.m45356a(str, this.f40651g.getContext(), this.f40650d);
            if (!a.equals(str)) {
                return m46395b(a, map);
            }
            zzwr a2 = zzwr.m53214a(str);
            if (a2 != null) {
                zzwo a3 = C14793ay.m42900f().mo41395a(a2);
                if (a3 != null && a3.mo42392a()) {
                    return new WebResourceResponse("", "", a3.mo42393b());
                }
            }
            if (afg.m45762c()) {
                if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43834bb)).booleanValue()) {
                    return m46395b(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            C14793ay.m42898d().mo39089a(e, "AdWebViewClient.interceptRequest");
            return m46398q();
        }
    }

    /* renamed from: q */
    private static WebResourceResponse m46398q() {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43803ax)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: b */
    private final WebResourceResponse m46395b(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                openConnection.setReadTimeout(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                for (Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    C14793ay.m42895a().mo39173a(this.f40651g.getContext(), this.f40651g.mo39472k().f45677a, false, httpURLConnection);
                    afg afg = new afg();
                    afg.mo39280a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    afg.mo39279a(httpURLConnection, responseCode);
                    if (responseCode >= 300 && responseCode < 400) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                acd.m45783e("Protocol is null");
                                return m46398q();
                            } else if (protocol.equals(WebKitApi.SCHEME_HTTP) || protocol.equals(WebKitApi.SCHEME_HTTPS)) {
                                String str2 = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                acd.m45777b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String str3 = "Unsupported scheme: ";
                                String valueOf2 = String.valueOf(protocol);
                                acd.m45783e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                                return m46398q();
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        return acl.m45515a(httpURLConnection);
    }

    /* renamed from: l */
    public final aag mo39792l() {
        return this.f40649c;
    }

    /* renamed from: a */
    public final void mo39769a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f40654j) {
            this.f40663s = true;
            this.f40651g.mo39708H();
            this.f40664t = onGlobalLayoutListener;
            this.f40665u = onScrollChangedListener;
        }
    }

    /* renamed from: m */
    public final void mo39793m() {
        synchronized (this.f40654j) {
            this.f40647a = false;
            this.f40662r = true;
            ago.f40189a.execute(new amk(this));
        }
    }

    /* renamed from: a */
    public final void mo39767a(int i, int i2) {
        if (this.f40670z != null) {
            this.f40670z.mo41931a(i, i2);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH /*128*/:
                        case 129:
                        case 130:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m46391a(Uri uri) {
        String path = uri.getPath();
        List<C15742hq> list = (List) this.f40653i.get(path);
        if (list != null) {
            Map a = acl.m45523a(uri);
            if (acd.m45776a(2)) {
                String str = "Received GMSG: ";
                String valueOf = String.valueOf(path);
                acd.m45438a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                for (String str2 : a.keySet()) {
                    String str3 = (String) a.get(str2);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                    sb.append("  ");
                    sb.append(str2);
                    sb.append(": ");
                    sb.append(str3);
                    acd.m45438a(sb.toString());
                }
            }
            for (C15742hq a2 : list) {
                a2.mo37744a(this.f40651g, a);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        acd.m45438a(sb2.toString());
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f40652h != null) {
            this.f40652h.mo41410a(zzb.ANDROID_WEBVIEW_CRASH);
        }
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        webView.destroy();
        return C6490c.m20174a(webView, renderProcessGoneDetail);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo39794n() {
        this.f40651g.mo39708H();
        C14836c s = this.f40651g.mo39751s();
        if (s != null) {
            s.mo37827m();
        }
        if (this.f40661q != null) {
            this.f40661q.mo37707a();
            this.f40661q = null;
        }
    }
}
