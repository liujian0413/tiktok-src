package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C14745e;
import com.google.android.gms.ads.C14746f;
import com.google.android.gms.ads.internal.overlay.C14853t;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15326i;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C15488ak;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15598ci;
import com.google.android.gms.internal.ads.C15600ck;
import com.google.android.gms.internal.ads.C15606cq;
import com.google.android.gms.internal.ads.C15721gw;
import com.google.android.gms.internal.ads.C15723gy;
import com.google.android.gms.internal.ads.C15725h;
import com.google.android.gms.internal.ads.C15833l;
import com.google.android.gms.internal.ads.C15914o;
import com.google.android.gms.internal.ads.C16027se;
import com.google.android.gms.internal.ads.C16033sk;
import com.google.android.gms.internal.ads.C16043su;
import com.google.android.gms.internal.ads.C16076u;
import com.google.android.gms.internal.ads.C16099ux;
import com.google.android.gms.internal.ads.C16177xu;
import com.google.android.gms.internal.ads.C16184ya;
import com.google.android.gms.internal.ads.C16187yd;
import com.google.android.gms.internal.ads.C16194yk;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.abd;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.abl;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.abx;
import com.google.android.gms.internal.ads.acb;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.afb;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.anv;
import com.google.android.gms.internal.ads.bte;
import com.google.android.gms.internal.ads.bwl;
import com.google.android.gms.internal.ads.bwm;
import com.google.android.gms.internal.ads.bxr;
import com.google.android.gms.internal.ads.bxy;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.byp;
import com.google.android.gms.internal.ads.bys;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzaco;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzxh.zza.zzb;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.a */
public abstract class C14768a extends C15725h implements C14853t, abv, bxr, C15721gw, C15723gy, C16043su, C16099ux {

    /* renamed from: a */
    protected C15600ck f38136a;

    /* renamed from: b */
    protected C15598ci f38137b;

    /* renamed from: c */
    protected boolean f38138c;

    /* renamed from: d */
    protected final C14782an f38139d;

    /* renamed from: e */
    public final C14794az f38140e;

    /* renamed from: f */
    protected transient zzyv f38141f;

    /* renamed from: g */
    protected final bte f38142g;

    /* renamed from: h */
    protected C15345b f38143h;

    /* renamed from: i */
    public final C14816bu f38144i;

    /* renamed from: j */
    private C15598ci f38145j;

    /* renamed from: k */
    private final Bundle f38146k = new Bundle();

    /* renamed from: l */
    private boolean f38147l = false;

