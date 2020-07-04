package com.facebook.common.p685b;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.b.a */
public final class C13275a extends AbstractExecutorService {

    /* renamed from: a */
    private static final C13275a f35166a = new C13275a();

    private C13275a() {
    }

    /* renamed from: a */
    public static C13275a m38815a() {
        return f35166a;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return true;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    public final List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
