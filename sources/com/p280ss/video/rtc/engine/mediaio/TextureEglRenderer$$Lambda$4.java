package com.p280ss.video.rtc.engine.mediaio;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.video.rtc.engine.mediaio.TextureEglRenderer$$Lambda$4 */
final /* synthetic */ class TextureEglRenderer$$Lambda$4 implements Runnable {
    private final Runnable arg$1;
    private final CountDownLatch arg$2;

    TextureEglRenderer$$Lambda$4(Runnable runnable, CountDownLatch countDownLatch) {
        this.arg$1 = runnable;
        this.arg$2 = countDownLatch;
    }

    public final void run() {
        TextureEglRenderer.lambda$postOnMainThreadAndLock$3$TextureEglRenderer(this.arg$1, this.arg$2);
    }
}
