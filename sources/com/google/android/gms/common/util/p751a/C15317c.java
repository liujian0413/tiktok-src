package com.google.android.gms.common.util.p751a;

import com.google.android.gms.common.internal.C15267r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.a.c */
public final class C15317c implements ThreadFactory {

    /* renamed from: a */
    private final String f39587a;

    /* renamed from: b */
    private final int f39588b;

    /* renamed from: c */
    private final AtomicInteger f39589c;

    /* renamed from: d */
    private final ThreadFactory f39590d;

    public C15317c(String str) {
        this(str, 0);
    }

    private C15317c(String str, int i) {
        this.f39589c = new AtomicInteger();
        this.f39590d = Executors.defaultThreadFactory();
        this.f39587a = (String) C15267r.m44385a(str, (Object) "Name must not be null");
        this.f39588b = 0;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f39590d.newThread(new C15318d(runnable, 0));
        String str = this.f39587a;
        int andIncrement = this.f39589c.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
