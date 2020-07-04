package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.h */
public final class C17059h {

    /* renamed from: a */
    public static final Executor f47729a = new C17060a();

    /* renamed from: b */
    static final Executor f47730b = new C17078x();

    /* renamed from: com.google.android.gms.tasks.h$a */
    static final class C17060a implements Executor {

        /* renamed from: a */
        private final Handler f47731a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f47731a.post(runnable);
        }
    }
}
