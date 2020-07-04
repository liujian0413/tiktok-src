package com.google.android.gms.common.api.internal;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.api.internal.ay */
final class C15074ay {
    /* renamed from: a */
    static ExecutorService m43751a(int i, ThreadFactory threadFactory) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(2).mo18995a(threadFactory).mo18996a());
    }
}
