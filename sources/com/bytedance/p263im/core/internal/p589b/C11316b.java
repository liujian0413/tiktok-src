package com.bytedance.p263im.core.internal.p589b;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.im.core.internal.b.b */
final class C11316b {
    /* renamed from: a */
    static ExecutorService m33186a(int i, ThreadFactory threadFactory) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(i).mo18995a(threadFactory).mo18996a());
    }

    /* renamed from: a */
    static ExecutorService m33187a(ThreadFactory threadFactory) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18995a(threadFactory).mo18996a());
    }
}
