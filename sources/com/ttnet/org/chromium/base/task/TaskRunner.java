package com.ttnet.org.chromium.base.task;

public interface TaskRunner {
    void destroy();

    void disableLifetimeCheck();

    void initNativeTaskRunner();

    void postDelayedTask(Runnable runnable, long j);

    void postTask(Runnable runnable);
}
