package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final /* synthetic */ class agl implements Runnable {

    /* renamed from: a */
    private final Executor f40186a;

    /* renamed from: b */
    private final Runnable f40187b;

    agl(Executor executor, Runnable runnable) {
        this.f40186a = executor;
        this.f40187b = runnable;
    }

    public final void run() {
        this.f40186a.execute(this.f40187b);
    }
}
