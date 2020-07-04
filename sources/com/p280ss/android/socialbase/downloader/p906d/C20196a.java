package com.p280ss.android.socialbase.downloader.p906d;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.socialbase.downloader.d.a */
public final class C20196a implements ThreadFactory {

    /* renamed from: a */
    private final String f54639a;

    /* renamed from: b */
    private final AtomicInteger f54640b;

    /* renamed from: c */
    private final boolean f54641c;

    public C20196a(String str) {
        this(str, false);
    }

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f54640b.incrementAndGet();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f54639a);
        sb.append("-");
        sb.append(incrementAndGet);
        Thread thread = new Thread(runnable, sb.toString());
        if (!this.f54641c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public C20196a(String str, boolean z) {
        this.f54640b = new AtomicInteger();
        this.f54639a = str;
        this.f54641c = z;
    }
}
