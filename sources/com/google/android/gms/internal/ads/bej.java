package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class bej implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f41779a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f41780b = new AtomicInteger(1);

    bej() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f41779a.newThread(runnable);
        int andIncrement = this.f41780b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
