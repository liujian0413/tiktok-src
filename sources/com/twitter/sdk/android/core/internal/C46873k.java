package com.twitter.sdk.android.core.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.twitter.sdk.android.core.internal.k */
final /* synthetic */ class C46873k implements Runnable {

    /* renamed from: a */
    private final ExecutorService f120184a;

    /* renamed from: b */
    private final long f120185b;

    /* renamed from: c */
    private final TimeUnit f120186c;

    /* renamed from: d */
    private final String f120187d;

    C46873k(ExecutorService executorService, long j, TimeUnit timeUnit, String str) {
        this.f120184a = executorService;
        this.f120185b = j;
        this.f120186c = timeUnit;
        this.f120187d = str;
    }

    public final void run() {
        C46871i.m146616a(this.f120184a, this.f120185b, this.f120186c, this.f120187d);
    }
}
