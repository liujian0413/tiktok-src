package org.webrtc;

import java.util.concurrent.CountDownLatch;

final /* synthetic */ class EglRenderer$$Lambda$1 implements Runnable {
    private final EglRenderer arg$1;
    private final CountDownLatch arg$2;

    EglRenderer$$Lambda$1(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        this.arg$1 = eglRenderer;
        this.arg$2 = countDownLatch;
    }

    public final void run() {
        this.arg$1.lambda$release$1$EglRenderer(this.arg$2);
    }
}
