package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.utils.fl */
final class C43133fl {
    /* renamed from: a */
    static ExecutorService m136819a(int i) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(4).mo18996a());
    }
}
