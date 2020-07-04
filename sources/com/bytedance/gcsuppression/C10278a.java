package com.bytedance.gcsuppression;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.bytedance.gcsuppression.a */
final class C10278a {
    /* renamed from: a */
    static ScheduledExecutorService m30439a() {
        return (ScheduledExecutorService) C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(1).mo18996a());
    }

    /* renamed from: a */
    static void m30440a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }

    /* renamed from: b */
    static ExecutorService m30441b() {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18996a());
    }
}
