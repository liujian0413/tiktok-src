package com.google.android.gms.internal.measurement;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.internal.measurement.u */
final class C16698u implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ C16697t f46654a;

    C16698u(C16697t tVar) {
        this.f46654a = tVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C16416bi biVar = this.f46654a.f46643e;
        if (biVar != null) {
            biVar.mo43201e("Job execution failed", th);
        }
    }
}
