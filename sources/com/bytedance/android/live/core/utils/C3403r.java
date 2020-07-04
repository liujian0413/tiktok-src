package com.bytedance.android.live.core.utils;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.live.core.utils.r */
final class C3403r {
    /* renamed from: a */
    static ExecutorService m12647a(int i) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18996a());
    }
}
