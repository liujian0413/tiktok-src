package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a */
public final class C16800a extends C16873cs {

    /* renamed from: a */
    private final Map<String, Long> f46897a = new ArrayMap();

    /* renamed from: b */
    private final Map<String, Integer> f46898b = new ArrayMap();

    /* renamed from: c */
    private long f46899c;

    public C16800a(C16825ay ayVar) {
        super(ayVar);
    }

    /* renamed from: a */
    public final void mo43568a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo43585q().f47487a.mo44160a("Ad unit id must be a non-empty string");
        } else {
            mo43584p().mo43645a((Runnable) new C16801aa(this, str, j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m55369c(String str, long j) {
        mo43571c();
        C15267r.m44386a(str);
        if (this.f46898b.isEmpty()) {
            this.f46899c = j;
        }
        Integer num = (Integer) this.f46898b.get(str);
        if (num != null) {
            this.f46898b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f46898b.size() >= 100) {
            mo43585q().f47490d.mo44160a("Too many ads visible");
        } else {
            this.f46898b.put(str, Integer.valueOf(1));
            this.f46897a.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void mo43570b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo43585q().f47487a.mo44160a("Ad unit id must be a non-empty string");
        } else {
            mo43584p().mo43645a((Runnable) new C16830bc(this, str, j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m55370d(String str, long j) {
        mo43571c();
        C15267r.m44386a(str);
        Integer num = (Integer) this.f46898b.get(str);
        if (num != null) {
            C16870cp v = mo43576h().mo43769v();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f46898b.remove(str);
                Long l = (Long) this.f46897a.get(str);
                if (l == null) {
                    mo43585q().f47487a.mo44160a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    this.f46897a.remove(str);
                    m55366a(str, longValue, v);
                }
                if (this.f46898b.isEmpty()) {
                    if (this.f46899c == 0) {
                        mo43585q().f47487a.mo44160a("First ad exposure time was never set");
                        return;
                    } else {
                        m55363a(j - this.f46899c, v);
                        this.f46899c = 0;
                    }
                }
                return;
            }
            this.f46898b.put(str, Integer.valueOf(intValue));
            return;
        }
        mo43585q().f47487a.mo44161a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: a */
    private final void m55363a(long j, C16870cp cpVar) {
        if (cpVar == null) {
            mo43585q().f47495i.mo44160a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo43585q().f47495i.mo44161a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C16871cq.m55658a(cpVar, bundle, true);
            mo43573e().mo43731a("am", "_xa", bundle);
        }
    }

    /* renamed from: a */
    private final void m55366a(String str, long j, C16870cp cpVar) {
        if (cpVar == null) {
            mo43585q().f47495i.mo44160a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo43585q().f47495i.mo44161a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C16871cq.m55658a(cpVar, bundle, true);
            mo43573e().mo43731a("am", "_xu", bundle);
        }
    }

    /* renamed from: a */
    public final void mo43567a(long j) {
        C16870cp v = mo43576h().mo43769v();
        for (String str : this.f46897a.keySet()) {
            m55366a(str, j - ((Long) this.f46897a.get(str)).longValue(), v);
        }
        if (!this.f46897a.isEmpty()) {
            m55363a(j - this.f46899c, v);
        }
        m55367b(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m55367b(long j) {
        for (String put : this.f46897a.keySet()) {
            this.f46897a.put(put, Long.valueOf(j));
        }
        if (!this.f46897a.isEmpty()) {
            this.f46899c = j;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C16800a mo43572d() {
        return super.mo43572d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C16858cd mo43573e() {
        return super.mo43573e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C16947l mo43574f() {
        return super.mo43574f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C16875cu mo43575g() {
        return super.mo43575g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C16871cq mo43576h() {
        return super.mo43576h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C16949n mo43577i() {
        return super.mo43577i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C16900ds mo43578j() {
        return super.mo43578j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