    /* renamed from: a */
    protected static boolean m42719a(zzyv zzyv) {
        Bundle bundle = zzyv.f45789m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo37587a(abk abk, C15600ck ckVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo37608a(abj abj) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo37609a(abj abj, abj abj2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo37610a(zzyv zzyv, C15600ck ckVar);

    /* renamed from: q */
    public C15488ak mo37627q() {
        return null;
    }

    C14768a(C14794az azVar, C14782an anVar, C14816bu buVar) {
        this.f38140e = azVar;
        this.f38139d = new C14782an(this);
        this.f38144i = buVar;
        C14793ay.m42895a().mo39178b(this.f38140e.f38268c);
        C14793ay.m42895a().mo39179c(this.f38140e.f38268c);
        acb.m45435a(this.f38140e.f38268c);
        C14793ay.m42905k().mo41731a(this.f38140e.f38268c);
        C14793ay.m42898d().mo39087a(this.f38140e.f38268c, this.f38140e.f38270e);
        C14793ay.m42900f().mo41397a(this.f38140e.f38268c);
        this.f38142g = C14793ay.m42898d().f39921a;
        C14793ay.m42897c().mo41361a(this.f38140e.f38268c);
        C14793ay.m42911q().mo39265a(this.f38140e.f38268c);
    }

    /* renamed from: a */
    public final void mo37590a(C15598ci ciVar) {
        this.f38136a = new C15600ck(((Boolean) bym.m50299d().mo41272a(C15585bw.f43740N)).booleanValue(), "load_ad", this.f38140e.f38274i.f45798a);
        this.f38145j = new C15598ci(-1, null, null);
        if (ciVar == null) {
            this.f38137b = new C15598ci(-1, null, null);
        } else {
            this.f38137b = new C15598ci(ciVar.f44221a, ciVar.f44222b, ciVar.f44223c);
        }
    }

    /* renamed from: g */
    public void mo37617g() {
        C15267r.m44393b("#008 Must be called on the main UI thread.: destroy");
        this.f38139d.mo37673a();
        this.f38142g.mo41285b(this.f38140e.f38275j);
        C14794az azVar = this.f38140e;
        if (azVar.f38271f != null) {
            azVar.f38271f.mo37708a();
        }
        azVar.f38279n = null;
        azVar.f38281p = null;
        azVar.f38280o = null;
        azVar.f38249D = null;
        azVar.f38282q = null;
        azVar.mo37700a(false);
        if (azVar.f38271f != null) {
            azVar.f38271f.removeAllViews();
        }
        azVar.mo37698a();
        azVar.mo37701b();
        azVar.f38275j = null;
        this.f38143h = null;
    }

    /* renamed from: h */
    public final C15345b mo37618h() {
        C15267r.m44393b("#008 Must be called on the main UI thread.: getAdFrame");
        return C15349d.m44668a(this.f38140e.f38271f);
    }

    /* renamed from: i */
    public final zzyz mo37619i() {
        C15267r.m44393b("#008 Must be called on the main UI thread.: getAdSize");
        if (this.f38140e.f38274i == null) {
            return null;
        }
        return new zzaco(this.f38140e.f38274i);
    }

    /* renamed from: j */
    public final boolean mo37620j() {
        C15267r.m44393b("#008 Must be called on the main UI thread.: isLoaded");
        return this.f38140e.f38272g == null && this.f38140e.f38273h == null && this.f38140e.f38275j != null;
    }

    /* renamed from: a */
    public void mo37607a(boolean z) {
        acd.m45783e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    /* renamed from: b */
    public boolean mo37614b(zzyv zzyv) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: loadAd");
        C14793ay.m42900f().mo41396a();
        this.f38146k.clear();
        this.f38147l = false;
        zzyv a = zzyv.mo42397a();
        a.f45779c.putInt("dv", DynamiteModule.m44690b(this.f38140e.f38268c, ModuleDescriptor.MODULE_ID));
        a.f45779c.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
        if (this.f38140e.f38289x != null) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43822bP)).booleanValue() && this.f38140e.f38289x.f45506a > 3) {
                a.f45779c.putBoolean("enable_native_media_orientation", true);
                String a2 = this.f38140e.f38289x.mo42163a();
                if (!"unknown".equals(a2)) {
                    a.f45779c.putString("native_media_orientation", a2);
                }
            }
        }
        if (C15326i.m44581c(this.f38140e.f38268c) && a.f45787k != null) {
            a = new bxy(a).mo41429a(null).mo41430a();
        }
        if (this.f38140e.f38272g == null && this.f38140e.f38273h == null) {
            acd.m45781d("Starting ad request.");
            String str = "SDK version: ";
            String valueOf = String.valueOf(this.f38140e.f38270e.f45677a);
            acd.m45781d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            mo37590a((C15598ci) null);
            this.f38137b = this.f38136a.mo41454a();
            if (a.f45782f) {
                acd.m45781d("This request is sent from a test device.");
            } else {
                String a3 = afb.m45723a(this.f38140e.f38268c);
                StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 71);
                sb.append("Use AdRequest.Builder.addTestDevice(\"");
                sb.append(a3);
                sb.append("\") to get test ads on this device.");
                acd.m45781d(sb.toString());
            }
            this.f38139d.f38187a = a;
            this.f38138c = mo37610a(a, this.f38136a);
            return this.f38138c;
        }
        if (this.f38141f != null) {
            acd.m45783e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            acd.m45783e("Loading already in progress, saving this object for future refreshes.");
        }
        this.f38141f = a;
        return false;
    }

    /* renamed from: a */
    public final void mo37586a(abk abk) {
        if (abk.f39888b.f45636m != -1 && !TextUtils.isEmpty(abk.f39888b.f45646w)) {
            long c = mo37663c(abk.f39888b.f45646w);
            if (c != -1) {
                C15598ci a = this.f38136a.mo41455a(abk.f39888b.f45636m + c);
                this.f38136a.mo41460a(a, "stc");
            }
        }
        this.f38136a.mo41457a(abk.f39888b.f45646w);
        this.f38136a.mo41460a(this.f38137b, "arf");
        this.f38145j = this.f38136a.mo41454a();
        this.f38136a.mo41458a("gqi", abk.f39888b.f45647x);
        this.f38140e.f38272g = null;
        this.f38140e.f38276k = abk;
        abk.f39895i.mo41409a((bwm) new C14769aa(this, abk));
        abk.f39895i.mo41410a(zzb.AD_LOADED);
        mo37587a(abk, this.f38136a);
    }

    /* renamed from: b */
    public void mo37611b(abj abj) {
        this.f38136a.mo41460a(this.f38145j, "awr");
        this.f38140e.f38273h = null;
        if (!(abj.f39864d == -2 || abj.f39864d == 3 || this.f38140e.f38259N == null)) {
            C14793ay.m42898d().f39922b.mo39124a(this.f38140e.f38259N);
        }
        if (abj.f39864d == -1) {
            this.f38138c = false;
            return;
        }
        if (mo37608a(abj)) {
            acd.m45777b("Ad refresh scheduled.");
        }
        if (abj.f39864d != -2) {
            mo37583a(abj.f39864d, abj.f39850K);
            return;
        }
        if (this.f38140e.f38255J == null) {
            this.f38140e.f38255J = new abx(this.f38140e.f38267b);
        }
        if (this.f38140e.f38271f != null) {
            this.f38140e.f38271f.f38294a.f40032d = abj.f39841B;
        }
        this.f38142g.mo41279a(this.f38140e.f38275j);
        if (mo37609a(this.f38140e.f38275j, abj)) {
            this.f38140e.f38275j = abj;
            C14794az azVar = this.f38140e;
            if (azVar.f38277l != null) {
                if (azVar.f38275j != null) {
                    azVar.f38277l.mo39075a(azVar.f38275j.f39885y);
                    azVar.f38277l.mo39079b(azVar.f38275j.f39886z);
                    azVar.f38277l.mo39080b(azVar.f38275j.f39874n);
                }
                azVar.f38277l.mo39077a(azVar.f38274i.f45801d);
            }
            this.f38136a.mo41458a("is_mraid", this.f38140e.f38275j.mo39073a() ? "1" : "0");
            this.f38136a.mo41458a("is_mediation", this.f38140e.f38275j.f39874n ? "1" : "0");
            if (!(this.f38140e.f38275j.f39862b == null || this.f38140e.f38275j.f39862b.mo39761w() == null)) {
                this.f38136a.mo41458a("is_delay_pl", this.f38140e.f38275j.f39862b.mo39761w().mo39786f() ? "1" : "0");
            }
            this.f38136a.mo41460a(this.f38137b, "ttc");
            if (C14793ay.m42898d().mo39086a() != null) {
                C14793ay.m42898d().mo39086a().mo41449a(this.f38136a);
            }
            mo37636z();
            if (this.f38140e.mo37702c()) {
                mo37631u();
            }
        }
        if (abj.f39849J != null) {
            C14793ay.m42895a().mo39174a(this.f38140e.f38268c, abj.f39849J);
        }
    }

    /* renamed from: v_ */
    public void mo7870v_() {
        if (this.f38140e.f38275j == null) {
            acd.m45783e("Ad state was null when trying to ping click URLs.");
            return;
        }
        acd.m45777b("Pinging click URLs.");
        if (this.f38140e.f38277l != null) {
            this.f38140e.f38277l.mo39078b();
        }
        if (this.f38140e.f38275j.f39863c != null) {
            acl.m45529a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, mo37582a(this.f38140e.f38275j.f39863c, this.f38140e.f38275j.f39855P));
        }
        if (this.f38140e.f38278m != null) {
            try {
                this.f38140e.f38278m.mo41416a();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: G_ */
    public final void mo37580G_() {
        mo37629s();
    }

    /* renamed from: a */
    public final void mo37604a(String str, Bundle bundle) {
        this.f38146k.putAll(bundle);
        if (this.f38147l && this.f38140e.f38281p != null) {
            try {
                this.f38140e.f38281p.mo41428a();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo37605a(String str, String str2) {
        if (this.f38140e.f38280o != null) {
            try {
                this.f38140e.f38280o.mo41435a(str, str2);
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: k */
    public final void mo37621k() {
        C15267r.m44393b("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.f38140e.f38275j == null) {
            acd.m45783e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        acd.m45777b("Pinging manual tracking URLs.");
        if (!this.f38140e.f38275j.f39847H) {
            ArrayList arrayList = new ArrayList();
            if (this.f38140e.f38275j.f39867g != null) {
                arrayList.addAll(this.f38140e.f38275j.f39867g);
            }
            if (!(this.f38140e.f38275j.f39875o == null || this.f38140e.f38275j.f39875o.f44723i == null)) {
                arrayList.addAll(this.f38140e.f38275j.f39875o.f44723i);
            }
            if (!arrayList.isEmpty()) {
                acl.m45529a(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, (List<String>) arrayList);
                this.f38140e.f38275j.f39847H = true;
            }
        }
    }

    /* renamed from: l */
    public void mo37622l() {
        C15267r.m44393b("#008 Must be called on the main UI thread.: pause");
    }

    /* renamed from: m */
    public void mo37623m() {
        C15267r.m44393b("#008 Must be called on the main UI thread.: resume");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo37616c(zzyv zzyv) {
        if (this.f38140e.f38271f == null) {
            return false;
        }
        ViewParent parent = this.f38140e.f38271f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return C14793ay.m42895a().mo39175a(view, view.getContext());
    }

    /* renamed from: a */
    public final void mo37589a(bys bys) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setAdListener");
        this.f38140e.f38279n = bys;
    }

    /* renamed from: a */
    public final void mo37598a(C16194yk ykVar) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.f38140e.f38250E = ykVar;
    }

    /* renamed from: a */
    public final void mo37597a(C16187yd ydVar) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f38140e.f38251F = ydVar;
    }

    /* renamed from: a */
    public final void mo37603a(String str) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setUserId");
        this.f38140e.f38252G = str;
    }

    /* renamed from: b */
    public final void mo37612b(String str) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setCustomData");
        this.f38140e.f38253H = str;
    }

    /* renamed from: a */
    public final void mo37588a(byp byp) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setAdClickListener");
        this.f38140e.f38278m = byp;
    }

    /* renamed from: a */
    public final void mo37602a(zzyz zzyz) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setAdSize");
        this.f38140e.f38274i = zzyz;
        if (!(this.f38140e.f38275j == null || this.f38140e.f38275j.f39862b == null || this.f38140e.f38257L != 0)) {
            this.f38140e.f38275j.f39862b.mo39717a(anv.m46664a(zzyz));
        }
        if (this.f38140e.f38271f != null) {
            if (this.f38140e.f38271f.getChildCount() > 1) {
                this.f38140e.f38271f.removeView(this.f38140e.f38271f.getNextView());
            }
            this.f38140e.f38271f.setMinimumWidth(zzyz.f45803f);
            this.f38140e.f38271f.setMinimumHeight(zzyz.f45800c);
            this.f38140e.f38271f.requestLayout();
            if (this.f38140e.f38275j != null && this.f38140e.f38275j.f39874n && (this.f38140e.f38271f.getCurrentView() instanceof C14746f)) {
                ((C14746f) this.f38140e.f38271f.getCurrentView()).mo37456a(new C14745e[]{new C14745e(zzyz.f45802e, zzyz.f45799b)});
            }
        }
    }

    /* renamed from: a */
    public final void mo37593a(C15914o oVar) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setAppEventListener");
        this.f38140e.f38280o = oVar;
    }

    /* renamed from: a */
    public final void mo37592a(C15833l lVar) {
        this.f38140e.f38281p = lVar;
    }

    /* renamed from: n */
    public final Bundle mo37624n() {
        if (this.f38147l) {
            return this.f38146k;
        }
        return new Bundle();
    }

    /* renamed from: a */
    public void mo37594a(C16027se seVar) {
        acd.m45783e("#006 Unexpected call to a deprecated method.");
    }

    /* renamed from: a */
    public void mo37591a(C15606cq cqVar) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* renamed from: a */
    public final void mo37595a(C16033sk skVar, String str) {
        acd.m45783e("#006 Unexpected call to a deprecated method.");
    }

    /* renamed from: a */
    public final void mo37596a(C16076u uVar) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.f38140e.f38282q = uVar;
    }

    /* renamed from: o */
    public final void mo37625o() {
        C15267r.m44393b("#008 Must be called on the main UI thread.: stopLoading");
        this.f38138c = false;
        this.f38140e.mo37700a(true);
    }

    /* renamed from: p */
    public final boolean mo37626p() {
        return this.f38138c;
    }

    /* renamed from: a */
    public final void mo37600a(zzacq zzacq) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setVideoOptions");
        this.f38140e.f38290y = zzacq;
    }

    /* renamed from: a */
    public final void mo37599a(zzabp zzabp) {
        C15267r.m44393b("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.f38140e.f38246A = zzabp;
    }

    /* renamed from: b */
    public void mo37613b(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* renamed from: c */
    private static long mo37663c(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            afm.m45778b("", e);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37585a(View view) {
        C14796ba baVar = this.f38140e.f38271f;
        if (baVar != null) {
            baVar.addView(view, C14793ay.m42896b().mo39202b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo37628r() {
        acd.m45438a("Ad closing.");
        if (this.f38140e.f38279n != null) {
            try {
                this.f38140e.f38279n.mo41419a();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38140e.f38250E != null) {
            try {
                this.f38140e.f38250E.mo41687d();
            } catch (RemoteException e2) {
                acd.m45782d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo37629s() {
        acd.m45438a("Ad leaving application.");
        if (this.f38140e.f38279n != null) {
            try {
                this.f38140e.f38279n.mo41421b();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38140e.f38250E != null) {
            try {
                this.f38140e.f38250E.mo41688e();
            } catch (RemoteException e2) {
                acd.m45782d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo37630t() {
        acd.m45438a("Ad opening.");
        if (this.f38140e.f38279n != null) {
            try {
                this.f38140e.f38279n.mo41423d();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38140e.f38250E != null) {
            try {
                this.f38140e.f38250E.mo41685b();
            } catch (RemoteException e2) {
                acd.m45782d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo37631u() {
        mo37615c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo37615c(boolean z) {
        acd.m45438a("Ad finished loading.");
        this.f38138c = z;
        this.f38147l = true;
        if (this.f38140e.f38279n != null) {
            try {
                this.f38140e.f38279n.mo41422c();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38140e.f38250E != null) {
            try {
                this.f38140e.f38250E.mo41682a();
            } catch (RemoteException e2) {
                acd.m45782d("#007 Could not call remote method.", e2);
            }
        }
        if (this.f38140e.f38281p != null) {
            try {
                this.f38140e.f38281p.mo41428a();
            } catch (RemoteException e3) {
                acd.m45782d("#007 Could not call remote method.", e3);
            }
        }
    }

    /* renamed from: a */
    public void mo37583a(int i, bwl bwl) {
        mo37584a(i, false, bwl);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37584a(int i, boolean z, bwl bwl) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i);
        acd.m45783e(sb.toString());
        this.f38138c = z;
        if (bwl != null) {
            switch (i) {
                case 1:
                    bwl.mo41410a(zzb.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                    break;
                case 2:
                    bwl.mo41410a(zzb.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                    break;
                case 3:
                    bwl.mo41410a(zzb.AD_FAILED_TO_LOAD_NO_FILL);
                    break;
                case 4:
                    bwl.mo41410a(zzb.AD_FAILED_TO_LOAD_TIMEOUT);
                    break;
                case 5:
                    bwl.mo41410a(zzb.AD_FAILED_TO_LOAD_CANCELLED);
                    break;
                case 6:
                    bwl.mo41410a(zzb.AD_FAILED_TO_LOAD_NO_ERROR);
                    break;
                case 7:
                    bwl.mo41410a(zzb.AD_FAILED_TO_LOAD_NOT_FOUND);
                    break;
                default:
                    bwl.mo41410a(zzb.AD_FAILED_TO_LOAD);
                    break;
            }
        }
        if (this.f38140e.f38279n != null) {
            try {
                this.f38140e.f38279n.mo41420a(i);
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38140e.f38250E != null) {
            try {
                this.f38140e.f38250E.mo41683a(i);
            } catch (RemoteException e2) {
                acd.m45782d("#007 Could not call remote method.", e2);
            }
        }
        if (this.f38140e.f38286u != null) {
            try {
                this.f38140e.f38286u.mo41673a(i);
            } catch (RemoteException e3) {
                acd.m45782d("#007 Could not call remote method.", e3);
            }
        }
    }

    /* renamed from: v */
    public final void mo37632v() {
        acd.m45781d("Ad impression.");
        if (this.f38140e.f38279n != null) {
            try {
                this.f38140e.f38279n.mo41424e();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: w */
    public final void mo37633w() {
        acd.m45781d("Ad clicked.");
        if (this.f38140e.f38279n != null) {
            try {
                this.f38140e.f38279n.mo41425f();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo37634x() {
        if (this.f38140e.f38250E != null) {
            try {
                this.f38140e.f38250E.mo41686c();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37601a(zzbaz zzbaz) {
        if (this.f38140e.f38250E != null) {
            String str = "";
            int i = 1;
            if (zzbaz != null) {
                try {
                    str = zzbaz.f45667a;
                    i = zzbaz.f45668b;
                } catch (RemoteException e) {
                    acd.m45782d("#007 Could not call remote method.", e);
                    return;
                }
            }
            C16177xu xuVar = new C16177xu(str, i);
            this.f38140e.f38250E.mo41684a((C16184ya) xuVar);
            if (this.f38140e.f38251F != null) {
                this.f38140e.f38251F.mo42111a(xuVar, this.f38140e.f38275j.f39875o.f44729o, this.f38140e.f38275j.f39875o.f44730p);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo37635y() {
        if (this.f38140e.f38250E != null) {
            try {
                this.f38140e.f38250E.mo41689f();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<String> mo37581a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(abd.m45355a(a, this.f38140e.f38268c));
        }
        return arrayList;
    }

    /* renamed from: z */
    public final void mo37636z() {
        abj abj = this.f38140e.f38275j;
        if (abj != null && !TextUtils.isEmpty(abj.f39841B) && !abj.f39848I && C14793ay.m42903i().mo39233b()) {
            acd.m45777b("Sending troubleshooting signals to the server.");
            C14793ay.m42903i().mo39232b(this.f38140e.f38268c, this.f38140e.f38270e.f45677a, abj.f39841B, this.f38140e.f38267b);
            abj.f39848I = true;
        }
    }

    /* renamed from: a */
    public final void mo37606a(HashSet<abl> hashSet) {
        this.f38140e.f38259N = hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<String> mo37582a(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(abd.m45356a(a, this.f38140e.f38268c, z));
        }
        return arrayList;
    }

    /* renamed from: A */
    public String mo37576A() {
        return this.f38140e.f38267b;
    }

    /* renamed from: B */
    public final C15914o mo37577B() {
        return this.f38140e.f38280o;
    }

    /* renamed from: C */
    public final bys mo37578C() {
        return this.f38140e.f38279n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo37579D() {
        abk abk = this.f38140e.f38276k;
        if (abk == null) {
            return "javascript";
        }
        if (abk.f39888b == null) {
            return "javascript";
        }
        String str = abk.f39888b.f45616T;
        if (TextUtils.isEmpty(str)) {
            return "javascript";
        }
        try {
            if (new JSONObject(str).optInt("media_type", -1) == 0) {
                return null;
            }
            return "javascript";
        } catch (JSONException e) {
            afm.m45780c("", e);
            return "javascript";
        }
    }
}
