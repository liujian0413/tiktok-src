package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14797bb;
import com.google.android.gms.ads.internal.C14816bu;
import com.google.android.gms.common.internal.C15267r;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xx */
public final class C16180xx extends C14797bb implements C16211za {

    /* renamed from: j */
    private static C16180xx f45422j;

    /* renamed from: k */
    private boolean f45423k;

    /* renamed from: l */
    private boolean f45424l;

    /* renamed from: m */
    private final aak f45425m;

    /* renamed from: o */
    private final C16176xt f45426o;

    /* renamed from: F */
    public static C16180xx m52425F() {
        return f45422j;
    }

    /* renamed from: a */
    public final boolean mo37660a(zzyv zzyv, abj abj, boolean z) {
        return false;
    }

    public C16180xx(Context context, C14816bu buVar, zzyz zzyz, C15931oq oqVar, zzbgz zzbgz) {
        super(context, zzyz, null, oqVar, zzbgz, buVar);
        f45422j = this;
        this.f45425m = new aak(context, null);
        C16176xt xtVar = new C16176xt(this.f38140e, this.f38298n, this, this, this);
        this.f45426o = xtVar;
    }

    /* renamed from: a */
    public final void mo42108a(zzbad zzbad) {
        C15267r.m44393b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzbad.f45666b)) {
            acd.m45783e("Invalid ad unit id. Aborting.");
            acl.f40003a.post(new C16181xy(this));
            return;
        }
        this.f45423k = false;
        this.f38140e.f38267b = zzbad.f45666b;
        this.f45425m.f39804a = zzbad.f45666b;
        super.mo37614b(zzbad.f45665a);
    }

    /* renamed from: a */
    public final void mo37587a(abk abk, C15600ck ckVar) {
        if (abk.f39891e != -2) {
            acl.f40003a.post(new C16182xz(this, abk));
            return;
        }
        this.f38140e.f38276k = abk;
        if (abk.f39889c == null) {
            this.f38140e.f38276k = m52429b(abk);
        }
        this.f45426o.mo42070a();
    }

    /* renamed from: c */
    public final C16218zh mo37663c(String str) {
        return this.f45426o.mo42068a(str);
    }

    /* renamed from: a */
    public final boolean mo37609a(abj abj, abj abj2) {
        mo37727b(abj2, false);
        return true;
    }

    /* renamed from: l */
    public final void mo37622l() {
        this.f45426o.mo42073b();
    }

    /* renamed from: m */
    public final void mo37623m() {
        this.f45426o.mo42074c();
    }

    /* renamed from: g */
    public final void mo37617g() {
        this.f45426o.mo42075d();
        super.mo37617g();
    }

    /* renamed from: b */
    public final void mo37613b(boolean z) {
        C15267r.m44393b("setImmersiveMode must be called on the main UI thread.");
        this.f45424l = z;
    }

    /* renamed from: G */
    public final void mo42105G() {
        C15267r.m44393b("showAd must be called on the main UI thread.");
        if (!mo42106H()) {
            acd.m45783e("The reward video has not loaded.");
        } else {
            this.f45426o.mo42072a(this.f45424l);
        }
    }

    /* renamed from: H */
    public final boolean mo42106H() {
        C15267r.m44393b("isLoaded must be called on the main UI thread.");
        return this.f38140e.f38272g == null && this.f38140e.f38273h == null && this.f38140e.f38275j != null;
    }

    /* renamed from: B_ */
    public final void mo37843B_() {
        if (C14793ay.m42913s().mo39043a(this.f38140e.f38268c)) {
            this.f45425m.mo39037a(true);
        }
        mo37723a(this.f38140e.f38275j, false);
        mo37630t();
    }

    /* renamed from: b */
    public final void mo37847b() {
        this.f45426o.mo42076e();
        mo37634x();
    }

    /* renamed from: f */
    public final void mo37849f() {
        this.f45426o.mo42077f();
        mo37635y();
    }

    /* renamed from: C_ */
    public final void mo37844C_() {
        if (C14793ay.m42913s().mo39043a(this.f38140e.f38268c)) {
            this.f45425m.mo39037a(false);
        }
        mo37628r();
    }

    /* renamed from: r */
    public final void mo37628r() {
        this.f38140e.f38275j = null;
        super.mo37628r();
    }

    /* renamed from: a_ */
    public final void mo37846a_(zzbaz zzbaz) {
        zzbaz a = this.f45426o.mo42069a(zzbaz);
        if (C14793ay.m42913s().mo39043a(this.f38140e.f38268c) && a != null) {
            C14793ay.m42913s().mo39040a(this.f38140e.f38268c, C14793ay.m42913s().mo39050e(this.f38140e.f38268c), this.f38140e.f38267b, a.f45667a, a.f45668b);
        }
        mo37601a(a);
    }

    /* renamed from: D_ */
    public final void mo37845D_() {
        mo7870v_();
    }

    /* renamed from: e */
    public final void mo37848e() {
        mo37629s();
    }

    /* renamed from: a */
    public final void mo42107a(Context context) {
        this.f45426o.mo42071a(context);
    }

    /* renamed from: b */
    private static abk m52429b(abk abk) {
        abk abk2 = abk;
        acd.m45438a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            JSONObject a = C16160xd.m52365a(abk2.f39888b);
            a.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pubid", abk2.f39887a.f45575e);
            String jSONObject2 = jSONObject.toString();
            C15915oa oaVar = new C15915oa(a.toString(), null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), "", "", null, null, null, null, null, Collections.emptyList(), null, -1);
            C15916ob obVar = new C15916ob(Arrays.asList(new C15915oa[]{oaVar}), ((Long) bym.m50299d().mo41272a(C15585bw.f43848bp)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false);
            abk abk3 = new abk(abk2.f39887a, abk2.f39888b, obVar, abk2.f39890d, abk2.f39891e, abk2.f39892f, abk2.f39893g, abk2.f39894h, abk2.f39895i, null);
            return abk3;
        } catch (JSONException e) {
            acd.m45778b("Unable to generate ad state for non-mediated rewarded video.", e);
            abk abk4 = new abk(abk2.f39887a, abk2.f39888b, null, abk2.f39890d, 0, abk2.f39892f, abk2.f39893g, abk2.f39894h, abk2.f39895i, null);
            return abk4;
        }
    }
}
