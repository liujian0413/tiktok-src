package com.twitter.sdk.android.core.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.twitter.sdk.android.core.internal.j */
final /* synthetic */ class C46872j implements ThreadFactory {

    /* renamed from: a */
    private final String f120182a;

    /* renamed from: b */
    private final AtomicLong f120183b;

    C46872j(String str, AtomicLong atomicLong) {
        this.f120182a = str;
        this.f120183b = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        return C46871i.m146612a(this.f120182a, this.f120183b, runnable);
    }
}
