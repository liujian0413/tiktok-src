package com.ttnet.org.chromium.base;

final /* synthetic */ class Promise$$Lambda$7 implements Callback {
    private final Promise arg$1;

    private Promise$$Lambda$7(Promise promise) {
        this.arg$1 = promise;
    }

    static Callback get$Lambda(Promise promise) {
        return new Promise$$Lambda$7(promise);
    }

    public final void onResult(Object obj) {
        this.arg$1.reject((Exception) obj);
    }
}
