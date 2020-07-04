package com.facebook.react.common;

import android.support.p022v4.util.Pools.C0887a;

public class ClearableSynchronizedPool<T> implements C0887a<T> {
    private final Object[] mPool;
    private int mSize;

    public synchronized T acquire() {
        if (this.mSize == 0) {
            return null;
        }
        this.mSize--;
        int i = this.mSize;
        T t = this.mPool[i];
        this.mPool[i] = null;
        return t;
    }

    public synchronized void clear() {
        for (int i = 0; i < this.mSize; i++) {
            this.mPool[i] = null;
        }
        this.mSize = 0;
    }

    public ClearableSynchronizedPool(int i) {
        this.mPool = new Object[i];
    }

    public synchronized boolean release(T t) {
        if (this.mSize == this.mPool.length) {
            return false;
        }
        this.mPool[this.mSize] = t;
        this.mSize++;
        return true;
    }
}
