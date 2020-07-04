package com.bytedance.jedi.arch.ext.list.differ;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.jedi.arch.ext.list.differ.g */
public final class C11571g implements Executor {

    /* renamed from: a */
    private final Handler f31245a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f31245a.post(runnable);
    }
}
