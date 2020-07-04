package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14817bv;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C14836c;
import com.google.android.gms.ads.internal.overlay.C14845l;
import com.google.android.gms.ads.internal.overlay.C14847n;
import com.google.android.gms.ads.internal.overlay.C14853t;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.C15334q;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;

@C6505uv
public final class anw extends aoi implements anp {

    /* renamed from: A */
    private int f40778A;

    /* renamed from: B */
    private OnAttachStateChangeListener f40779B;

    /* renamed from: a */
    public boolean f40780a = false;

    /* renamed from: b */
    public ant f40781b;

    /* renamed from: c */
    public boolean f40782c;

    /* renamed from: e */
    private ami f40783e;

    /* renamed from: f */
    private final C15848lo<ami> f40784f = new C15848lo<>();

    /* renamed from: g */
    private final Object f40785g = new Object();

    /* renamed from: h */
    private bxr f40786h;

    /* renamed from: i */
    private C14847n f40787i;

    /* renamed from: j */
    private anq f40788j;

    /* renamed from: k */
    private anr f40789k;

    /* renamed from: l */
    private C15721gw f40790l;

    /* renamed from: m */
    private C15723gy f40791m;

    /* renamed from: n */
    private ans f40792n;

    /* renamed from: o */
    private volatile boolean f40793o;

    /* renamed from: p */
    private boolean f40794p;

    /* renamed from: q */
    private OnGlobalLayoutListener f40795q;

    /* renamed from: r */
    private OnScrollChangedListener f40796r;

    /* renamed from: s */
    private boolean f40797s;

    /* renamed from: t */
    private C14853t f40798t;

    /* renamed from: u */
    private C16013rr f40799u;

    /* renamed from: v */
    private C14817bv f40800v;

    /* renamed from: w */
    private C16002rg f40801w;

    /* renamed from: x */
    private aag f40802x;

    /* renamed from: y */
    private boolean f40803y;

    /* renamed from: z */
    private boolean f40804z;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39854a(ami ami, boolean z) {
        C16013rr rrVar = new C16013rr(ami, ami.mo39750r(), new C15569bh(ami.getContext()));
        this.f40783e = ami;
        this.f40793o = z;
        this.f40799u = rrVar;
        this.f40801w = null;
        this.f40784f.f44603a = ami;
    }

