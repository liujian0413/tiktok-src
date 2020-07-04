package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.p022v4.util.C0888a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.common.api.internal.t */
public class C15153t extends C15114cg {

    /* renamed from: b */
    public final C0888a<C15110cd<?>> f39204b = new C0888a<>();

    /* renamed from: f */
    private C15133d f39205f;

    /* renamed from: a */
    public static void m44067a(Activity activity, C15133d dVar, C15110cd<?> cdVar) {
        C15139g a = m43644a(activity);
        C15153t tVar = (C15153t) a.mo38383a("ConnectionlessLifecycleHelper", C15153t.class);
        if (tVar == null) {
            tVar = new C15153t(a);
        }
        tVar.f39205f = dVar;
        C15267r.m44385a(cdVar, (Object) "ApiKey cannot be null");
        tVar.f39204b.add(cdVar);
        dVar.mo38400a(tVar);
    }

    private C15153t(C15139g gVar) {
        super(gVar);
        this.f38934a.mo38384a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
    }

    /* renamed from: b */
    public final void mo38280b() {
        super.mo38280b();
        m44068g();
    }

    /* renamed from: c */
    public final void mo38282c() {
        super.mo38282c();
        m44068g();
    }

    /* renamed from: d */
    public final void mo38283d() {
        super.mo38283d();
        this.f39205f.mo38403b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38371a(ConnectionResult connectionResult, int i) {
        this.f39205f.mo38402b(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo38372e() {
        this.f39205f.mo38405d();
    }

    /* renamed from: g */
    private final void m44068g() {
        if (!this.f39204b.isEmpty()) {
            this.f39205f.mo38400a(this);
        }
    }
}
