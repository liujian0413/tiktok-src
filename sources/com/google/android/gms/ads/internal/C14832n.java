package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C14836c;
import com.google.android.gms.ads.internal.overlay.C14845l;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15600ck;
import com.google.android.gms.internal.ads.C15742hq;
import com.google.android.gms.internal.ads.C15753ia;
import com.google.android.gms.internal.ads.C15761ii;
import com.google.android.gms.internal.ads.C15762ij;
import com.google.android.gms.internal.ads.C15915oa;
import com.google.android.gms.internal.ads.C15916ob;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C16160xd;
import com.google.android.gms.internal.ads.C16176xt;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.aag;
import com.google.android.gms.internal.ads.aak;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.acv;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.amo;
import com.google.android.gms.internal.ads.anp;
import com.google.android.gms.internal.ads.ans;
import com.google.android.gms.internal.ads.anv;
import com.google.android.gms.internal.ads.aoy;
import com.google.android.gms.internal.ads.bub;
import com.google.android.gms.internal.ads.buf;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.n */
public final class C14832n extends C14802bg implements C15753ia, C15762ij {

    /* renamed from: j */
    private transient boolean f38396j;

    /* renamed from: k */
    private int f38397k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f38398l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f38399m;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f38400o;

    /* renamed from: p */
    private aak f38401p;

    /* renamed from: q */
    private String f38402q;

    /* renamed from: r */
    private final String f38403r;

    /* renamed from: s */
    private final C16176xt f38404s;

    /* renamed from: t */
    private final aoy f38405t;

    public C14832n(Context context, zzyz zzyz, String str, C15931oq oqVar, zzbgz zzbgz, C14816bu buVar) {
        super(context, zzyz, str, oqVar, zzbgz, buVar);
        boolean z = zzyz != null && "reward_mb".equals(zzyz.f45798a);
        this.f38403r = z ? "/Rewarded" : "/Interstitial";
        this.f38404s = z ? new C16176xt(this.f38140e, this.f38298n, new C14859p(this), this, this) : null;
        this.f38405t = new aoy(context.getApplicationContext(), C14793ay.m42908n().mo39258a());
    }

    /* renamed from: e */
    private final boolean m43079e(boolean z) {
        return this.f38404s != null && z;
    }

    /* renamed from: a */
    public final boolean mo37610a(zzyv zzyv, C15600ck ckVar) {
        if (this.f38140e.f38275j != null) {
            acd.m45783e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.f38401p == null && m42719a(zzyv) && C14793ay.m42913s().mo39043a(this.f38140e.f38268c) && !TextUtils.isEmpty(this.f38140e.f38267b)) {
            this.f38401p = new aak(this.f38140e.f38268c, this.f38140e.f38267b);
        }
        return super.mo37610a(zzyv, ckVar);
    }

