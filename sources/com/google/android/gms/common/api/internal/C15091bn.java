package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p751a.C15317c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.bn */
public final class C15091bn {

    /* renamed from: a */
    private static final ExecutorService f39026a;

    /* renamed from: a */
    public static ExecutorService m43781a() {
        return f39026a;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C15317c("GAC_Transform"));
        f39026a = threadPoolExecutor;
    }
}
