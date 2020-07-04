package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15600ck;
import com.google.android.gms.internal.ads.C15606cq;
import com.google.android.gms.internal.ads.C15742hq;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C16015rt;
import com.google.android.gms.internal.ads.C16042st;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.aag;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.amo;
import com.google.android.gms.internal.ads.anv;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzyz;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.bg */
public abstract class C14802bg extends C14797bb implements C14826h, C16015rt {

    /* renamed from: j */
    private boolean f38303j;

    public C14802bg(Context context, zzyz zzyz, String str, C15931oq oqVar, zzbgz zzbgz, C14816bu buVar) {
        super(context, zzyz, str, oqVar, zzbgz, buVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ami mo37737a(abk abk, C14817bv bvVar, aag aag) throws zzbnv {
        abk abk2 = abk;
        View nextView = this.f38140e.f38271f.getNextView();
        if (nextView instanceof ami) {
            ((ami) nextView).destroy();
        }
        if (nextView != null) {
            this.f38140e.f38271f.removeView(nextView);
        }
        ami a = amo.m46434a(this.f38140e.f38268c, anv.m46664a(this.f38140e.f38274i), this.f38140e.f38274i.f45798a, false, false, this.f38140e.f38269d, this.f38140e.f38270e, this.f38136a, this, this.f38144i, abk2.f39895i);
        if (this.f38140e.f38274i.f45804g == null) {
            mo37585a(a.getView());
        }
        a.mo39761w().mo39775a(this, this, this, this, this, false, null, bvVar, this, aag);
        mo37739a(a);
        a.mo39724b(abk2.f39887a.f45592v);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37739a(ami ami) {
        ami.mo39721a("/trackActiveViewUnit", (C15742hq<? super ami>) new C14803bh<Object>(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo37631u() {
        super.mo37631u();
        if (this.f38303j) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43824bR)).booleanValue()) {
                mo37741b(this.f38140e.f38275j.f39862b);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo37741b(ami ami) {
        if (this.f38140e.f38275j != null) {
            this.f38142g.mo41283a(this.f38140e.f38274i, this.f38140e.f38275j, ami.getView(), ami);
            this.f38303j = false;
            return;
        }
        this.f38303j = true;
        acd.m45783e("Request to enable ActiveView before adState is available.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37587a(abk abk, C15600ck ckVar) {
        if (abk.f39891e != -2) {
            acl.f40003a.post(new C14804bi(this, abk));
            return;
        }
        if (abk.f39890d != null) {
            this.f38140e.f38274i = abk.f39890d;
        }
        if (!abk.f39888b.f45630g || abk.f39888b.f45649z) {
            acl.f40003a.post(new C14805bj(this, abk, this.f38144i.f38330c.mo39023a(this.f38140e.f38268c, this.f38140e.f38270e, abk.f39888b), ckVar));
            return;
        }
        this.f38140e.f38257L = 0;
        this.f38140e.f38273h = C16042st.m52127a(this.f38140e.f38268c, this, abk, this.f38140e.f38269d, null, this.f38298n, this, ckVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo37609a(abj abj, abj abj2) {
        if (this.f38140e.mo37702c() && this.f38140e.f38271f != null) {
            this.f38140e.f38271f.f38294a.f40029a = abj2.f39840A;
        }
        try {
            if (abj2.f39862b != null && !abj2.f39874n && abj2.f39852M && !abj2.f39861a.f45779c.containsKey("sdk_less_server_data")) {
                try {
                    abj2.f39862b.mo39712L();
                } catch (Throwable unused) {
                    acd.m45438a("Could not render test Ad label.");
                }
            }
        } catch (RuntimeException unused2) {
            acd.m45438a("Could not render test AdLabel.");
        }
        if (!(abj2 == null || abj2.f39862b == null)) {
            abj2.f39862b.mo39731f(abj2.f39855P);
        }
        return super.mo37609a(abj, abj2);
    }

    /* renamed from: a */
    public final void mo37591a(C15606cq cqVar) {
        C15267r.m44393b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f38140e.f38249D = cqVar;
    }

    /* renamed from: a_ */
    public final void mo37740a_(View view) {
        this.f38140e.f38256K = view;
        abj abj = new abj(this.f38140e.f38276k, null, null, null, null, null, null, null);
        mo37611b(abj);
    }

    /* renamed from: w_ */
    public final void mo37742w_() {
        mo7870v_();
    }

    /* renamed from: x_ */
    public final void mo37743x_() {
        mo37722Z();
        mo37621k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final boolean mo37735J() {
        return (this.f38140e.f38276k == null || this.f38140e.f38276k.f39888b == null || !this.f38140e.f38276k.f39888b.f45613Q) ? false : true;
    }

    /* renamed from: a */
    public final void mo37738a(int i, int i2, int i3, int i4) {
        mo37630t();
    }

    /* renamed from: K */
    public final void mo37736K() {
        mo37628r();
    }
}
