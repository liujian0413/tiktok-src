package com.ttnet.org.chromium.base.task;

import java.util.concurrent.Executor;

final /* synthetic */ class AsyncTask$$Lambda$1 implements Executor {
    static final Executor $instance = new AsyncTask$$Lambda$1();

    private AsyncTask$$Lambda$1() {
    }

    public final void execute(Runnable runnable) {
        PostTask.postTask(TaskTraits.BEST_EFFORT_MAY_BLOCK, runnable);
    }
}
