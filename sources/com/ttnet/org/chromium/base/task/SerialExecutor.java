package com.ttnet.org.chromium.base.task;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class SerialExecutor implements Executor {
    Runnable mActive;
    final ArrayDeque<Runnable> mTasks = new ArrayDeque<>();

    SerialExecutor() {
    }

    /* access modifiers changed from: protected */
    public synchronized void scheduleNext() {
        Runnable runnable = (Runnable) this.mTasks.poll();
        this.mActive = runnable;
        if (runnable != null) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(this.mActive);
        }
    }

    public synchronized void execute(final Runnable runnable) {
        this.mTasks.offer(new Runnable() {
            public void run() {
                try {
                    runnable.run();
                } finally {
                    SerialExecutor.this.scheduleNext();
                }
            }
        });
        if (this.mActive == null) {
            scheduleNext();
        }
    }
}
