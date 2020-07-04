package com.bytedance.android.live.core.utils.p158a;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.android.live.core.utils.a.f */
final /* synthetic */ class C3350f implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f10166a = new C3350f();

    private C3350f() {
    }

    public final Thread newThread(Runnable runnable) {
        return C3347c.m12491a(runnable);
    }
}
