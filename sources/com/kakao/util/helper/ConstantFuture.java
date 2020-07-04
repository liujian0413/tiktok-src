package com.kakao.util.helper;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class ConstantFuture<T> implements Future<T> {

    /* renamed from: v */
    private final T f50116v;

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.f50116v;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public ConstantFuture(T t) {
        this.f50116v = t;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f50116v;
    }
}
