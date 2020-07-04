package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SimpleSettableFuture<T> implements Future<T> {
    private Exception mException;
    private final CountDownLatch mReadyLatch = new CountDownLatch(1);
    private T mResult;

    public boolean isCancelled() {
        return false;
    }

    public T getOrThrow() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isDone() {
        if (this.mReadyLatch.getCount() == 0) {
            return true;
        }
        return false;
    }

    private void checkNotSet() {
        if (this.mReadyLatch.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public T get() throws InterruptedException, ExecutionException {
        this.mReadyLatch.await();
        if (this.mException == null) {
            return this.mResult;
        }
        throw new ExecutionException(this.mException);
    }

    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void set(T t) {
        checkNotSet();
        this.mResult = t;
        this.mReadyLatch.countDown();
    }

    public void setException(Exception exc) {
        checkNotSet();
        this.mException = exc;
        this.mReadyLatch.countDown();
    }

    public T getOrThrow(long j, TimeUnit timeUnit) {
        try {
            return get(j, timeUnit);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (!this.mReadyLatch.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        } else if (this.mException == null) {
            return this.mResult;
        } else {
            throw new ExecutionException(this.mException);
        }
    }
}
