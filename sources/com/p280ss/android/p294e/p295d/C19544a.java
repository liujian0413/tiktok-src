package com.p280ss.android.p294e.p295d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ss.android.e.d.a */
public final class C19544a {

    /* renamed from: a */
    private static ExecutorService f52865a;

    /* renamed from: a */
    static ExecutorService m64411a() {
        if (f52865a == null) {
            f52865a = Executors.newCachedThreadPool();
        }
        return f52865a;
    }

    /* renamed from: a */
    public static void m64412a(ExecutorService executorService) {
        f52865a = executorService;
    }
}
