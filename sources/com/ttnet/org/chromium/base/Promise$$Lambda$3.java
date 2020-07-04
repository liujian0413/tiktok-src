package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.Promise.AsyncFunction;

final /* synthetic */ class Promise$$Lambda$3 implements Callback {
    private final AsyncFunction arg$1;
    private final Promise arg$2;

    Promise$$Lambda$3(AsyncFunction asyncFunction, Promise promise) {
        this.arg$1 = asyncFunction;
        this.arg$2 = promise;
    }

    public final void onResult(Object obj) {
        Promise.lambda$then$2$Promise(this.arg$1, this.arg$2, obj);
    }
}
