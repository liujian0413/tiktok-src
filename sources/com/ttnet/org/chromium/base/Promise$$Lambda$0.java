package com.ttnet.org.chromium.base;

final /* synthetic */ class Promise$$Lambda$0 implements Callback {
    static final Callback $instance = new Promise$$Lambda$0();

    private Promise$$Lambda$0() {
    }

    public final void onResult(Object obj) {
        Promise.lambda$then$0$Promise((Exception) obj);
    }
}
