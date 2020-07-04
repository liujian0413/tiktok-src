package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.dl */
public final class C15628dl extends C15709gk implements C15637dt {

    /* renamed from: a */
    private String f44315a;

    /* renamed from: b */
    private List<C15620dd> f44316b;

    /* renamed from: c */
    private List<Object> f44317c;

    /* renamed from: d */
    private boolean f44318d;

    /* renamed from: e */
    private String f44319e;

    /* renamed from: f */
    private C15658en f44320f;

    /* renamed from: g */
    private String f44321g;

    /* renamed from: h */
    private String f44322h;

    /* renamed from: i */
    private double f44323i;

    /* renamed from: j */
    private String f44324j;

    /* renamed from: k */
    private String f44325k;

    /* renamed from: l */
    private C15612cw f44326l;

    /* renamed from: m */
    private C15488ak f44327m;

    /* renamed from: n */
    private View f44328n;

    /* renamed from: o */
    private C15345b f44329o;

    /* renamed from: p */
    private String f44330p;

    /* renamed from: q */
    private Bundle f44331q;

    /* renamed from: r */
    private final Object f44332r = new Object();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C15632dp f44333s;

    public C15628dl(String str, List<C15620dd> list, String str2, C15658en enVar, String str3, String str4, double d, String str5, String str6, C15612cw cwVar, C15488ak akVar, View view, C15345b bVar, String str7, Bundle bundle) {
        this.f44315a = str;
        this.f44316b = list;
        this.f44317c = null;
        this.f44318d = false;
        this.f44319e = str2;
        this.f44320f = enVar;
        this.f44321g = str3;
        this.f44322h = str4;
        this.f44323i = d;
        this.f44324j = str5;
        this.f44325k = str6;
        this.f44326l = cwVar;
        this.f44327m = akVar;
        this.f44328n = view;
        this.f44329o = bVar;
        this.f44330p = str7;
        this.f44331q = bundle;
    }

    /* renamed from: a */
    public final void mo41546a(C15470ad adVar) {
    }

    /* renamed from: a */
    public final void mo41547a(C15478ag agVar) {
    }

    /* renamed from: b */
    public final String mo41481b() {
        return "6";
    }

    /* renamed from: c */
    public final String mo41482c() {
        return "";
    }

    /* renamed from: g */
    public final List mo41551g() {
        return null;
    }

    /* renamed from: h */
    public final boolean mo41552h() {
        return false;
    }

    /* renamed from: a */
    public final String mo41544a() {
        return this.f44315a;
    }

    /* renamed from: f */
    public final List mo41500f() {
        return this.f44316b;
    }

    /* renamed from: i */
    public final String mo41553i() {
        return this.f44319e;
    }

    /* renamed from: j */
    public final C15658en mo41554j() {
        return this.f44320f;
    }

    /* renamed from: k */
    public final String mo41555k() {
        return this.f44321g;
    }

    /* renamed from: l */
    public final String mo41556l() {
        return this.f44322h;
    }

    /* renamed from: m */
    public final double mo41557m() {
        return this.f44323i;
    }

    /* renamed from: n */
    public final String mo41558n() {
        return this.f44324j;
    }

    /* renamed from: o */
    public final String mo41559o() {
        return this.f44325k;
    }

    /* renamed from: p */
    public final C15488ak mo41560p() {
        return this.f44327m;
    }

    /* renamed from: q */
    public final C15345b mo41561q() {
        return C15349d.m44668a(this.f44333s);
    }

    /* renamed from: a */
    public final void mo41480a(C15632dp dpVar) {
        synchronized (this.f44332r) {
            this.f44333s = dpVar;
        }
    }

    /* renamed from: d */
    public final C15612cw mo41483d() {
        return this.f44326l;
    }

    /* renamed from: e */
    public final View mo41484e() {
        return this.f44328n;
    }

    /* renamed from: r */
    public final C15345b mo41562r() {
        return this.f44329o;
    }

    /* renamed from: s */
    public final String mo41563s() {
        return this.f44330p;
    }

    /* renamed from: t */
    public final Bundle mo41564t() {
        return this.f44331q;
    }

    /* renamed from: u */
    public final C15654ej mo41565u() {
        return this.f44326l;
    }

    /* renamed from: v */
    public final void mo41566v() {
        acl.f40003a.post(new C15629dm(this));
    }

    /* renamed from: a */
    public final void mo41545a(Bundle bundle) {
        synchronized (this.f44332r) {
            if (this.f44333s == null) {
                acd.m45779c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f44333s.mo41597b(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo41549b(Bundle bundle) {
        synchronized (this.f44332r) {
            if (this.f44333s == null) {
                acd.m45779c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f44333s.mo41596a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final void mo41550c(Bundle bundle) {
        synchronized (this.f44332r) {
            if (this.f44333s == null) {
                acd.m45779c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f44333s.mo41599c(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo41548a(C15706gh ghVar) {
        this.f44333s.mo41578a(ghVar);
    }

    /* renamed from: w */
    public final void mo41567w() {
        synchronized (this.f44332r) {
            if (this.f44333s != null) {
                this.f44333s.mo41585f();
            }
        }
    }

    /* renamed from: x */
    public final void mo41568x() {
        synchronized (this.f44332r) {
            if (this.f44333s != null) {
                this.f44333s.mo41586g();
            }
        }
    }

    /* renamed from: y */
    public final void mo41569y() {
        this.f44333s.mo41583d();
    }
}
