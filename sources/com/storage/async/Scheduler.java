package com.storage.async;

public interface Scheduler {
    void execute(Runnable runnable);
}
