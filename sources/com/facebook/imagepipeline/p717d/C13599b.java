package com.facebook.imagepipeline.p717d;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.facebook.imagepipeline.d.b */
final class C13599b {
    /* renamed from: a */
    static ExecutorService m40020a(int i, ThreadFactory threadFactory) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(i).mo18995a(threadFactory).mo18996a());
    }
}
