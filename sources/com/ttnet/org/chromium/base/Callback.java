package com.ttnet.org.chromium.base;

public interface Callback<T> {

    public static abstract class Helper {
        static void runRunnable(Runnable runnable) {
            runnable.run();
        }

        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.onResult(obj);
        }

        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.onResult(Boolean.valueOf(z));
        }

        static void onIntResultFromNative(Callback callback, int i) {
            callback.onResult(Integer.valueOf(i));
        }
    }

    void onResult(T t);
}
