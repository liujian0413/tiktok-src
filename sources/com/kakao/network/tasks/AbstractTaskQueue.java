package com.kakao.network.tasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class AbstractTaskQueue implements ITaskQueue {
    private ExecutorService executor;

    public AbstractTaskQueue(ExecutorService executorService) {
        this.executor = executorService;
    }

    public <T> Future<T> addTask(KakaoResultTask<T> kakaoResultTask) {
        return this.executor.submit(kakaoResultTask.getCallable());
    }
}
