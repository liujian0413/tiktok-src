package com.google.android.gms.internal.ads;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.internal.ads.uq */
final class C16093uq implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ UncaughtExceptionHandler f45130a;

    /* renamed from: b */
    private final /* synthetic */ C16092up f45131b;

    C16093uq(C16092up upVar, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f45131b = upVar;
        this.f45130a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f45131b.mo42015a(thread, th);
            if (this.f45130a != null) {
                this.f45130a.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.f45130a != null) {
                this.f45130a.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
