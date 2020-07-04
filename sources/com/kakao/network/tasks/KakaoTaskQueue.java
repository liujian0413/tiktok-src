package com.kakao.network.tasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KakaoTaskQueue extends AbstractTaskQueue {
    private static KakaoTaskQueue instance = new KakaoTaskQueue(Executors.newCachedThreadPool());

    public static KakaoTaskQueue getInstance() {
        return instance;
    }

    public KakaoTaskQueue(ExecutorService executorService) {
        super(executorService);
    }
}
