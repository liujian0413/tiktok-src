package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15267r;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.measurement.internal.av */
final class C16822av implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f46988a;

    /* renamed from: b */
    private final /* synthetic */ C16820at f46989b;

    public C16822av(C16820at atVar, String str) {
        this.f46989b = atVar;
        C15267r.m44384a(str);
        this.f46988a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f46989b.mo43585q().f47487a.mo44161a(this.f46988a, th);
    }
}
