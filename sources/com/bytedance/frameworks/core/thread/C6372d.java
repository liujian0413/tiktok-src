package com.bytedance.frameworks.core.thread;

import android.text.TextUtils;
import com.bytedance.frameworks.core.thread.TTPriority.Priority;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.core.thread.d */
public final class C6372d implements ThreadFactory {

    /* renamed from: a */
    private static final AtomicInteger f18662a = new AtomicInteger(1);

    /* renamed from: b */
    private final ThreadGroup f18663b;

    /* renamed from: c */
    private final AtomicInteger f18664c = new AtomicInteger(1);

    /* renamed from: d */
    private final String f18665d;

    /* renamed from: e */
    private final Priority f18666e;

    public final Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f18663b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18665d);
        sb.append(this.f18664c.getAndIncrement());
        Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (this.f18666e != null && this.f18666e.getValue() == Priority.LOW.getValue()) {
            thread.setPriority(1);
        } else if (thread.getPriority() != 5) {
            thread.setPriority(3);
        } else {
            thread.setPriority(5);
        }
        return thread;
    }

    C6372d(Priority priority, String str) {
        ThreadGroup threadGroup;
        this.f18666e = priority;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.f18663b = threadGroup;
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("ttdefault-");
            sb.append(f18662a.getAndIncrement());
            sb.append("-thread-");
            this.f18665d = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(f18662a.getAndIncrement());
        sb2.append("-thread-");
        this.f18665d = sb2.toString();
    }
}
