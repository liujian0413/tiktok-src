package com.ttnet.org.chromium.base1;

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

    public Callback<T> fulfillmentCallback() {
        return new Callback<T>() {
            public void onResult(T t) {
                Promise.this.fulfill(t);
            }
        };
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

    public static <T> Callback<Exception> rejectPromiseCallback(Promise<T> promise) {
        return new Callback<Exception>(promise) {
            final /* synthetic */ Promise val$promise;

            {
                this.val$promise = r1;
            }

            public final void onResult(Exception exc) {
                this.val$promise.reject(exc);
            }
        };
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

    public <R> Promise<R> then(final AsyncFunction<T, R> asyncFunction) {
        checkThread();
        final Promise<R> promise = new Promise<>();
        thenInner(new Callback<T>() {
            public void onResult(T t) {
                try {
                    asyncFunction.apply(t).then(new Callback<R>() {
                        public void onResult(R r) {
                            promise.fulfill(r);
                        }
                    }, Promise.rejectPromiseCallback(promise));
                } catch (Exception e) {
                    promise.reject(e);
                }
            }
        });
        exceptInner(rejectPromiseCallback(promise));
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

    public <R> Promise<R> then(final Function<T, R> function) {
        checkThread();
        final Promise<R> promise = new Promise<>();
        thenInner(new Callback<T>() {
            public void onResult(T t) {
                try {
                    promise.fulfill(function.apply(t));
                } catch (Exception e) {
                    promise.reject(e);
                }
            }
        });
        exceptInner(rejectPromiseCallback(promise));
        return promise;
    }

    public void then(Callback<T> callback) {
        checkThread();
        if (this.mThrowingRejectionHandler) {
            thenInner(callback);
            return;
        }
        then(callback, new Callback<Exception>() {
            public void onResult(Exception exc) {
                throw new UnhandledRejectionException("Promise was rejected without a rejection handler.", exc);
            }
        });
        this.mThrowingRejectionHandler = true;
    }

    private <S> void postCallbackToLooper(final Callback<S> callback, final S s) {
        this.mHandler.post(new Runnable() {
            public void run() {
                callback.onResult(s);
            }
        });
    }

    public void then(Callback<T> callback, Callback<Exception> callback2) {
        checkThread();
        thenInner(callback);
        exceptInner(callback2);
    }
}
