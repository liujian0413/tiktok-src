package com.google.android.gms.common.p748c;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.common.c.a */
public final class C15168a {

    /* renamed from: a */
    private static C15169a f39246a;

    /* renamed from: com.google.android.gms.common.c.a$a */
    public interface C15169a {
        /* renamed from: a */
        ScheduledExecutorService mo38459a();
    }

    /* renamed from: a */
    public static synchronized C15169a m44141a() {
        C15169a aVar;
        synchronized (C15168a.class) {
            if (f39246a == null) {
                f39246a = new C15170b();
            }
            aVar = f39246a;
        }
        return aVar;
    }
}
