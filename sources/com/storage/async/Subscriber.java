package com.storage.async;

public interface Subscriber<T> {

    public static class NoConcernSubscriber<T> implements Subscriber<T> {
        public void onError(Throwable th) {
        }

        public void onSuccess() {
        }

        public void onSuccess(T t) {
        }
    }

    public static abstract class ResultLessSubscriber<T> implements Subscriber<T> {
        public void onSuccess(T t) {
        }
    }

    public static abstract class ResultableSubscriber<T> implements Subscriber<T> {
        public void onSuccess() {
        }
    }

    void onError(Throwable th);

    void onSuccess();

    void onSuccess(T t);
}
