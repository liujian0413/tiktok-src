package com.p280ss.android.ugc.aweme.base;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.ss.android.ugc.aweme.base.l */
final class C23351l {
    /* renamed from: a */
    static ExecutorService m76609a(int i, ThreadFactory threadFactory) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18995a(threadFactory).mo18996a());
    }
}
