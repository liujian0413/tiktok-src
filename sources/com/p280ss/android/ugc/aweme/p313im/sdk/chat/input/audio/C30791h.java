package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.h */
final class C30791h {
    /* renamed from: a */
    static ExecutorService m100292a() {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18996a());
    }
}
