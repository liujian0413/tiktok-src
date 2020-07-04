package com.p280ss.android.p817ad.splash.core.p830e;

import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ad.splash.core.e.a */
public class C19023a {

    /* renamed from: a */
    private static volatile C19023a f51368a;

    /* renamed from: b */
    private volatile ExecutorService f51369b = C19024b.m62086a(2);

    /* renamed from: a */
    public static C19023a m62084a() {
        if (f51368a == null) {
            synchronized (C19023a.class) {
                if (f51368a == null) {
                    f51368a = new C19023a();
                }
            }
        }
        return f51368a;
    }

    /* renamed from: a */
    public final void mo50518a(Runnable runnable) {
        if (this.f51369b != null) {
            this.f51369b.submit(runnable);
        }
    }
}
