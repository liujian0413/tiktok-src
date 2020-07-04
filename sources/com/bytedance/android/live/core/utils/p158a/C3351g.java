package com.bytedance.android.live.core.utils.p158a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.android.live.core.utils.a.g */
final class C3351g {
    /* renamed from: a */
    static ExecutorService m12496a(int i, ThreadFactory threadFactory) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18995a(threadFactory).mo18996a());
    }

    /* renamed from: a */
    static boolean m12497a(Context context) {
        try {
            return C6900g.m21454b().mo16943d();
        } catch (Exception unused) {
            return false;
        }
    }
}
