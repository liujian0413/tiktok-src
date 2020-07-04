package com.bytedance.common.utility.p254b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.common.utility.b.e */
public final class C9718e extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final RejectedExecutionHandler f26460a = new AbortPolicy();

    public final void shutdown() {
    }

    public final List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    public C9718e(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, 30, timeUnit, blockingQueue, Executors.defaultThreadFactory(), rejectedExecutionHandler);
    }
}
