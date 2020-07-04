package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class aba implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f39837a = new AtomicInteger(1);

    aba(aal aal) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f39837a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
