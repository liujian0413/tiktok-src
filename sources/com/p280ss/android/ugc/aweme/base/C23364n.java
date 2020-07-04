package com.p280ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.base.n */
public final class C23364n implements Executor {

    /* renamed from: a */
    public static final C23364n f61448a = new C23364n();

    /* renamed from: b */
    private final Handler f61449b = new Handler(Looper.getMainLooper());

    private C23364n() {
    }

    public final void execute(Runnable runnable) {
        this.f61449b.post(runnable);
    }

    /* renamed from: a */
    public final void mo60676a(Runnable runnable, long j) {
        this.f61449b.postDelayed(runnable, 500);
    }
}
