package com.bytedance.ies.geckoclient.p571e;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.bytedance.ies.geckoclient.e.h */
public final class C10872h {

    /* renamed from: a */
    private static C10872h f29405a = new C10872h();

    /* renamed from: b */
    private Handler f29406b;

    /* renamed from: a */
    public static C10872h m31897a() {
        return f29405a;
    }

    private C10872h() {
        HandlerThread handlerThread = new HandlerThread("gecko-io-thread");
        handlerThread.start();
        this.f29406b = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public final void mo26206a(Runnable runnable) {
        this.f29406b.post(runnable);
    }
}