    /* renamed from: a */
    public final void mo37587a(abk abk, C15600ck ckVar) {
        if (abk.f39891e != -2) {
            super.mo37587a(abk, ckVar);
            return;
        }
        if (m43079e(abk.f39889c != null)) {
            this.f38404s.mo42070a();
            return;
        }
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43766aM)).booleanValue()) {
            super.mo37587a(abk, ckVar);
            return;
        }
        boolean z = !abk.f39888b.f45630g;
        if (m42719a(abk.f39887a.f45573c) && z) {
            this.f38140e.f38276k = m43077b(abk);
        }
        super.mo37587a(this.f38140e.f38276k, ckVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ami mo37737a(abk abk, C14817bv bvVar, aag aag) throws zzbnv {
        ami a = amo.m46434a(this.f38140e.f38268c, anv.m46664a(this.f38140e.f38274i), this.f38140e.f38274i.f45798a, false, false, this.f38140e.f38269d, this.f38140e.f38270e, this.f38136a, this, this.f38144i, abk.f39895i);
        a.mo39761w().mo39775a(this, this, null, this, this, true, this, bvVar, this, aag);
        mo37739a(a);
        a.mo39724b(abk.f39887a.f45592v);
        a.mo39721a("/reward", (C15742hq<? super ami>) new C15761ii<Object>(this));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo37660a(zzyv zzyv, abj abj, boolean z) {
        if (this.f38140e.mo37702c() && abj.f39862b != null) {
            acv.m45591a(abj.f39862b);
        }
        return this.f38139d.f38188b;
    }

    /* renamed from: a */
    public final boolean mo37609a(abj abj, abj abj2) {
        if (m43079e(abj2.f39874n)) {
            return true;
        }
        if (!super.mo37609a(abj, abj2)) {
            return false;
        }
        if (!(this.f38140e.mo37702c() || this.f38140e.f38256K == null || abj2.f39871k == null)) {
            this.f38142g.mo41282a(this.f38140e.f38274i, abj2, this.f38140e.f38256K);
        }
        mo37727b(abj2, false);
        return true;
    }

    /* renamed from: F_ */
    public final void mo37716F_() {
        mo37722Z();
        super.mo37716F_();
        if (!(this.f38140e.f38275j == null || this.f38140e.f38275j.f39862b == null)) {
            anp w = this.f38140e.f38275j.f39862b.mo39761w();
            if (w != null) {
                w.mo39787g();
            }
        }
        if (!(!C14793ay.m42913s().mo39043a(this.f38140e.f38268c) || this.f38140e.f38275j == null || this.f38140e.f38275j.f39862b == null)) {
            C14793ay.m42913s().mo39047c(this.f38140e.f38275j.f39862b.getContext(), this.f38402q);
        }
        if (this.f38401p != null) {
            this.f38401p.mo39037a(true);
        }
        if (this.f38143h != null && this.f38140e.f38275j != null && this.f38140e.f38275j.f39862b != null) {
            this.f38140e.f38275j.f39862b.mo39809a("onSdkImpression", (Map) new HashMap());
        }
    }

    /* renamed from: E_ */
    public final void mo37715E_() {
        super.mo37715E_();
        this.f38142g.mo41279a(this.f38140e.f38275j);
        if (this.f38401p != null) {
            this.f38401p.mo39037a(false);
        }
        this.f38143h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo37628r() {
        mo37799F();
        super.mo37628r();
    }

    /* renamed from: d */
    public final void mo37804d(boolean z) {
        this.f38140e.f38258M = z;
    }

    /* renamed from: a */
    public final void mo37802a(boolean z, float f) {
        this.f38398l = z;
        this.f38399m = f;
    }

    /* renamed from: E */
    public final void mo37640E() {
        String str;
        C15267r.m44393b("showInterstitial must be called on the main UI thread.");
        if (m43079e(this.f38140e.f38275j != null && this.f38140e.f38275j.f39874n)) {
            this.f38404s.mo42072a(this.f38400o);
            return;
        }
        if (C14793ay.m42913s().mo39043a(this.f38140e.f38268c)) {
            this.f38402q = C14793ay.m42913s().mo39044b(this.f38140e.f38268c);
            String valueOf = String.valueOf(this.f38402q);
            String valueOf2 = String.valueOf(this.f38403r);
            this.f38402q = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.f38140e.f38275j == null) {
            acd.m45783e("The interstitial has not loaded.");
            return;
        }
        if (!this.f38396j) {
            if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43878cS)).booleanValue()) {
                return;
            }
        }
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43797ar)).booleanValue() || !acl.m45562h(this.f38140e.f38268c)) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43844bl)).booleanValue()) {
                if (this.f38140e.f38268c.getApplicationContext() != null) {
                    str = this.f38140e.f38268c.getApplicationContext().getPackageName();
                } else {
                    str = this.f38140e.f38268c.getPackageName();
                }
                if (!this.f38396j) {
                    acd.m45783e("It is not recommended to show an interstitial before onAdLoaded completes.");
                    Bundle bundle = new Bundle();
                    bundle.putString("appid", str);
                    bundle.putString("action", "show_interstitial_before_load_finish");
                    m43074a(bundle);
                }
                if (!acl.m45561g(this.f38140e.f38268c)) {
                    acd.m45783e("It is not recommended to show an interstitial when app is not in foreground.");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("appid", str);
                    bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                    m43074a(bundle2);
                }
            }
            if (!this.f38140e.mo37703d()) {
                if (this.f38140e.f38275j.f39874n && this.f38140e.f38275j.f39876p != null) {
                    try {
                        this.f38140e.f38275j.f39876p.mo41827a(this.f38400o);
                        this.f38140e.f38275j.f39876p.mo41828b();
                    } catch (RemoteException e) {
                        acd.m45780c("Could not show interstitial.", e);
                        mo37799F();
                    }
                } else if (this.f38140e.f38275j.f39862b == null) {
                    acd.m45783e("The interstitial failed to load.");
                } else if (this.f38140e.f38275j.f39862b.mo39702B()) {
                    acd.m45783e("The interstitial is already showing.");
                } else {
                    this.f38140e.f38275j.f39862b.mo39726b(true);
                    this.f38140e.mo37699a(this.f38140e.f38275j.f39862b.getView());
                    if (this.f38140e.f38275j.f39871k != null) {
                        this.f38142g.mo41281a(this.f38140e.f38274i, this.f38140e.f38275j);
                    }
                    abj abj = this.f38140e.f38275j;
                    if (abj.mo39073a()) {
                        new bub(this.f38140e.f38268c, abj.f39862b.getView()).mo41319a((buf) abj.f39862b);
                    } else {
                        abj.f39862b.mo39761w().mo39773a((ans) new C14833o(this, abj));
                    }
                    Bitmap i = this.f38140e.f38258M ? acl.m45563i(this.f38140e.f38268c) : null;
                    this.f38397k = C14793ay.m42910p().mo39259a(i);
                    if (i != null) {
                        new C14860q(this, this.f38397k).mo39129g();
                        return;
                    }
                    zzar zzar = new zzar(this.f38140e.f38258M, acl.m45567o(this.f38140e.f38268c), false, 0.0f, -1, this.f38400o, this.f38140e.f38275j.f39851L, this.f38140e.f38275j.f39854O);
                    int requestedOrientation = this.f38140e.f38275j.f39862b.getRequestedOrientation();
                    if (requestedOrientation == -1) {
                        requestedOrientation = this.f38140e.f38275j.f39868h;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.f38140e.f38275j.f39862b, requestedOrientation, this.f38140e.f38270e, this.f38140e.f38275j.f39840A, zzar);
                    C14845l.m43136a(this.f38140e.f38268c, adOverlayInfoParcel, true);
                }
            }
        } else {
            acd.m45783e("It is not recommended to show an interstitial when app is not in foreground.");
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43798as)).booleanValue()) {
                this.f38405t.mo39914a(this.f38140e.f38276k.f39888b.f45647x);
            }
        }
    }

    /* renamed from: b */
    public final void mo37613b(boolean z) {
        C15267r.m44393b("setImmersiveMode must be called on the main UI thread.");
        this.f38400o = z;
    }

    /* renamed from: a */
    private final void m43074a(Bundle bundle) {
        C14793ay.m42895a().mo39177b(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, "gmob-apps", bundle, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo37631u() {
        ami ami = this.f38140e.f38275j != null ? this.f38140e.f38275j.f39862b : null;
        abk abk = this.f38140e.f38276k;
        if (!(abk == null || abk.f39888b == null || !abk.f39888b.f45613Q || ami == null || !C14793ay.m42909o().mo41959a(this.f38140e.f38268c))) {
            int i = this.f38140e.f38270e.f45678b;
            int i2 = this.f38140e.f38270e.f45679c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i2);
            this.f38143h = C14793ay.m42909o().mo41955a(sb.toString(), ami.getWebView(), "", "javascript", mo37579D());
            if (!(this.f38143h == null || ami.getView() == null)) {
                C14793ay.m42909o().mo41958a(this.f38143h, ami.getView());
                ami.mo39716a(this.f38143h);
                C14793ay.m42909o().mo41957a(this.f38143h);
            }
        }
        super.mo37631u();
        this.f38396j = true;
    }

    /* renamed from: F */
    public final void mo37799F() {
        C14793ay.m42910p().mo39261b(Integer.valueOf(this.f38397k));
        if (this.f38140e.mo37702c()) {
            this.f38140e.mo37698a();
            this.f38140e.f38275j = null;
            this.f38140e.f38258M = false;
            this.f38396j = false;
        }
    }

    /* renamed from: G */
    public final void mo37800G() {
        if (m43079e(this.f38140e.f38275j != null && this.f38140e.f38275j.f39874n)) {
            this.f38404s.mo42076e();
            mo37634x();
            return;
        }
        if (!(this.f38140e.f38275j == null || this.f38140e.f38275j.f39883w == null)) {
            acl.m45529a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, this.f38140e.f38275j.f39883w);
        }
        mo37634x();
    }

    /* renamed from: b */
    public final void mo37803b(zzbaz zzbaz) {
        if (m43079e(this.f38140e.f38275j != null && this.f38140e.f38275j.f39874n)) {
            mo37601a(this.f38404s.mo42069a(zzbaz));
            return;
        }
        if (this.f38140e.f38275j != null) {
            if (this.f38140e.f38275j.f39884x != null) {
                acl.m45529a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, this.f38140e.f38275j.f39884x);
            }
            if (this.f38140e.f38275j.f39882v != null) {
                zzbaz = this.f38140e.f38275j.f39882v;
            }
        }
        mo37601a(zzbaz);
    }

    /* renamed from: H */
    public final void mo37801H() {
        if (m43079e(this.f38140e.f38275j != null && this.f38140e.f38275j.f39874n)) {
            this.f38404s.mo42077f();
        }
        mo37635y();
    }

    /* renamed from: b */
    private static abk m43077b(abk abk) {
        abk abk2 = abk;
        try {
            String jSONObject = C16160xd.m52365a(abk2.f39888b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pubid", abk2.f39887a.f45575e);
            C15915oa oaVar = new C15915oa(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), "", "", null, null, null, null, null, Collections.emptyList(), null, -1);
            zzaxi zzaxi = abk2.f39888b;
            C15916ob obVar = new C15916ob(Collections.singletonList(oaVar), ((Long) bym.m50299d().mo41272a(C15585bw.f43848bp)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaxi.f45604H, zzaxi.f45605I, "", -1, 0, 1, null, 0, -1, -1, false);
            zzaxi zzaxi2 = new zzaxi(abk2.f39887a, zzaxi.f45623a, zzaxi.f45625b, Collections.emptyList(), Collections.emptyList(), zzaxi.f45629f, true, zzaxi.f45631h, Collections.emptyList(), zzaxi.f45633j, zzaxi.f45634k, zzaxi.f45635l, zzaxi.f45636m, zzaxi.f45637n, zzaxi.f45638o, zzaxi.f45639p, null, zzaxi.f45641r, zzaxi.f45642s, zzaxi.f45643t, zzaxi.f45644u, zzaxi.f45645v, zzaxi.f45647x, zzaxi.f45648y, zzaxi.f45649z, null, Collections.emptyList(), Collections.emptyList(), zzaxi.f45600D, zzaxi.f45601E, zzaxi.f45602F, zzaxi.f45603G, zzaxi.f45604H, zzaxi.f45605I, zzaxi.f45606J, null, zzaxi.f45608L, zzaxi.f45609M, zzaxi.f45610N, zzaxi.f45611O, 0, zzaxi.f45613Q, Collections.emptyList(), zzaxi.f45615S, zzaxi.f45616T, zzaxi.f45617U, zzaxi.f45618V, zzaxi.f45619W);
            abk abk3 = new abk(abk2.f39887a, zzaxi2, obVar, abk2.f39890d, abk2.f39891e, abk2.f39892f, abk2.f39893g, null, abk2.f39895i, null);
            return abk3;
        } catch (JSONException e) {
            acd.m45778b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return abk2;
        }
    }

    /* renamed from: I */
    public final void mo37762I() {
        C14836c s = this.f38140e.f38275j.f39862b.mo39751s();
        if (s != null) {
            s.mo37808a();
        }
    }
}
