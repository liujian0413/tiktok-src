package com.p280ss.android.ugc.aweme.p1354j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.j.a */
public final class C32197a {

    /* renamed from: a */
    public static final C32197a f84065a = new C32197a();

    /* renamed from: b */
    private static ExecutorService f84066b;

    /* renamed from: c */
    private static final ExecutorService f84067c;

    private C32197a() {
    }

    /* renamed from: a */
    public static ExecutorService m104473a() {
        return f84066b;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f84066b = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 90, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f84067c = threadPoolExecutor2;
    }
}
