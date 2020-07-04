package com.ttnet.org.chromium.base.task;

public interface TaskExecutor {
    boolean canRunTaskImmediately(TaskTraits taskTraits);

    SequencedTaskRunner createSequencedTaskRunner(TaskTraits taskTraits);

    SingleThreadTaskRunner createSingleThreadTaskRunner(TaskTraits taskTraits);

    TaskRunner createTaskRunner(TaskTraits taskTraits);

    void postDelayedTask(TaskTraits taskTraits, Runnable runnable, long j);
}
