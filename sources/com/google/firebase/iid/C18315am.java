package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.am */
final class C18315am {

    /* renamed from: a */
    private static final Executor f49785a = C18317ao.f49787a;

    /* renamed from: a */
    static Executor m60391a() {
        return f49785a;
    }

    /* renamed from: b */
    static Executor m60392b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C18316an.f49786a);
        return threadPoolExecutor;
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m60390a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
