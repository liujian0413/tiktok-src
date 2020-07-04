package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.de */
public final class C15621de extends C15675fd implements C15637dt {

    /* renamed from: a */
    private String f44273a;

    /* renamed from: b */
    private List<C15620dd> f44274b;

    /* renamed from: c */
    private String f44275c;

    /* renamed from: d */
    private C15658en f44276d;

    /* renamed from: e */
    private String f44277e;

    /* renamed from: f */
    private double f44278f;

    /* renamed from: g */
    private String f44279g;

    /* renamed from: h */
    private String f44280h;

    /* renamed from: i */
    private C15612cw f44281i;

    /* renamed from: j */
    private Bundle f44282j;

    /* renamed from: k */
    private C15488ak f44283k;

    /* renamed from: l */
    private View f44284l;

    /* renamed from: m */
    private C15345b f44285m;

    /* renamed from: n */
    private String f44286n;

    /* renamed from: o */
    private final Object f44287o = new Object();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C15632dp f44288p;

    public C15621de(String str, List<C15620dd> list, String str2, C15658en enVar, String str3, double d, String str4, String str5, C15612cw cwVar, Bundle bundle, C15488ak akVar, View view, C15345b bVar, String str6) {
        this.f44273a = str;
        this.f44274b = list;
        this.f44275c = str2;
        this.f44276d = enVar;
        this.f44277e = str3;
        this.f44278f = d;
        this.f44279g = str4;
        this.f44280h = str5;
        this.f44281i = cwVar;
        this.f44282j = bundle;
        this.f44283k = akVar;
        this.f44284l = view;
        this.f44285m = bVar;
        this.f44286n = str6;
    }

    /* renamed from: b */
    public final String mo41481b() {
        return "2";
    }

    /* renamed from: c */
    public final String mo41482c() {
        return "";
    }

    /* renamed from: a */
    public final String mo41496a() {
        return this.f44273a;
    }

    /* renamed from: f */
    public final List mo41500f() {
        return this.f44274b;
    }

    /* renamed from: g */
    public final String mo41501g() {
        return this.f44275c;
    }

    /* renamed from: h */
    public final C15658en mo41502h() {
        return this.f44276d;
    }

    /* renamed from: i */
    public final String mo41503i() {
        return this.f44277e;
    }

    /* renamed from: j */
    public final double mo41504j() {
        return this.f44278f;
    }

    /* renamed from: k */
    public final String mo41505k() {
        return this.f44279g;
    }

    /* renamed from: l */
    public final String mo41506l() {
        return this.f44280h;
    }

    /* renamed from: m */
    public final C15488ak mo41507m() {
        return this.f44283k;
    }

    /* renamed from: n */
    public final C15345b mo41508n() {
        return C15349d.m44668a(this.f44288p);
    }

    /* renamed from: a */
    public final void mo41480a(C15632dp dpVar) {
        synchronized (this.f44287o) {
            this.f44288p = dpVar;
        }
    }

    /* renamed from: d */
    public final C15612cw mo41483d() {
        return this.f44281i;
    }

    /* renamed from: o */
    public final Bundle mo41509o() {
        return this.f44282j;
    }

    /* renamed from: e */
    public final View mo41484e() {
        return this.f44284l;
    }

    /* renamed from: p */
    public final C15345b mo41510p() {
        return this.f44285m;
    }

    /* renamed from: q */
    public final String mo41511q() {
        return this.f44286n;
    }

    /* renamed from: r */
    public final C15654ej mo41512r() {
        return this.f44281i;
    }

    /* renamed from: s */
    public final void mo41513s() {
        acl.f40003a.post(new C15622df(this));
        this.f44273a = null;
        this.f44274b = null;
        this.f44275c = null;
        this.f44276d = null;
        this.f44277e = null;
        this.f44278f = 0.0d;
        this.f44279g = null;
        this.f44280h = null;
        this.f44281i = null;
        this.f44282j = null;
        this.f44283k = null;
        this.f44284l = null;
    }

    /* renamed from: a */
    public final void mo41497a(Bundle bundle) {
        synchronized (this.f44287o) {
            if (this.f44288p == null) {
                acd.m45779c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f44288p.mo41597b(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo41498b(Bundle bundle) {
        synchronized (this.f44287o) {
            if (this.f44288p == null) {
                acd.m45779c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f44288p.mo41596a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final void mo41499c(Bundle bundle) {
        synchronized (this.f44287o) {
            if (this.f44288p == null) {
                acd.m45779c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f44288p.mo41599c(bundle);
            }
        }
    }
}
