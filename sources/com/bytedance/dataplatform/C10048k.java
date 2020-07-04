package com.bytedance.dataplatform;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.dataplatform.k */
final class C10048k {

    /* renamed from: a */
    static ScheduledExecutorService f27341a = C10049l.m29854a();

    /* renamed from: a */
    public static Future m29852a(Runnable runnable) {
        return f27341a.submit(runnable);
    }

    /* renamed from: a */
    public static Future m29853a(Runnable runnable, long j, long j2) {
        return f27341a.scheduleWithFixedDelay(runnable, j, 3600000, TimeUnit.MILLISECONDS);
    }
}
