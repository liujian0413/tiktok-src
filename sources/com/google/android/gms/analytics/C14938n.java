package com.google.android.gms.analytics;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.analytics.n */
final class C14938n extends FutureTask<T> {

    /* renamed from: a */
    private final /* synthetic */ C14934a f38627a;

    C14938n(C14934a aVar, Runnable runnable, Object obj) {
        this.f38627a = aVar;
        super(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        UncaughtExceptionHandler b = C14933l.this.f38618b;
        if (b != null) {
            b.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