    /* renamed from: a */
    public final void mo39768a(int i, int i2, boolean z) {
        this.f40799u.mo41948a(i, i2);
        if (this.f40801w != null) {
            this.f40801w.mo41932a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo39857a(String str, C15742hq<? super ami> hqVar) {
        this.f40784f.mo41734a(str, hqVar);
    }

    /* renamed from: b */
    public final void mo39862b(String str, C15742hq<? super ami> hqVar) {
        this.f40784f.mo41736b(str, hqVar);
    }

    /* renamed from: a */
    public final void mo39856a(String str, C15334q<C15742hq<? super ami>> qVar) {
        this.f40784f.mo41733a(str, qVar);
    }

    /* renamed from: a */
    public final void mo39775a(bxr bxr, C15721gw gwVar, C14847n nVar, C15723gy gyVar, C14853t tVar, boolean z, C15753ia iaVar, C14817bv bvVar, C16015rt rtVar, aag aag) {
        if (bvVar == null) {
            bvVar = new C14817bv(this.f40783e.getContext(), aag, null);
        }
        this.f40801w = new C16002rg(this.f40783e, rtVar);
        this.f40802x = aag;
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43754aA)).booleanValue()) {
            mo39857a("/adMetadata", (C15742hq<? super ami>) new C15720gv<Object>(gwVar));
        }
        mo39857a("/appEvent", (C15742hq<? super ami>) new C15722gx<Object>(gyVar));
        mo39857a("/backButton", C15726ha.f44461j);
        mo39857a("/refresh", C15726ha.f44462k);
        mo39857a("/canOpenURLs", C15726ha.f44452a);
        mo39857a("/canOpenIntents", C15726ha.f44453b);
        mo39857a("/click", C15726ha.f44454c);
        mo39857a("/close", C15726ha.f44455d);
        mo39857a("/customClose", C15726ha.f44456e);
        mo39857a("/instrument", C15726ha.f44465n);
        mo39857a("/delayPageLoaded", C15726ha.f44467p);
        mo39857a("/delayPageClosed", C15726ha.f44468q);
        mo39857a("/getLocationInfo", C15726ha.f44469r);
        mo39857a("/httpTrack", C15726ha.f44457f);
        mo39857a("/log", C15726ha.f44458g);
        mo39857a("/mraid", (C15742hq<? super ami>) new C15756id<Object>(bvVar, this.f40801w, rtVar));
        mo39857a("/mraidLoaded", (C15742hq<? super ami>) this.f40799u);
        mo39857a("/open", (C15742hq<? super ami>) new C15757ie<Object>(bvVar, this.f40801w));
        mo39857a("/precache", (C15742hq<? super ami>) new alk<Object>());
        mo39857a("/touch", C15726ha.f44460i);
        mo39857a("/video", C15726ha.f44463l);
        mo39857a("/videoMeta", C15726ha.f44464m);
        if (C14793ay.m42913s().mo39043a(this.f40783e.getContext())) {
            mo39857a("/logScionEvent", (C15742hq<? super ami>) new C15755ic<Object>(this.f40783e.getContext()));
        }
        if (iaVar != null) {
            mo39857a("/setInterstitialProperties", (C15742hq<? super ami>) new C15751hz<Object>(iaVar));
        }
        this.f40786h = bxr;
        this.f40787i = nVar;
        this.f40790l = gwVar;
        this.f40791m = gyVar;
        this.f40798t = tVar;
        this.f40800v = bvVar;
        this.f40780a = z;
    }

    /* renamed from: a */
    public final C14817bv mo39766a() {
        return this.f40800v;
    }

    /* renamed from: b */
    public final boolean mo39782b() {
        return this.f40793o;
    }

    /* renamed from: c */
    public final boolean mo39863c() {
        boolean z;
        synchronized (this.f40785g) {
            z = this.f40794p;
        }
        return z;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener mo39865d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f40785g) {
            onGlobalLayoutListener = this.f40795q;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final OnScrollChangedListener mo39867e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f40785g) {
            onScrollChangedListener = this.f40796r;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo39786f() {
        boolean z;
        synchronized (this.f40785g) {
            z = this.f40797s;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo39855a(aoj aoj) {
        this.f40803y = true;
        if (this.f40789k != null) {
            this.f40789k.mo39844a();
            this.f40789k = null;
        }
        m46677p();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m46672a(View view, aag aag, int i) {
        if (aag.mo39032b() && i > 0) {
            aag.mo39028a(view);
            if (aag.mo39032b()) {
                acl.f40003a.postDelayed(new anz(this, view, aag, i), 100);
            }
        }
    }

    /* renamed from: o */
    private final void m46676o() {
        if (this.f40779B != null) {
            this.f40783e.getView().removeOnAttachStateChangeListener(this.f40779B);
        }
    }

    /* renamed from: g */
    public final void mo39787g() {
        aag aag = this.f40802x;
        if (aag != null) {
            WebView webView = this.f40783e.getWebView();
            if (C0991u.m4170G(webView)) {
                m46672a((View) webView, aag, 10);
                return;
            }
            m46676o();
            this.f40779B = new aoa(this, aag);
            this.f40783e.getView().addOnAttachStateChangeListener(this.f40779B);
        }
    }

    /* renamed from: h */
    public final void mo39788h() {
        synchronized (this.f40785g) {
            this.f40797s = true;
        }
        this.f40778A++;
        m46677p();
    }

    /* renamed from: i */
    public final void mo39789i() {
        this.f40778A--;
        m46677p();
    }

    /* renamed from: j */
    public final void mo39790j() {
        this.f40804z = true;
        m46677p();
    }

    /* renamed from: p */
    private final void m46677p() {
        if (this.f40788j != null && ((this.f40803y && this.f40778A <= 0) || this.f40804z)) {
            this.f40788j.mo37832a(!this.f40804z);
            this.f40788j = null;
        }
        this.f40783e.mo39709I();
    }

    /* renamed from: a */
    public final void mo39853a(zzc zzc) {
        C14847n nVar;
        boolean B = this.f40783e.mo39702B();
        bxr bxr = (!B || this.f40783e.mo39759u().mo39849e()) ? this.f40786h : null;
        if (B) {
            nVar = null;
        } else {
            nVar = this.f40787i;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, bxr, nVar, this.f40798t, this.f40783e.mo39472k());
        m46673a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo39858a(boolean z, int i) {
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!this.f40783e.mo39702B() || this.f40783e.mo39759u().mo39849e()) ? this.f40786h : null, this.f40787i, this.f40798t, this.f40783e, z, i, this.f40783e.mo39472k());
        m46673a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo39859a(boolean z, int i, String str) {
        C14847n nVar;
        boolean B = this.f40783e.mo39702B();
        bxr bxr = (!B || this.f40783e.mo39759u().mo39849e()) ? this.f40786h : null;
        if (B) {
            nVar = null;
        } else {
            nVar = new aob(this.f40783e, this.f40787i);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bxr, nVar, this.f40790l, this.f40791m, this.f40798t, this.f40783e, z, i, str, this.f40783e.mo39472k());
        m46673a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo39860a(boolean z, int i, String str, String str2) {
        C14847n nVar;
        boolean B = this.f40783e.mo39702B();
        bxr bxr = (!B || this.f40783e.mo39759u().mo39849e()) ? this.f40786h : null;
        if (B) {
            nVar = null;
        } else {
            nVar = new aob(this.f40783e, this.f40787i);
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bxr, nVar, this.f40790l, this.f40791m, this.f40798t, this.f40783e, z, i, str, str2, this.f40783e.mo39472k());
        m46673a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    private final void m46673a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f40801w != null ? this.f40801w.mo41935a() : false;
        Context context = this.f40783e.getContext();
        if (!a) {
            z = true;
        }
        C14845l.m43136a(context, adOverlayInfoParcel, z);
        if (this.f40802x != null) {
            String str = adOverlayInfoParcel.f38419l;
            if (str == null && adOverlayInfoParcel.f38408a != null) {
                str = adOverlayInfoParcel.f38408a.f38467a;
            }
            this.f40802x.mo39029a(str);
        }
    }

    /* renamed from: k */
    public final void mo39868k() {
        if (this.f40802x != null) {
            this.f40802x.mo39034d();
            this.f40802x = null;
        }
        m46676o();
        this.f40784f.mo41737d();
        this.f40784f.f44603a = null;
        synchronized (this.f40785g) {
            this.f40786h = null;
            this.f40787i = null;
            this.f40788j = null;
            this.f40789k = null;
            this.f40790l = null;
            this.f40791m = null;
            this.f40798t = null;
            this.f40792n = null;
            if (this.f40801w != null) {
                this.f40801w.mo41934a(true);
                this.f40801w = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo39771a(anq anq) {
        this.f40788j = anq;
    }

    /* renamed from: a */
    public final void mo39772a(anr anr) {
        this.f40789k = anr;
    }

    /* renamed from: a */
    public final void mo39773a(ans ans) {
        this.f40792n = ans;
    }

    /* renamed from: a */
    public final void mo39774a(ant ant) {
        this.f40781b = ant;
    }

    /* renamed from: b */
    public final void mo39861b(aoj aoj) {
        this.f40784f.mo41735a(aoj.f40868b);
    }

    /* renamed from: c */
    public final boolean mo39864c(aoj aoj) {
        String str = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(aoj.f40867a);
        acd.m45438a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        Uri uri = aoj.f40868b;
        if (this.f40784f.mo41735a(uri)) {
            return true;
        }
        if (this.f40780a) {
            String scheme = uri.getScheme();
            if (WebKitApi.SCHEME_HTTP.equalsIgnoreCase(scheme) || WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(scheme)) {
                if (this.f40786h != null) {
                    this.f40786h.mo7870v_();
                    if (this.f40802x != null) {
                        this.f40802x.mo39029a(aoj.f40867a);
                    }
                    this.f40786h = null;
                }
                return false;
            }
        }
        if (!this.f40783e.getWebView().willNotDraw()) {
            try {
                bdt z = this.f40783e.mo39764z();
                if (z != null && z.mo40535a(uri)) {
                    uri = z.mo40533a(uri, this.f40783e.getContext(), this.f40783e.getView(), this.f40783e.mo39466d());
                }
            } catch (zzdh unused) {
                String str2 = "Unable to append parameter to URL: ";
                String valueOf2 = String.valueOf(aoj.f40867a);
                acd.m45783e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
            }
            if (this.f40800v == null || this.f40800v.mo37761b()) {
                zzc zzc = new zzc("android.intent.action.VIEW", uri.toString(), null, null, null, null, null);
                mo39853a(zzc);
            } else {
                this.f40800v.mo37760a(aoj.f40867a);
            }
        } else {
            String str3 = "AdWebView unable to handle URL: ";
            String valueOf3 = String.valueOf(aoj.f40867a);
            acd.m45783e(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3));
        }
        return true;
    }

    /* renamed from: d */
    public final WebResourceResponse mo39866d(aoj aoj) {
        WebResourceResponse webResourceResponse;
        String str;
        if (this.f40802x != null) {
            this.f40802x.mo39030a(aoj.f40867a, aoj.f40869c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(aoj.f40867a).getName())) {
            webResourceResponse = null;
        } else {
            mo39793m();
            if (this.f40783e.mo39759u().mo39849e()) {
                str = (String) bym.m50299d().mo41272a(C15585bw.f43737K);
            } else if (this.f40783e.mo39702B()) {
                str = (String) bym.m50299d().mo41272a(C15585bw.f43736J);
            } else {
                str = (String) bym.m50299d().mo41272a(C15585bw.f43735I);
            }
            webResourceResponse = acl.m45547c(this.f40783e.getContext(), this.f40783e.mo39472k().f45677a, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!abd.m45356a(aoj.f40867a, this.f40783e.getContext(), this.f40782c).equals(aoj.f40867a)) {
                return m46675e(aoj);
            }
            zzwr a = zzwr.m53214a(aoj.f40867a);
            if (a != null) {
                zzwo a2 = C14793ay.m42900f().mo41395a(a);
                if (a2 != null && a2.mo42392a()) {
                    return new WebResourceResponse("", "", a2.mo42393b());
                }
            }
            if (afg.m45762c()) {
                if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43834bb)).booleanValue()) {
                    return m46675e(aoj);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            C14793ay.m42898d().mo39089a(e, "AdWebViewClient.interceptRequest");
            return m46678q();
        }
    }

    /* renamed from: q */
    private static WebResourceResponse m46678q() {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43803ax)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: e */
    private final WebResourceResponse m46675e(aoj aoj) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(aoj.f40867a);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                openConnection.setReadTimeout(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                for (Entry entry : aoj.f40869c.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    C14793ay.m42895a().mo39173a(this.f40783e.getContext(), this.f40783e.mo39472k().f45677a, false, httpURLConnection);
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
                                return m46678q();
                            } else if (protocol.equals(WebKitApi.SCHEME_HTTP) || protocol.equals(WebKitApi.SCHEME_HTTPS)) {
                                String str = "Redirecting to ";
                                String valueOf = String.valueOf(headerField);
                                acd.m45777b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String str2 = "Unsupported scheme: ";
                                String valueOf2 = String.valueOf(protocol);
                                acd.m45783e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                                return m46678q();
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
        return this.f40802x;
    }

    /* renamed from: a */
    public final void mo39769a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f40785g) {
            this.f40794p = true;
            this.f40783e.mo39708H();
            this.f40795q = onGlobalLayoutListener;
            this.f40796r = onScrollChangedListener;
        }
    }

    /* renamed from: m */
    public final void mo39793m() {
        synchronized (this.f40785g) {
            this.f40780a = false;
            this.f40793o = true;
            ago.f40189a.execute(new any(this));
        }
    }

    /* renamed from: a */
    public final void mo39767a(int i, int i2) {
        if (this.f40801w != null) {
            this.f40801w.mo41931a(i, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo39869n() {
        this.f40783e.mo39708H();
        C14836c s = this.f40783e.mo39751s();
        if (s != null) {
            s.mo37827m();
        }
        if (this.f40792n != null) {
            this.f40792n.mo37707a();
            this.f40792n = null;
        }
    }
}
