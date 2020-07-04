package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14832n;

/* renamed from: com.google.android.gms.internal.ads.kx */
final class C15830kx {

    /* renamed from: a */
    C14832n f44566a;

    /* renamed from: b */
    zzyv f44567b;

    /* renamed from: c */
    C15796jq f44568c;

    /* renamed from: d */
    long f44569d;

    /* renamed from: e */
    boolean f44570e;

    /* renamed from: f */
    boolean f44571f;

    /* renamed from: g */
    private final /* synthetic */ C15829kw f44572g;

    C15830kx(C15829kw kwVar, C15795jp jpVar) {
        this.f44572g = kwVar;
        this.f44566a = jpVar.mo41678b(kwVar.f44562b);
        this.f44568c = new C15796jq();
        C15796jq jqVar = this.f44568c;
        C14832n nVar = this.f44566a;
        nVar.mo37589a((bys) new C15797jr(jqVar));
        nVar.mo37593a((C15914o) new C15805jz(jqVar));
        nVar.mo37591a((C15606cq) new C15808kb(jqVar));
        nVar.mo37588a((byp) new C15810kd(jqVar));
        nVar.mo37598a((C16194yk) new C15812kf(jqVar));
    }

    C15830kx(C15829kw kwVar, C15795jp jpVar, zzyv zzyv) {
        this(kwVar, jpVar);
        this.f44567b = zzyv;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo41710a() {
        if (this.f44570e) {
            return false;
        }
        this.f44571f = this.f44566a.mo37614b(C15827ku.m51188b(this.f44567b != null ? this.f44567b : this.f44572g.f44561a));
        this.f44570e = true;
        this.f44569d = C14793ay.m42901g().mo38684a();
        return true;
    }
}
