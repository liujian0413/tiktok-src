package com.google.android.gms.internal.ads;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.internal.ads.ur */
final class C16094ur implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ UncaughtExceptionHandler f45132a;

    /* renamed from: b */
    private final /* synthetic */ C16092up f45133b;

    C16094ur(C16092up upVar, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f45133b = upVar;
        this.f45132a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f45133b.mo42015a(thread, th);
            if (this.f45132a != null) {
                this.f45132a.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.f45132a != null) {
                this.f45132a.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
