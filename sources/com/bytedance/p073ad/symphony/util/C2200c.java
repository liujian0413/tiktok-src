package com.bytedance.p073ad.symphony.util;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.ad.symphony.util.c */
final class C2200c {
    /* renamed from: a */
    static ExecutorService m9508a(int i, ThreadFactory threadFactory) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(2).mo18995a(threadFactory).mo18996a());
    }
}
