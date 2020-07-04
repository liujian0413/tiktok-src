package com.ttnet.org.chromium.base.task;

final /* synthetic */ class SequencedTaskRunnerImpl$$Lambda$0 implements Runnable {
    private final SequencedTaskRunnerImpl arg$1;
    private final Runnable arg$2;

    SequencedTaskRunnerImpl$$Lambda$0(SequencedTaskRunnerImpl sequencedTaskRunnerImpl, Runnable runnable) {
        this.arg$1 = sequencedTaskRunnerImpl;
        this.arg$2 = runnable;
    }

    public final void run() {
        this.arg$1.lambda$postDelayedTaskToNative$0$SequencedTaskRunnerImpl(this.arg$2);
    }
}
