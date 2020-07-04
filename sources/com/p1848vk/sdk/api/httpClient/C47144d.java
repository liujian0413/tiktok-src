package com.p1848vk.sdk.api.httpClient;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vk.sdk.api.httpClient.d */
final class C47144d {
    /* renamed from: a */
    static ExecutorService m147392a() {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18996a());
    }

    /* renamed from: a */
    static ExecutorService m147393a(int i) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(3).mo18996a());
    }
}
