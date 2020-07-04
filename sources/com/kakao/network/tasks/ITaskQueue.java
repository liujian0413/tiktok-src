package com.kakao.network.tasks;

import java.util.concurrent.Future;

public interface ITaskQueue {
    <T> Future<T> addTask(KakaoResultTask<T> kakaoResultTask);
}
