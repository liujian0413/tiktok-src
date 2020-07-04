package com.p280ss.video.rtc.engine.mediaio;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.video.rtc.engine.mediaio.TextureEglRenderer$$Lambda$2 */
final /* synthetic */ class TextureEglRenderer$$Lambda$2 implements Runnable {
    private final CountDownLatch arg$1;

    private TextureEglRenderer$$Lambda$2(CountDownLatch countDownLatch) {
        this.arg$1 = countDownLatch;
    }

    static Runnable get$Lambda(CountDownLatch countDownLatch) {
        return new TextureEglRenderer$$Lambda$2(countDownLatch);
    }

    public final void run() {
        this.arg$1.countDown();
    }
}
