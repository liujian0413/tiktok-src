package com.p280ss.android.ugc.effectmanager.common;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.effectmanager.common.f */
public final class C43737f implements ThreadFactory {

    /* renamed from: a */
    private String f113233a;

    /* renamed from: b */
    private AtomicInteger f113234b = new AtomicInteger();

    /* renamed from: c */
    private boolean f113235c;

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f113234b.incrementAndGet();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113233a);
        sb.append("-");
        sb.append(incrementAndGet);
        Thread thread = new Thread(runnable, sb.toString());
        if (!this.f113235c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public C43737f(String str, boolean z) {
        this.f113233a = str;
        this.f113235c = true;
    }
}
