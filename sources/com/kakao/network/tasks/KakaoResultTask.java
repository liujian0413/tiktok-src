package com.kakao.network.tasks;

import android.os.Handler;
import android.os.Looper;
import com.kakao.network.ErrorResult;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.network.exception.ResponseStatusError;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public abstract class KakaoResultTask<T> {
    public static final Handler mainHandler = new Handler(Looper.getMainLooper());
    final ResponseCallback<T> callback;
    private final Callable<T> task;

    public abstract T call() throws Exception;

    public final Callable<T> getCallable() {
        return this.task;
    }

    public void onDidEnd() {
    }

    public void onDidStart() {
    }

    public KakaoResultTask() {
        this.task = new Callable<T>() {
            public T call() throws Exception {
                final T t = null;
                try {
                    if (KakaoResultTask.this.callback != null) {
                        KakaoResultTask.this.callback.onDidStart();
                    }
                    KakaoResultTask.this.onDidStart();
                    e = null;
                    t = KakaoResultTask.this.call();
                } catch (Exception e) {
                    e = e;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                KakaoResultTask.mainHandler.post(new Runnable() {
                    public void run() {
                        ErrorResult errorResult;
                        try {
                            if (KakaoResultTask.this.callback != null) {
                                if (e != null) {
                                    if (e instanceof ResponseStatusError) {
                                        errorResult = new ErrorResult((ResponseStatusError) e);
                                    } else {
                                        errorResult = new ErrorResult(e);
                                    }
                                    KakaoResultTask.this.callback.onFailureForUiThread(errorResult);
                                } else {
                                    KakaoResultTask.this.callback.onSuccessForUiThread(t);
                                }
                                countDownLatch.countDown();
                            }
                        } finally {
                            countDownLatch.countDown();
                        }
                    }
                });
                countDownLatch.await();
                KakaoResultTask.this.onDidEnd();
                if (KakaoResultTask.this.callback != null) {
                    KakaoResultTask.this.callback.onDidEnd();
                }
                return t;
            }
        };
        this.callback = null;
    }

    public KakaoResultTask(ResponseCallback<T> responseCallback) {
        this.task = new Callable<T>() {
            public T call() throws Exception {
                final T t = null;
                try {
                    if (KakaoResultTask.this.callback != null) {
                        KakaoResultTask.this.callback.onDidStart();
                    }
                    KakaoResultTask.this.onDidStart();
                    e = null;
                    t = KakaoResultTask.this.call();
                } catch (Exception e) {
                    e = e;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                KakaoResultTask.mainHandler.post(new Runnable() {
                    public void run() {
                        ErrorResult errorResult;
                        try {
                            if (KakaoResultTask.this.callback != null) {
                                if (e != null) {
                                    if (e instanceof ResponseStatusError) {
                                        errorResult = new ErrorResult((ResponseStatusError) e);
                                    } else {
                                        errorResult = new ErrorResult(e);
                                    }
                                    KakaoResultTask.this.callback.onFailureForUiThread(errorResult);
                                } else {
                                    KakaoResultTask.this.callback.onSuccessForUiThread(t);
                                }
                                countDownLatch.countDown();
                            }
                        } finally {
                            countDownLatch.countDown();
                        }
                    }
                });
                countDownLatch.await();
                KakaoResultTask.this.onDidEnd();
                if (KakaoResultTask.this.callback != null) {
                    KakaoResultTask.this.callback.onDidEnd();
                }
                return t;
            }
        };
        this.callback = responseCallback;
    }
}
