package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bef.effectsdk.message.MessageCenter;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14817bv;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15721gw;
import com.google.android.gms.internal.ads.C15723gy;
import com.google.android.gms.internal.ads.C16014rs;
import com.google.android.gms.internal.ads.C16020ry;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.acv;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.amo;
import com.google.android.gms.internal.ads.anp;
import com.google.android.gms.internal.ads.anq;
import com.google.android.gms.internal.ads.bwl;
import com.google.android.gms.internal.ads.bym;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Collections;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.overlay.c */
public class C14836c extends C16020ry implements C14856w {

    /* renamed from: e */
    private static final int f38424e = Color.argb(0, 0, 0, 0);

    /* renamed from: a */
    protected final Activity f38425a;

    /* renamed from: b */
    AdOverlayInfoParcel f38426b;

    /* renamed from: c */
    ami f38427c;

    /* renamed from: d */
    int f38428d;

    /* renamed from: f */
    private C14842i f38429f;

    /* renamed from: g */
    private C14848o f38430g;

    /* renamed from: h */
    private boolean f38431h;

    /* renamed from: i */
    private FrameLayout f38432i;

    /* renamed from: j */
    private CustomViewCallback f38433j;

    /* renamed from: k */
    private boolean f38434k;

    /* renamed from: l */
    private boolean f38435l;

    /* renamed from: m */
    private C14841h f38436m;

    /* renamed from: n */
    private boolean f38437n;

    /* renamed from: o */
    private final Object f38438o = new Object();

    /* renamed from: p */
    private Runnable f38439p;

    /* renamed from: q */
    private boolean f38440q;

    /* renamed from: r */
    private boolean f38441r;

    /* renamed from: s */
    private boolean f38442s = false;

    /* renamed from: t */
    private boolean f38443t = false;

    /* renamed from: u */
    private boolean f38444u = true;

    public C14836c(Activity activity) {
        this.f38425a = activity;
    }

    /* renamed from: a */
    public final void mo37810a(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public final void mo37820f() {
    }

    /* renamed from: a */
    public final void mo37808a() {
        this.f38428d = 2;
        this.f38425a.finish();
    }

    /* renamed from: b */
    public final void mo37815b() {
        if (this.f38426b != null && this.f38431h) {
            mo37809a(this.f38426b.f38417j);
        }
        if (this.f38432i != null) {
            this.f38425a.setContentView(this.f38436m);
            this.f38441r = true;
            this.f38432i.removeAllViews();
            this.f38432i = null;
        }
        if (this.f38433j != null) {
            this.f38433j.onCustomViewHidden();
            this.f38433j = null;
        }
        this.f38431h = false;
    }

    /* renamed from: c */
    public final void mo37817c() {
        this.f38428d = 1;
        this.f38425a.finish();
    }

    /* renamed from: d */
    public final void mo37818d() {
        this.f38428d = 0;
    }

    /* renamed from: e */
    public final boolean mo37819e() {
        this.f38428d = 0;
        if (this.f38427c == null) {
            return true;
        }
        boolean E = this.f38427c.mo39705E();
        if (!E) {
            this.f38427c.mo39809a("onbackblocked", Collections.emptyMap());
        }
        return E;
    }

    /* renamed from: a */
    public void mo37811a(Bundle bundle) {
        this.f38425a.requestWindowFeature(1);
        this.f38434k = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f38426b = AdOverlayInfoParcel.m43099a(this.f38425a.getIntent());
            if (this.f38426b != null) {
                if (this.f38426b.f38420m.f45679c > 7500000) {
                    this.f38428d = 3;
                }
                if (this.f38425a.getIntent() != null) {
                    this.f38444u = this.f38425a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.f38426b.f38422o != null) {
                    this.f38435l = this.f38426b.f38422o.f38496a;
                } else {
                    this.f38435l = false;
                }
                if (this.f38435l && this.f38426b.f38422o.f38500e != -1) {
                    new C14843j(this).mo39129g();
                }
                if (bundle == null) {
                    if (this.f38426b.f38410c != null && this.f38444u) {
                        this.f38426b.f38410c.mo37716F_();
                    }
                    if (!(this.f38426b.f38418k == 1 || this.f38426b.f38409b == null)) {
                        this.f38426b.f38409b.mo7870v_();
                    }
                }
                this.f38436m = new C14841h(this.f38425a, this.f38426b.f38421n, this.f38426b.f38420m.f45677a);
                this.f38436m.setId(1000);
                C14793ay.m42896b().mo39196a(this.f38425a);
                switch (this.f38426b.f38418k) {
                    case 1:
                        m43106b(false);
                        return;
                    case 2:
                        this.f38429f = new C14842i(this.f38426b.f38411d);
                        m43106b(false);
                        return;
                    case 3:
                        m43106b(true);
                        return;
                    default:
                        throw new C14840g("Could not determine ad overlay type.");
                }
            } else {
                throw new C14840g("Could not get info for ad overlay.");
            }
        } catch (C14840g e) {
            acd.m45783e(e.getMessage());
            this.f38428d = 3;
            this.f38425a.finish();
        }
    }

