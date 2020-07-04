package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.cq */
public final class C16871cq extends C16896do {

    /* renamed from: a */
    protected C16870cp f47162a;

    /* renamed from: b */
    private volatile C16870cp f47163b;

    /* renamed from: c */
    private C16870cp f47164c;

    /* renamed from: d */
    private final Map<Activity, C16870cp> f47165d = new ArrayMap();

    /* renamed from: e */
    private C16870cp f47166e;

    /* renamed from: f */
    private String f47167f;

    public C16871cq(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo43740t() {
        return false;
    }

    /* renamed from: v */
    public final C16870cp mo43769v() {
        mo43821B();
        mo43571c();
        return this.f47162a;
    }

    /* renamed from: a */
    public final void mo43764a(Activity activity, String str, String str2) {
        if (this.f47163b == null) {
            mo43585q().f47490d.mo44160a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f47165d.get(activity) == null) {
            mo43585q().f47490d.mo44160a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m55656a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f47163b.f47159b.equals(str2);
            boolean c = C16922em.m55972c(this.f47163b.f47158a, str);
            if (equals && c) {
                mo43585q().f47492f.mo44160a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo43585q().f47490d.mo44161a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo43585q().f47495i.mo44162a("Setting current screen to name, class", str == null ? TEVideoRecorder.FACE_BEAUTY_NULL : str, str2);
                C16870cp cpVar = new C16870cp(str, str2, mo43583o().mo43912f());
                this.f47165d.put(activity, cpVar);
                m55657a(activity, cpVar, true);
            } else {
                mo43585q().f47490d.mo44161a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: w */
    public final C16870cp mo43770w() {
        return this.f47163b;
    }

    /* renamed from: a */
    private final void m55657a(Activity activity, C16870cp cpVar, boolean z) {
        C16870cp cpVar2 = this.f47163b == null ? this.f47164c : this.f47163b;
        if (cpVar.f47159b == null) {
            cpVar = new C16870cp(cpVar.f47158a, m55656a(activity.getClass().getCanonicalName()), cpVar.f47160c);
        }
        this.f47164c = this.f47163b;
        this.f47163b = cpVar;
        mo43584p().mo43645a((Runnable) new C16872cr(this, z, cpVar2, cpVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m55659a(C16870cp cpVar, boolean z) {
        mo43572d().mo43567a(mo43580l().mo38685b());
        if (mo43578j().mo43829a(cpVar.f47161d, z)) {
            cpVar.f47161d = false;
        }
    }

    /* renamed from: a */
    public static void m55658a(C16870cp cpVar, Bundle bundle, boolean z) {
        if (bundle == null || cpVar == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && cpVar == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
            }
            return;
        }
        if (cpVar.f47158a != null) {
            bundle.putString("_sn", cpVar.f47158a);
        } else {
            bundle.remove("_sn");
        }
        bundle.putString("_sc", cpVar.f47159b);
        bundle.putLong("_si", cpVar.f47160c);
    }

    /* renamed from: a */
    public final void mo43765a(String str, C16870cp cpVar) {
        mo43571c();
        synchronized (this) {
            if (this.f47167f == null || this.f47167f.equals(str) || cpVar != null) {
                this.f47167f = str;
                this.f47166e = cpVar;
            }
        }
    }

    /* renamed from: a */
    private static String m55656a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: d */
    private final C16870cp m55661d(Activity activity) {
        C15267r.m44384a(activity);
        C16870cp cpVar = (C16870cp) this.f47165d.get(activity);
        if (cpVar != null) {
            return cpVar;
        }
        C16870cp cpVar2 = new C16870cp(null, m55656a(activity.getClass().getCanonicalName()), mo43583o().mo43912f());
        this.f47165d.put(activity, cpVar2);
        return cpVar2;
    }

    /* renamed from: a */
    public final void mo43763a(Activity activity, Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle2 != null) {
                this.f47165d.put(activity, new C16870cp(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
            }
        }
    }

    /* renamed from: a */
    public final void mo43762a(Activity activity) {
        m55657a(activity, m55661d(activity), false);
        C16800a d = mo43572d();
        d.mo43584p().mo43645a((Runnable) new C16857cc(d, d.mo43580l().mo38685b()));
    }

    /* renamed from: b */
    public final void mo43766b(Activity activity) {
        C16870cp d = m55661d(activity);
        this.f47164c = this.f47163b;
        this.f47163b = null;
        mo43584p().mo43645a((Runnable) new C16874ct(this, d));
    }

    /* renamed from: b */
    public final void mo43767b(Activity activity, Bundle bundle) {
        if (bundle != null) {
            C16870cp cpVar = (C16870cp) this.f47165d.get(activity);
            if (cpVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", cpVar.f47160c);
                bundle2.putString("name", cpVar.f47158a);
                bundle2.putString("referrer_name", cpVar.f47159b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    /* renamed from: c */
    public final void mo43768c(Activity activity) {
        this.f47165d.remove(activity);
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
