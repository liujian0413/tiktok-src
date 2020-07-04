package com.ttnet.org.chromium.base1;

public abstract class Callback<T> {
    public abstract void onResult(T t);

    private void onResultFromNative(Object obj) {
        onResult(obj);
    }

    private void onResultFromNative(int i) {
        onResult(Integer.valueOf(i));
    }

    private void onResultFromNative(boolean z) {
        onResult(Boolean.valueOf(z));
    }
}
