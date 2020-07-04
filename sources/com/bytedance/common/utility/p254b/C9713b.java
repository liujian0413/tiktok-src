package com.bytedance.common.utility.p254b;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.utility.b.b */
public final class C9713b implements ThreadFactory {

    /* renamed from: a */
    private String f26435a;

    /* renamed from: b */
    private AtomicInteger f26436b;

    /* renamed from: c */
    private boolean f26437c;

    public C9713b(String str) {
        this(str, false);
    }

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f26436b.incrementAndGet();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26435a);
        sb.append("-");
        sb.append(incrementAndGet);
        Thread thread = new Thread(runnable, sb.toString());
        if (!this.f26437c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public C9713b(String str, boolean z) {
        this.f26436b = new AtomicInteger();
        this.f26435a = str;
        this.f26437c = z;
    }
}
