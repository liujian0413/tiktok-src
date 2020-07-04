package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.internal.measurement.C16439ce;

/* renamed from: com.google.android.gms.measurement.internal.ds */
public final class C16900ds extends C16896do {

    /* renamed from: a */
    private Handler f47253a;

    /* renamed from: b */
    private long f47254b = mo43580l().mo38685b();

    /* renamed from: c */
    private long f47255c = this.f47254b;

    /* renamed from: d */
    private final C16939fc f47256d = new C16901dt(this, this.f47095q);

    /* renamed from: e */
    private final C16939fc f47257e = new C16902du(this, this.f47095q);

    /* renamed from: f */
    private final C16939fc f47258f = new C16903dv(this, this.f47095q);

    C16900ds(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo43740t() {
        return false;
    }

    /* renamed from: x */
    private final void m55786x() {
        synchronized (this) {
            if (this.f47253a == null) {
                this.f47253a = new C16439ce(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m55782b(long j) {
        mo43571c();
        m55786x();
        mo43585q().f47495i.mo44161a("Activity resumed, time", Long.valueOf(j));
        this.f47254b = j;
        this.f47255c = this.f47254b;
        if (mo43587s().mo44072r(mo43574f().mo44135v())) {
            mo43827a(mo43580l().mo38684a());
            return;
        }
        this.f47256d.mo44128c();
        this.f47257e.mo44128c();
        if (mo43587s().mo44070p(mo43574f().mo44135v()) || mo43587s().mo44071q(mo43574f().mo44135v())) {
            this.f47258f.mo44128c();
        }
        if (mo43586r().mo43596a(mo43580l().mo38684a())) {
            mo43586r().f46927m.mo43612a(true);
            mo43586r().f46929o.mo43615a(0);
        }
        if (mo43586r().f46927m.mo43613a()) {
            this.f47256d.mo44126a(Math.max(0, mo43586r().f46925k.mo43614a() - mo43586r().f46929o.mo43614a()));
        } else {
            this.f47257e.mo44126a(Math.max(0, 3600000 - mo43586r().f46929o.mo43614a()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43827a(long j) {
        mo43571c();
        m55786x();
        mo43828a(j, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43828a(long j, boolean z) {
        mo43571c();
        m55786x();
        this.f47256d.mo44128c();
        this.f47257e.mo44128c();
        if (mo43587s().mo44070p(mo43574f().mo44135v()) || mo43587s().mo44071q(mo43574f().mo44135v())) {
            this.f47258f.mo44128c();
        }
        if (mo43586r().mo43596a(j)) {
            mo43586r().f46927m.mo43612a(true);
            mo43586r().f46929o.mo43615a(0);
        }
        if (mo43586r().f46927m.mo43613a()) {
            m55785d(j);
            return;
        }
        this.f47257e.mo44126a(Math.max(0, 3600000 - mo43586r().f46929o.mo43614a()));
        if (z && mo43587s().mo44073s(mo43574f().mo44135v())) {
            mo43586r().f46928n.mo43615a(j);
            if (mo43587s().mo44070p(mo43574f().mo44135v()) || mo43587s().mo44071q(mo43574f().mo44135v())) {
                this.f47258f.mo44128c();
                this.f47258f.mo44126a(mo43586r().f46926l.mo43614a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m55784c(long j) {
        mo43571c();
        m55786x();
        this.f47256d.mo44128c();
        this.f47257e.mo44128c();
        if (mo43587s().mo44070p(mo43574f().mo44135v()) || mo43587s().mo44071q(mo43574f().mo44135v())) {
            this.f47258f.mo44128c();
            this.f47258f.mo44126a(mo43586r().f46926l.mo43614a());
        }
        mo43585q().f47495i.mo44161a("Activity paused, time", Long.valueOf(j));
        if (this.f47254b != 0) {
            mo43586r().f46929o.mo43615a(mo43586r().f46929o.mo43614a() + (j - this.f47254b));
        }
    }

    /* renamed from: d */
    private final void m55785d(long j) {
        mo43571c();
        mo43585q().f47495i.mo44161a("Session started, time", Long.valueOf(mo43580l().mo38685b()));
        Long l = null;
        Long valueOf = mo43587s().mo44070p(mo43574f().mo44135v()) ? Long.valueOf(j / 1000) : null;
        if (mo43587s().mo44071q(mo43574f().mo44135v())) {
            l = Long.valueOf(-1);
        }
        long j2 = j;
        mo43573e().mo43733a("auto", "_sid", (Object) valueOf, j2);
        mo43573e().mo43733a("auto", "_sno", (Object) l, j2);
        mo43586r().f46927m.mo43612a(false);
        Bundle bundle = new Bundle();
        if (mo43587s().mo44070p(mo43574f().mo44135v())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        mo43573e().mo43730a("auto", "_s", j, bundle);
        mo43586r().f46928n.mo43615a(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo43830v() {
        mo43571c();
        m55785d(mo43580l().mo38684a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final long mo43831w() {
        long b = mo43580l().mo38685b();
        long j = b - this.f47255c;
        this.f47255c = b;
        return j;
    }

    /* renamed from: a */
    public final boolean mo43829a(boolean z, boolean z2) {
        mo43571c();
        mo43821B();
        long b = mo43580l().mo38685b();
        mo43586r().f46928n.mo43615a(mo43580l().mo38684a());
        long j = b - this.f47254b;
        if (z || j >= 1000) {
            mo43586r().f46929o.mo43615a(j);
            mo43585q().f47495i.mo44161a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            C16871cq.m55658a(mo43576h().mo43769v(), bundle, true);
            if (mo43587s().mo44074t(mo43574f().mo44135v())) {
                if (mo43587s().mo44054d(mo43574f().mo44135v(), C16942h.f47422ao)) {
                    if (!z2) {
                        mo43831w();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    mo43831w();
                }
            }
            if (!mo43587s().mo44054d(mo43574f().mo44135v(), C16942h.f47422ao) || !z2) {
                mo43573e().mo43731a("auto", "_e", bundle);
            }
            this.f47254b = b;
            this.f47257e.mo44128c();
            this.f47257e.mo44126a(Math.max(0, 3600000 - mo43586r().f46929o.mo43614a()));
            return true;
        }
        mo43585q().f47495i.mo44161a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m55787y() {
        mo43571c();
        mo43829a(false, false);
        mo43572d().mo43567a(mo43580l().mo38685b());
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
