package com.google.android.gms.common.util.p751a;

import com.google.android.gms.common.internal.C15267r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.a.b */
public final class C15316b implements ThreadFactory {

    /* renamed from: a */
    private final String f39584a;

    /* renamed from: b */
    private final int f39585b;

    /* renamed from: c */
    private final ThreadFactory f39586c;

    public C15316b(String str) {
        this(str, 0);
    }

    private C15316b(String str, int i) {
        this.f39586c = Executors.defaultThreadFactory();
        this.f39584a = (String) C15267r.m44385a(str, (Object) "Name must not be null");
        this.f39585b = 0;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f39586c.newThread(new C15318d(runnable, 0));
        newThread.setName(this.f39584a);
        return newThread;
    }
}
