package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bv */
final class C16429bv implements C16404ax {

    /* renamed from: a */
    private final /* synthetic */ Runnable f45993a;

    /* renamed from: b */
    private final /* synthetic */ C16425br f45994b;

    C16429bv(C16425br brVar, Runnable runnable) {
        this.f45994b = brVar;
        this.f45993a = runnable;
    }

    /* renamed from: a */
    public final void mo42506a(Throwable th) {
        this.f45994b.f45984a.post(this.f45993a);
    }
}
