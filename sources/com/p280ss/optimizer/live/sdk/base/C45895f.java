package com.p280ss.optimizer.live.sdk.base;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.optimizer.live.sdk.base.f */
public final class C45895f {

    /* renamed from: a */
    private final ThreadPoolExecutor f117321a;

    /* renamed from: com.ss.optimizer.live.sdk.base.f$a */
    static class C45897a implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f117322a;

        /* renamed from: b */
        private final AtomicInteger f117323b;

        /* renamed from: c */
        private final String f117324c;

        private C45897a() {
            ThreadGroup threadGroup;
            this.f117323b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f117322a = threadGroup;
            this.f117324c = "live-sdk-";
        }

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f117322a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f117324c);
            sb.append(this.f117323b.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    C45895f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C45897a());
        this.f117321a = threadPoolExecutor;
    }

    /* renamed from: a */
    public final void mo111176a(Runnable runnable) {
        this.f117321a.execute(runnable);
    }
}
