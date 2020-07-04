package com.ttnet.org.chromium.base;

final /* synthetic */ class Promise$$Lambda$5 implements Runnable {
    private final Callback arg$1;
    private final Object arg$2;

    Promise$$Lambda$5(Callback callback, Object obj) {
        this.arg$1 = callback;
        this.arg$2 = obj;
    }

    public final void run() {
        this.arg$1.onResult(this.arg$2);
    }
}
