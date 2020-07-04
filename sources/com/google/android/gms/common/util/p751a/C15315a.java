package com.google.android.gms.common.util.p751a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p761c.C16359d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.util.a.a */
public final class C15315a implements Executor {

    /* renamed from: a */
    private final Handler f39583a;

    public C15315a(Looper looper) {
        this.f39583a = new C16359d(looper);
    }

    public final void execute(Runnable runnable) {
        this.f39583a.post(runnable);
    }
}
