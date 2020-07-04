package com.p280ss.android.ugc.awemepushlib.interaction;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.u */
final class C43625u {
    /* renamed from: a */
    static ExecutorService m138219a(int i) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18996a());
    }
}
