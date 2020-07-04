package org.webrtc;

import java.util.concurrent.CountDownLatch;

final /* synthetic */ class VideoFileRenderer$$Lambda$2 implements Runnable {
    private final VideoFileRenderer arg$1;
    private final CountDownLatch arg$2;

    VideoFileRenderer$$Lambda$2(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        this.arg$1 = videoFileRenderer;
        this.arg$2 = countDownLatch;
    }

    public final void run() {
        this.arg$1.lambda$release$2$VideoFileRenderer(this.arg$2);
    }
}
