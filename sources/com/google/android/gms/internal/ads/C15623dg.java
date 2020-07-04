package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.dg */
public final class C15623dg extends C15679fh implements C15637dt {

    /* renamed from: a */
    private String f44290a;

    /* renamed from: b */
    private List<C15620dd> f44291b;

    /* renamed from: c */
    private String f44292c;

    /* renamed from: d */
    private C15658en f44293d;

    /* renamed from: e */
    private String f44294e;

    /* renamed from: f */
    private String f44295f;

    /* renamed from: g */
    private C15612cw f44296g;

    /* renamed from: h */
    private Bundle f44297h;

    /* renamed from: i */
    private C15488ak f44298i;

    /* renamed from: j */
    private View f44299j;

    /* renamed from: k */
    private C15345b f44300k;

    /* renamed from: l */
    private String f44301l;

    /* renamed from: m */
    private final Object f44302m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C15632dp f44303n;

    public C15623dg(String str, List<C15620dd> list, String str2, C15658en enVar, String str3, String str4, C15612cw cwVar, Bundle bundle, C15488ak akVar, View view, C15345b bVar, String str5) {
        this.f44290a = str;
        this.f44291b = list;
        this.f44292c = str2;
        this.f44293d = enVar;
        this.f44294e = str3;
        this.f44295f = str4;
        this.f44296g = cwVar;
        this.f44297h = bundle;
        this.f44298i = akVar;
        this.f44299j = view;
        this.f44300k = bVar;
        this.f44301l = str5;
    }

    /* renamed from: b */
    public final String mo41481b() {
        return "1";
    }

    /* renamed from: c */
    public final String mo41482c() {
        return "";
    }

    /* renamed from: a */
    public final String mo41515a() {
        return this.f44290a;
    }

    /* renamed from: g */
    public final C15345b mo41519g() {
        return this.f44300k;
    }

    /* renamed from: h */
    public final String mo41520h() {
        return this.f44301l;
    }

    /* renamed from: f */
    public final List mo41500f() {
        return this.f44291b;
    }

    /* renamed from: i */
    public final String mo41521i() {
        return this.f44292c;
    }

    /* renamed from: j */
    public final C15658en mo41522j() {
        return this.f44293d;
    }

    /* renamed from: k */
    public final String mo41523k() {
        return this.f44294e;
    }

    /* renamed from: l */
    public final String mo41524l() {
        return this.f44295f;
    }

    /* renamed from: m */
    public final C15488ak mo41525m() {
        return this.f44298i;
    }

    /* renamed from: n */
    public final C15345b mo41526n() {
        return C15349d.m44668a(this.f44303n);
    }

    /* renamed from: a */
    public final void mo41480a(C15632dp dpVar) {
        synchronized (this.f44302m) {
            this.f44303n = dpVar;
        }
    }

    /* renamed from: d */
    public final C15612cw mo41483d() {
        return this.f44296g;
    }

    /* renamed from: o */
    public final Bundle mo41527o() {
        return this.f44297h;
    }

    /* renamed from: e */
    public final View mo41484e() {
        return this.f44299j;
    }

    /* renamed from: p */
    public final C15654ej mo41528p() {
        return this.f44296g;
    }

    /* renamed from: q */
    public final void mo41529q() {
        acl.f40003a.post(new C15624dh(this));
        this.f44290a = null;
        this.f44291b = null;
        this.f44292c = null;
        this.f44293d = null;
        this.f44294e = null;
        this.f44295f = null;
        this.f44296g = null;
        this.f44297h = null;
        this.f44298i = null;
        this.f44299j = null;
    }

    /* renamed from: a */
    public final void mo41516a(Bundle bundle) {
        synchronized (this.f44302m) {
            if (this.f44303n == null) {
                acd.m45779c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f44303n.mo41597b(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo41517b(Bundle bundle) {
        synchronized (this.f44302m) {
            if (this.f44303n == null) {
                acd.m45779c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f44303n.mo41596a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final void mo41518c(Bundle bundle) {
        synchronized (this.f44302m) {
            if (this.f44303n == null) {
                acd.m45779c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f44303n.mo41599c(bundle);
            }
        }
    }
}
