package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C14747a.C14749b;
import com.google.android.gms.ads.mediation.C14897g;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.ArrayList;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.pu */
public final class C15962pu extends C15946pe {

    /* renamed from: a */
    private final C14897g f44858a;

    public C15962pu(C14897g gVar) {
        this.f44858a = gVar;
    }

    /* renamed from: i */
    public final void mo41857i() {
    }

    /* renamed from: o */
    public final C15654ej mo41863o() {
        return null;
    }

    /* renamed from: q */
    public final C15345b mo41865q() {
        return null;
    }

    /* renamed from: a */
    public final String mo41845a() {
        return this.f44858a.f38538h;
    }

    /* renamed from: b */
    public final List mo41848b() {
        List<C14749b> list = this.f44858a.f38539i;
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
    public final String mo41850c() {
        return this.f44858a.f38540j;
    }

    /* renamed from: d */
    public final C15658en mo41852d() {
        C14749b bVar = this.f44858a.f38541k;
        if (bVar == null) {
            return null;
        }
        C15620dd ddVar = new C15620dd(bVar.mo37499a(), bVar.mo37500b(), bVar.mo37501c(), bVar.mo37502d(), bVar.mo37503e());
        return ddVar;
    }

    /* renamed from: e */
    public final String mo41853e() {
        return this.f44858a.f38542l;
    }

    /* renamed from: f */
    public final double mo41854f() {
        return this.f44858a.f38543m;
    }

    /* renamed from: g */
    public final String mo41855g() {
        return this.f44858a.f38544n;
    }

    /* renamed from: h */
    public final String mo41856h() {
        return this.f44858a.f38545o;
    }

    /* renamed from: a */
    public final void mo41846a(C15345b bVar) {
        C15349d.m44669a(bVar);
    }

    /* renamed from: b */
    public final void mo41849b(C15345b bVar) {
        this.f44858a.mo37326a((View) C15349d.m44669a(bVar));
    }

    /* renamed from: a */
    public final void mo41847a(C15345b bVar, C15345b bVar2, C15345b bVar3) {
        C15349d.m44669a(bVar2);
        C15349d.m44669a(bVar3);
        C15349d.m44669a(bVar);
    }

    /* renamed from: c */
    public final void mo41851c(C15345b bVar) {
        C15349d.m44669a(bVar);
    }

    /* renamed from: j */
    public final boolean mo41858j() {
        return this.f44858a.f38531a;
    }

    /* renamed from: k */
    public final boolean mo41859k() {
        return this.f44858a.f38532b;
    }

    /* renamed from: l */
    public final Bundle mo41860l() {
        return this.f44858a.f38533c;
    }

    /* renamed from: m */
    public final C15488ak mo41861m() {
        if (this.f44858a.f38536f != null) {
            return this.f44858a.f38536f.mo37868a();
        }
        return null;
    }

    /* renamed from: n */
    public final C15345b mo41862n() {
        View view = this.f44858a.f38534d;
        if (view == null) {
            return null;
        }
        return C15349d.m44668a(view);
    }

    /* renamed from: p */
    public final C15345b mo41864p() {
        View view = this.f44858a.f38535e;
        if (view == null) {
            return null;
        }
        return C15349d.m44668a(view);
    }
}
