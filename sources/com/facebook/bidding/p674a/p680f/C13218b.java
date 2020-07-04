package com.facebook.bidding.p674a.p680f;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.bidding.a.f.b */
public final class C13218b implements Executor {

    /* renamed from: a */
    public static final C13218b f35029a = new C13218b();

    /* renamed from: b */
    private final Handler f35030b = new Handler(Looper.getMainLooper());

    private C13218b() {
    }

    /* renamed from: a */
    public static void m38628a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f35029a.execute(runnable);
        }
    }

    public final void execute(Runnable runnable) {
        this.f35030b.post(runnable);
    }
}
