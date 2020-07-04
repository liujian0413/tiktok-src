package com.p280ss.android.ugc.aweme.tools.extract;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.m */
final class C42330m {
    /* renamed from: a */
    static ScheduledExecutorService m134618a() {
        return (ScheduledExecutorService) C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(1).mo18996a());
    }
}
