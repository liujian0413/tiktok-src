package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C14747a.C14749b;
import com.google.android.gms.ads.mediation.C14901k;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.qd */
public final class C15972qd extends C15952pk {

    /* renamed from: a */
    private final C14901k f44881a;

    public C15972qd(C14901k kVar) {
        this.f44881a = kVar;
    }

    /* renamed from: k */
    public final C15654ej mo41898k() {
        return null;
    }

    /* renamed from: r */
    public final void mo41905r() {
    }

    /* renamed from: a */
    public final String mo41885a() {
        return this.f44881a.f38552a;
    }

    /* renamed from: b */
    public final List mo41888b() {
        List<C14749b> list = this.f44881a.f38553b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C14749b bVar : list) {
                C15620dd ddVar = new C15620dd(bVar.mo37499a(), bVar.mo37500b(), bVar.mo37501c(), bVar.mo37502d(), bVar.mo37503e());
                arrayList.add(ddVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo41890c() {
        return this.f44881a.f38554c;
    }

    /* renamed from: d */
    public final C15658en mo41891d() {
        C14749b bVar = this.f44881a.f38555d;
        if (bVar == null) {
            return null;
        }
        C15620dd ddVar = new C15620dd(bVar.mo37499a(), bVar.mo37500b(), bVar.mo37501c(), bVar.mo37502d(), bVar.mo37503e());
        return ddVar;
    }

    /* renamed from: e */
    public final String mo41892e() {
        return this.f44881a.f38556e;
    }

    /* renamed from: f */
    public final String mo41893f() {
        return this.f44881a.f38557f;
    }

    /* renamed from: g */
    public final double mo41894g() {
        if (this.f44881a.f38558g != null) {
            return this.f44881a.f38558g.doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: h */
    public final String mo41895h() {
        return this.f44881a.f38559h;
    }

    /* renamed from: i */
    public final String mo41896i() {
        return this.f44881a.f38560i;
    }

    /* renamed from: j */
    public final C15488ak mo41897j() {
        if (this.f44881a.f38561j != null) {
            return this.f44881a.f38561j.mo37868a();
        }
        return null;
    }

    /* renamed from: l */
    public final C15345b mo41899l() {
        View view = this.f44881a.f38563l;
        if (view == null) {
            return null;
        }
        return C15349d.m44668a(view);
    }

    /* renamed from: m */
    public final C15345b mo41900m() {
        View view = this.f44881a.f38564m;
        if (view == null) {
            return null;
        }
        return C15349d.m44668a(view);
    }

    /* renamed from: n */
    public final C15345b mo41901n() {
        Object obj = this.f44881a.f38565n;
        if (obj == null) {
            return null;
        }
        return C15349d.m44668a(obj);
    }

    /* renamed from: o */
    public final Bundle mo41902o() {
        return this.f44881a.f38566o;
    }

    /* renamed from: p */
    public final boolean mo41903p() {
        return this.f44881a.f38567p;
    }

    /* renamed from: q */
    public final boolean mo41904q() {
        return this.f44881a.f38568q;
    }

    /* renamed from: a */
    public final void mo41886a(C15345b bVar) {
        C15349d.m44669a(bVar);
    }

    /* renamed from: a */
    public final void mo41887a(C15345b bVar, C15345b bVar2, C15345b bVar3) {
        this.f44881a.mo37327a((View) C15349d.m44669a(bVar), (HashMap) C15349d.m44669a(bVar2), (HashMap) C15349d.m44669a(bVar3));
    }

    /* renamed from: b */
    public final void mo41889b(C15345b bVar) {
        C15349d.m44669a(bVar);
    }
}
