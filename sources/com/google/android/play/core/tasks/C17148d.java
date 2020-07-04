package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.d */
public final class C17148d {

    /* renamed from: a */
    public static final Executor f47871a = new C17149a();

    /* renamed from: b */
    static final Executor f47872b = new C17158m();

    /* renamed from: com.google.android.play.core.tasks.d$a */
    static final class C17149a implements Executor {

        /* renamed from: a */
        private final Handler f47873a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f47873a.post(runnable);
        }
    }
}
