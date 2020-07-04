package com.bytedance.lighten.core.p613d;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.lighten.core.d.b */
public final class C12121b implements Executor {

    /* renamed from: a */
    private Handler f32201a = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.lighten.core.d.b$a */
    static class C12122a {

        /* renamed from: a */
        public static final C12121b f32202a = new C12121b();
    }

    /* renamed from: a */
    public static C12121b m35290a() {
        return C12122a.f32202a;
    }

    /* renamed from: b */
    private boolean m35291b() {
        if (Thread.currentThread() == this.f32201a.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    public final void execute(Runnable runnable) {
        if (m35291b()) {
            runnable.run();
        } else {
            this.f32201a.post(runnable);
        }
    }
}
