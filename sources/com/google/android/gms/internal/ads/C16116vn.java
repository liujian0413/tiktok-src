package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.vn */
public abstract class C16116vn implements adi<Void>, C16114vl {

    /* renamed from: a */
    private final agw<zzaxe> f45160a;

    /* renamed from: b */
    private final C16114vl f45161b;

    /* renamed from: c */
    private final Object f45162c = new Object();

    public C16116vn(agw<zzaxe> agw, C16114vl vlVar) {
        this.f45160a = agw;
        this.f45161b = vlVar;
    }

    /* renamed from: a */
    public abstract void mo42030a();

    /* renamed from: d */
    public abstract C16128vz mo42032d();

    /* renamed from: a */
    public final void mo42023a(zzaxi zzaxi) {
        synchronized (this.f45162c) {
            this.f45161b.mo42023a(zzaxi);
            mo42030a();
        }
    }

    /* renamed from: b */
    public final void mo39127b() {
        mo42030a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo42031a(C16128vz vzVar, zzaxe zzaxe) {
        try {
            vzVar.mo42042a(zzaxe, (C16132wc) new C16125vw(this));
            return true;
        } catch (Throwable th) {
            acd.m45780c("Could not fetch ad response from ad request service due to an Exception.", th);
            C14793ay.m42898d().mo39089a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f45161b.mo42023a(new zzaxi(0));
            return false;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39128c() {
        C16128vz d = mo42032d();
        if (d == null) {
            this.f45161b.mo42023a(new zzaxi(0));
            mo42030a();
            return null;
        }
        this.f45160a.mo39339a(new C16117vo(this, d), new C16119vq(this));
        return null;
    }
}
