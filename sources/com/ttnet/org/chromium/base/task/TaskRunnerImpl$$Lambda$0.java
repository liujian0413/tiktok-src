package com.ttnet.org.chromium.base.task;

final /* synthetic */ class TaskRunnerImpl$$Lambda$0 implements Runnable {
    private final TaskRunnerImpl arg$1;

    TaskRunnerImpl$$Lambda$0(TaskRunnerImpl taskRunnerImpl) {
        this.arg$1 = taskRunnerImpl;
    }

    public final void run() {
        this.arg$1.runPreNativeTask();
    }
}
