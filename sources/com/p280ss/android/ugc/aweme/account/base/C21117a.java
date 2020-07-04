package com.p280ss.android.ugc.aweme.account.base;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.account.base.a */
public final class C21117a implements Executor {

    /* renamed from: a */
    public static final C21117a f56693a = new C21117a();

    /* renamed from: b */
    private final Handler f56694b = new Handler(Looper.getMainLooper());

    private C21117a() {
    }

    public final void execute(Runnable runnable) {
        this.f56694b.post(runnable);
    }
}
