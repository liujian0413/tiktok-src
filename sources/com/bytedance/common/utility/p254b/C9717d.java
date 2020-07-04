package com.bytedance.common.utility.p254b;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.common.utility.b.d */
final class C9717d {
    /* renamed from: a */
    static ScheduledExecutorService m28653a(int i, ThreadFactory threadFactory) {
        return (ScheduledExecutorService) C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(3).mo18995a(threadFactory).mo18996a());
    }
}
