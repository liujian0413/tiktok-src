package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.eh */
final class C16917eh implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzk f47312a;

    /* renamed from: b */
    private final /* synthetic */ C16912ed f47313b;

    C16917eh(C16912ed edVar, zzk zzk) {
        this.f47313b = edVar;
        this.f47312a = zzk;
    }

    public final /* synthetic */ Object call() throws Exception {
        C16924eo eoVar;
        if (this.f47313b.mo43857b().mo44064j(this.f47312a.f47530a)) {
            eoVar = this.f47313b.m55866e(this.f47312a);
        } else {
            eoVar = this.f47313b.mo43864d().mo44099b(this.f47312a.f47530a);
        }
        if (eoVar != null) {
            return eoVar.mo43937c();
        }
        this.f47313b.mo43585q().f47490d.mo44160a("App info was null when attempting to get app instance id");
        return null;
    }
}
