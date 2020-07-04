package com.p280ss.android.ugc.aweme.crossplatform.prefetch;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.c */
final class C25995c {
    /* renamed from: a */
    static ExecutorService m85379a() {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18996a());
    }
}
