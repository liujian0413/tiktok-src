package com.ttnet.org.chromium.base;

import android.os.Handler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedList;
import java.util.List;

public class Promise<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final List<Callback<T>> mFulfillCallbacks = new LinkedList();
    private final Handler mHandler = new Handler();
    private final List<Callback<Exception>> mRejectCallbacks = new LinkedList();
    private Exception mRejectReason;
    private T mResult;
    private int mState;
    private final Thread mThread = Thread.currentThread();
    private boolean mThrowingRejectionHandler;

    @Retention(RetentionPolicy.SOURCE)
    @interface PromiseState {
    }

    public interface AsyncFunction<A, R> {
        Promise<R> apply(A a);
    }

    public interface Function<A, R> {
        R apply(A a);
    }

    public static class UnhandledRejectionException extends RuntimeException {
        public UnhandledRejectionException(String str, Throwable th) {
            super(str, th);
        }
    }

    private void checkThread() {
    }

    public T getResult() {
        return this.mResult;
    }

    public void reject() {
        reject(null);
    }

    public boolean isFulfilled() {
        checkThread();
        if (this.mState == 1) {
            return true;
        }
        return false;
    }

    public boolean isRejected() {
        checkThread();
        if (this.mState == 2) {
            return true;
        }
        return false;
    }

    static final /* synthetic */ void lambda$then$0$Promise(Exception exc) {
        throw new UnhandledRejectionException("Promise was rejected without a rejection handler.", exc);
    }

    public void except(Callback<Exception> callback) {
        checkThread();
        exceptInner(callback);
    }

    public static <T> Promise<T> fulfilled(T t) {
        Promise<T> promise = new Promise<>();
        promise.fulfill(t);
        return promise;
    }

    private void exceptInner(Callback<Exception> callback) {
        if (this.mState == 2) {
            postCallbackToLooper(callback, this.mRejectReason);
            return;
        }
        if (this.mState == 0) {
            this.mRejectCallbacks.add(callback);
        }
    }

    private void thenInner(Callback<T> callback) {
        if (this.mState == 1) {
            postCallbackToLooper(callback, this.mResult);
            return;
        }
        if (this.mState == 0) {
            this.mFulfillCallbacks.add(callback);
        }
    }

    public <R> Promise<R> then(AsyncFunction<T, R> asyncFunction) {
        checkThread();
        Promise<R> promise = new Promise<>();
        thenInner(new Promise$$Lambda$3(asyncFunction, promise));
        promise.getClass();
        exceptInner(Promise$$Lambda$4.get$Lambda(promise));
        return promise;
    }

    public void fulfill(T t) {
        checkThread();
        this.mState = 1;
        this.mResult = t;
        for (Callback postCallbackToLooper : this.mFulfillCallbacks) {
            postCallbackToLooper(postCallbackToLooper, t);
        }
        this.mFulfillCallbacks.clear();
    }

    public void reject(Exception exc) {
        checkThread();
        this.mState = 2;
        this.mRejectReason = exc;
        for (Callback postCallbackToLooper : this.mRejectCallbacks) {
            postCallbackToLooper(postCallbackToLooper, exc);
        }
        this.mRejectCallbacks.clear();
    }

    public <R> Promise<R> then(Function<T, R> function) {
        checkThread();
        Promise<R> promise = new Promise<>();
        thenInner(new Promise$$Lambda$1(promise, function));
        promise.getClass();
        exceptInner(Promise$$Lambda$2.get$Lambda(promise));
        return promise;
    }

    public void then(Callback<T> callback) {
        checkThread();
        if (this.mThrowingRejectionHandler) {
            thenInner(callback);
            return;
        }
        then(callback, Promise$$Lambda$0.$instance);
        this.mThrowingRejectionHandler = true;
    }

    private <S> void postCallbackToLooper(Callback<S> callback, S s) {
        this.mHandler.post(new Promise$$Lambda$5(callback, s));
    }

    public void then(Callback<T> callback, Callback<Exception> callback2) {
        checkThread();
        thenInner(callback);
        exceptInner(callback2);
    }

    static final /* synthetic */ void lambda$then$1$Promise(Promise promise, Function function, Object obj) {
        try {
            promise.fulfill(function.apply(obj));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    static final /* synthetic */ void lambda$then$2$Promise(AsyncFunction asyncFunction, Promise promise, Object obj) {
        try {
            Promise apply = asyncFunction.apply(obj);
            promise.getClass();
            Callback callback = Promise$$Lambda$6.get$Lambda(promise);
            promise.getClass();
            apply.then(callback, Promise$$Lambda$7.get$Lambda(promise));
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
