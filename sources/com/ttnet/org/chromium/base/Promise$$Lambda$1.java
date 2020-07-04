package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.Promise.Function;

final /* synthetic */ class Promise$$Lambda$1 implements Callback {
    private final Promise arg$1;
    private final Function arg$2;

    Promise$$Lambda$1(Promise promise, Function function) {
        this.arg$1 = promise;
        this.arg$2 = function;
    }

    public final void onResult(Object obj) {
        Promise.lambda$then$1$Promise(this.arg$1, this.arg$2, obj);
    }
}