    /* renamed from: g */
    public final void mo37821g() {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43863cD)).booleanValue()) {
            if (this.f38427c == null || this.f38427c.mo39703C()) {
                acd.m45783e("The webview does not exist. Ignoring action.");
            } else {
                acv.m45592b(this.f38427c);
            }
        }
    }

    /* renamed from: h */
    public final void mo37822h() {
        if (this.f38426b.f38410c != null) {
            this.f38426b.f38410c.mo37730d();
        }
        m43103a(this.f38425a.getResources().getConfiguration());
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43863cD)).booleanValue()) {
            if (this.f38427c == null || this.f38427c.mo39703C()) {
                acd.m45783e("The webview does not exist. Ignoring action.");
            } else {
                acv.m45592b(this.f38427c);
            }
        }
    }

    /* renamed from: i */
    public final void mo37823i() {
        mo37815b();
        if (this.f38426b.f38410c != null) {
            this.f38426b.f38410c.mo37729c();
        }
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43863cD)).booleanValue() && this.f38427c != null && (!this.f38425a.isFinishing() || this.f38429f == null)) {
            acv.m45591a(this.f38427c);
        }
        m43107r();
    }

    /* renamed from: a */
    public final void mo37813a(C15345b bVar) {
        m43103a((Configuration) C15349d.m44669a(bVar));
    }

    /* renamed from: b */
    public final void mo37816b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f38434k);
    }

    /* renamed from: j */
    public final void mo37824j() {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43863cD)).booleanValue() && this.f38427c != null && (!this.f38425a.isFinishing() || this.f38429f == null)) {
            acv.m45591a(this.f38427c);
        }
        m43107r();
    }

    /* renamed from: k */
    public final void mo37825k() {
        if (this.f38427c != null) {
            this.f38436m.removeView(this.f38427c.getView());
        }
        m43107r();
    }

    /* renamed from: a */
    private final void m43105a(boolean z) {
        int intValue = ((Integer) bym.m50299d().mo41272a(C15585bw.f43865cF)).intValue();
        C14849p pVar = new C14849p();
        pVar.f38462e = 50;
        pVar.f38458a = z ? intValue : 0;
        pVar.f38459b = z ? 0 : intValue;
        pVar.f38460c = 0;
        pVar.f38461d = intValue;
        this.f38430g = new C14848o(this.f38425a, pVar, this);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        mo37814a(z, this.f38426b.f38414g);
        this.f38436m.addView(this.f38430g, layoutParams);
    }

    /* renamed from: l */
    public final void mo37826l() {
        this.f38441r = true;
    }

    /* renamed from: a */
    public final void mo37814a(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43762aI)).booleanValue() && this.f38426b != null && this.f38426b.f38422o != null && this.f38426b.f38422o.f38502g;
        boolean z5 = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43763aJ)).booleanValue() && this.f38426b != null && this.f38426b.f38422o != null && this.f38426b.f38422o.f38503h;
        if (z && z2 && z4 && !z5) {
            new C16014rs(this.f38427c, "useCustomClose").mo41951a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.f38430g != null) {
            C14848o oVar = this.f38430g;
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            oVar.mo37840a(z3);
        }
    }

    /* renamed from: m */
    public final void mo37827m() {
        this.f38436m.removeView(this.f38430g);
        m43105a(true);
    }

    /* renamed from: a */
    public final void mo37809a(int i) {
        if (this.f38425a.getApplicationInfo().targetSdkVersion >= ((Integer) bym.m50299d().mo41272a(C15585bw.f43882cW)).intValue()) {
            if (this.f38425a.getApplicationInfo().targetSdkVersion <= ((Integer) bym.m50299d().mo41272a(C15585bw.f43883cX)).intValue()) {
                if (VERSION.SDK_INT >= ((Integer) bym.m50299d().mo41272a(C15585bw.f43884cY)).intValue()) {
                    if (VERSION.SDK_INT <= ((Integer) bym.m50299d().mo41272a(C15585bw.f43885cZ)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.f38425a.setRequestedOrientation(i);
    }

    /* renamed from: a */
    public final void mo37812a(View view, CustomViewCallback customViewCallback) {
        this.f38432i = new FrameLayout(this.f38425a);
        this.f38432i.setBackgroundColor(-16777216);
        this.f38432i.addView(view, -1, -1);
        this.f38425a.setContentView(this.f38432i);
        this.f38441r = true;
        this.f38433j = customViewCallback;
        this.f38431h = true;
    }

    /* renamed from: b */
    private final void m43106b(boolean z) throws C14840g {
        if (!this.f38441r) {
            this.f38425a.requestWindowFeature(1);
        }
        Window window = this.f38425a.getWindow();
        if (window != null) {
            C14817bv bvVar = null;
            anp w = this.f38426b.f38411d != null ? this.f38426b.f38411d.mo39761w() : null;
            boolean z2 = false;
            boolean b = w != null ? w.mo39782b() : false;
            this.f38437n = false;
            if (b) {
                if (this.f38426b.f38417j == 6) {
                    if (this.f38425a.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.f38437n = z2;
                } else if (this.f38426b.f38417j == 7) {
                    if (this.f38425a.getResources().getConfiguration().orientation == 2) {
                        z2 = true;
                    }
                    this.f38437n = z2;
                }
            }
            boolean z3 = this.f38437n;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z3);
            acd.m45777b(sb.toString());
            mo37809a(this.f38426b.f38417j);
            window.setFlags(16777216, 16777216);
            acd.m45777b("Hardware acceleration on the AdActivity window enabled.");
            if (!this.f38435l) {
                this.f38436m.setBackgroundColor(-16777216);
            } else {
                this.f38436m.setBackgroundColor(f38424e);
            }
            this.f38425a.setContentView(this.f38436m);
            this.f38441r = true;
            if (z) {
                try {
                    this.f38427c = amo.m46434a(this.f38425a, this.f38426b.f38411d != null ? this.f38426b.f38411d.mo39759u() : null, this.f38426b.f38411d != null ? this.f38426b.f38411d.mo39760v() : null, true, b, null, this.f38426b.f38420m, null, null, this.f38426b.f38411d != null ? this.f38426b.f38411d.mo39467e() : null, bwl.m50206a());
                    anp w2 = this.f38427c.mo39761w();
                    C15721gw gwVar = this.f38426b.f38423p;
                    C15723gy gyVar = this.f38426b.f38412e;
                    C14853t tVar = this.f38426b.f38416i;
                    if (this.f38426b.f38411d != null) {
                        bvVar = this.f38426b.f38411d.mo39761w().mo39766a();
                    }
                    w2.mo39775a(null, gwVar, null, gyVar, tVar, true, null, bvVar, null, null);
                    this.f38427c.mo39761w().mo39771a((anq) new C14837d(this));
                    if (this.f38426b.f38419l != null) {
                        this.f38427c.loadUrl(this.f38426b.f38419l);
                    } else if (this.f38426b.f38415h != null) {
                        this.f38427c.loadDataWithBaseURL(this.f38426b.f38413f, this.f38426b.f38415h, "text/html", "UTF-8", null);
                    } else {
                        throw new C14840g("No URL or HTML to display in ad overlay.");
                    }
                    if (this.f38426b.f38411d != null) {
                        this.f38426b.f38411d.mo39723b(this);
                    }
                } catch (Exception e) {
                    acd.m45778b("Error obtaining webview.", e);
                    throw new C14840g("Could not obtain webview for the overlay.");
                }
            } else {
                this.f38427c = this.f38426b.f38411d;
                this.f38427c.mo39714a((Context) this.f38425a);
            }
            this.f38427c.mo39715a(this);
            if (this.f38426b.f38411d != null) {
                m43104a(this.f38426b.f38411d.mo39701A(), (View) this.f38436m);
            }
            ViewParent parent = this.f38427c.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f38427c.getView());
            }
            if (this.f38435l) {
                this.f38427c.mo39711K();
            }
            this.f38436m.addView(this.f38427c.getView(), -1, -1);
            if (!z && !this.f38437n) {
                m43108s();
            }
            m43105a(b);
            if (this.f38427c.mo39763y()) {
                mo37814a(b, true);
                return;
            }
            return;
        }
        throw new C14840g("Invalid activity, no window available.");
    }

    /* renamed from: r */
    private final void m43107r() {
        if (this.f38425a.isFinishing() && !this.f38442s) {
            this.f38442s = true;
            if (this.f38427c != null) {
                this.f38427c.mo39713a(this.f38428d);
                synchronized (this.f38438o) {
                    if (!this.f38440q && this.f38427c.mo39707G()) {
                        this.f38439p = new C14838e(this);
                        acl.f40003a.postDelayed(this.f38439p, ((Long) bym.m50299d().mo41272a(C15585bw.f43761aH)).longValue());
                        return;
                    }
                }
            }
            mo37828n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final void mo37828n() {
        if (!this.f38443t) {
            this.f38443t = true;
            if (this.f38427c != null) {
                this.f38436m.removeView(this.f38427c.getView());
                if (this.f38429f != null) {
                    this.f38427c.mo39714a(this.f38429f.f38452d);
                    this.f38427c.mo39726b(false);
                    this.f38429f.f38451c.addView(this.f38427c.getView(), this.f38429f.f38449a, this.f38429f.f38450b);
                    this.f38429f = null;
                } else if (this.f38425a.getApplicationContext() != null) {
                    this.f38427c.mo39714a(this.f38425a.getApplicationContext());
                }
                this.f38427c = null;
            }
            if (!(this.f38426b == null || this.f38426b.f38410c == null)) {
                this.f38426b.f38410c.mo37715E_();
            }
            if (!(this.f38426b == null || this.f38426b.f38411d == null)) {
                m43104a(this.f38426b.f38411d.mo39701A(), this.f38426b.f38411d.getView());
            }
        }
    }

    /* renamed from: a */
    private static void m43104a(C15345b bVar, View view) {
        if (bVar != null && view != null) {
            C14793ay.m42909o().mo41958a(bVar, view);
        }
    }

    /* renamed from: o */
    public final void mo37829o() {
        if (this.f38437n) {
            this.f38437n = false;
            m43108s();
        }
    }

    /* renamed from: s */
    private final void m43108s() {
        this.f38427c.mo39748p();
    }

    /* renamed from: p */
    public final void mo37830p() {
        this.f38436m.f38447a = true;
    }

    /* renamed from: q */
    public final void mo37831q() {
        synchronized (this.f38438o) {
            this.f38440q = true;
            if (this.f38439p != null) {
                acl.f40003a.removeCallbacks(this.f38439p);
                acl.f40003a.post(this.f38439p);
            }
        }
    }

    /* renamed from: a */
    private final void m43103a(Configuration configuration) {
        boolean z = true;
        boolean z2 = false;
        boolean z3 = this.f38426b.f38422o != null && this.f38426b.f38422o.f38497b;
        boolean a = C14793ay.m42896b().mo39199a(this.f38425a, configuration);
        if ((this.f38435l && !z3) || a) {
            z = false;
        } else if (VERSION.SDK_INT >= 19 && this.f38426b.f38422o != null && this.f38426b.f38422o.f38501f) {
            z2 = true;
        }
        Window window = this.f38425a.getWindow();
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43764aK)).booleanValue() || VERSION.SDK_INT < 19) {
            if (z) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
                window.clearFlags(2048);
                if (VERSION.SDK_INT >= 19 && z2) {
                    window.getDecorView().setSystemUiVisibility(MessageCenter.MSG_CLINET_TO_SDK_FINISH_GAME);
                    return;
                }
            } else {
                window.addFlags(2048);
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            return;
        }
        View decorView = window.getDecorView();
        int i = 256;
        if (z) {
            i = 5380;
            if (z2) {
                i = 5894;
            }
        }
        decorView.setSystemUiVisibility(i);
    }
}
