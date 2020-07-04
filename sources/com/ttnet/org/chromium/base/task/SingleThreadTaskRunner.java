package com.ttnet.org.chromium.base.task;

public interface SingleThreadTaskRunner extends SequencedTaskRunner {
    boolean belongsToCurrentThread();
}
