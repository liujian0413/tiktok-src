package com.ttnet.org.chromium.base.task;

import java.util.concurrent.atomic.AtomicInteger;

public class SequencedTaskRunnerImpl extends TaskRunnerImpl implements SequencedTaskRunner {
    private int mNumUnfinishedNativeTasks;
    private AtomicInteger mPendingTasks = new AtomicInteger();

    public void initNativeTaskRunner() {
        synchronized (this.mLock) {
            migratePreNativeTasksToNative();
        }
    }

    /* access modifiers changed from: protected */
    public void runPreNativeTask() {
        super.runPreNativeTask();
        if (this.mPendingTasks.decrementAndGet() > 0) {
            super.schedulePreNativeTask();
        }
    }

    /* access modifiers changed from: protected */
    public void schedulePreNativeTask() {
        if (this.mPendingTasks.getAndIncrement() == 0) {
            super.schedulePreNativeTask();
        }
    }

    SequencedTaskRunnerImpl(TaskTraits taskTraits) {
        super(taskTraits, "SequencedTaskRunnerImpl", 1);
        disableLifetimeCheck();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$postDelayedTaskToNative$0$SequencedTaskRunnerImpl(Runnable runnable) {
        runnable.run();
        synchronized (this.mLock) {
            int i = this.mNumUnfinishedNativeTasks - 1;
            this.mNumUnfinishedNativeTasks = i;
            if (i == 0) {
                destroyInternal();
            }
        }
    }

    public void postDelayedTaskToNative(Runnable runnable, long j) {
        synchronized (this.mLock) {
            int i = this.mNumUnfinishedNativeTasks;
            this.mNumUnfinishedNativeTasks = i + 1;
            if (i == 0) {
                initNativeTaskRunnerInternal();
            }
            super.postDelayedTaskToNative(new SequencedTaskRunnerImpl$$Lambda$0(this, runnable), j);
        }
    }
}
