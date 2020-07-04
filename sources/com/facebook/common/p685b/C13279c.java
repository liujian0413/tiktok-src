package com.facebook.common.p685b;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.common.b.c */
public final class C13279c extends C13276b implements C13283g {
    public C13279c(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    public final synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
