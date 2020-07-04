package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C14747a.C14749b;
import com.google.android.gms.ads.mediation.C14898h;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.ArrayList;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.pv */
public final class C15963pv extends C15949ph {

    /* renamed from: a */
    private final C14898h f44859a;

    public C15963pv(C14898h hVar) {
        this.f44859a = hVar;
    }

    /* renamed from: g */
    public final void mo41876g() {
    }

    /* renamed from: m */
    public final C15654ej mo41882m() {
        return null;
    }

    /* renamed from: o */
    public final C15345b mo41884o() {
        return null;
    }

    /* renamed from: a */
    public final String mo41866a() {
        return this.f44859a.f38546h;
    }

    /* renamed from: b */
    public final List mo41869b() {
        List<C14749b> list = this.f44859a.f38547i;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C14749b bVar : list) {
            C15620dd ddVar = new C15620dd(bVar.mo37499a(), bVar.mo37500b(), bVar.mo37501c(), bVar.mo37502d(), bVar.mo37503e());
            arrayList.add(ddVar);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo41871c() {
        return this.f44859a.f38548j;
    }

    /* renamed from: d */
    public final C15658en mo41873d() {
        C14749b bVar = this.f44859a.f38549k;
        if (bVar == null) {
            return null;
        }
        C15620dd ddVar = new C15620dd(bVar.mo37499a(), bVar.mo37500b(), bVar.mo37501c(), bVar.mo37502d(), bVar.mo37503e());
        return ddVar;
    }

    /* renamed from: e */
    public final String mo41874e() {
        return this.f44859a.f38550l;
    }

    /* renamed from: f */
    public final String mo41875f() {
        return this.f44859a.f38551m;
    }

    /* renamed from: a */
    public final void mo41867a(C15345b bVar) {
        C15349d.m44669a(bVar);
    }

    /* renamed from: b */
    public final void mo41870b(C15345b bVar) {
        this.f44859a.mo37326a((View) C15349d.m44669a(bVar));
    }

    /* renamed from: a */
    public final void mo41868a(C15345b bVar, C15345b bVar2, C15345b bVar3) {
        C15349d.m44669a(bVar2);
        C15349d.m44669a(bVar3);
        C15349d.m44669a(bVar);
    }

    /* renamed from: c */
    public final void mo41872c(C15345b bVar) {
        C15349d.m44669a(bVar);
    }

    /* renamed from: h */
    public final boolean mo41877h() {
        return this.f44859a.f38531a;
    }

    /* renamed from: i */
    public final boolean mo41878i() {
        return this.f44859a.f38532b;
    }

    /* renamed from: j */
    public final Bundle mo41879j() {
        return this.f44859a.f38533c;
    }

    /* renamed from: k */
    public final C15345b mo41880k() {
        View view = this.f44859a.f38534d;
        if (view == null) {
            return null;
        }
        return C15349d.m44668a(view);
    }

    /* renamed from: l */
    public final C15488ak mo41881l() {
        if (this.f44859a.f38536f != null) {
            return this.f44859a.f38536f.mo37868a();
        }
        return null;
    }

    /* renamed from: n */
    public final C15345b mo41883n() {
        View view = this.f44859a.f38535e;
        if (view == null) {
            return null;
        }
        return C15349d.m44668a(view);
    }
}
