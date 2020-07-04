package com.p280ss.video.rtc.engine.mediaio;

import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.mediaio.TextureEglRenderer$$Lambda$3 */
final /* synthetic */ class TextureEglRenderer$$Lambda$3 implements Runnable {
    private final TextureEglRenderer arg$1;
    private final VideoFrame arg$2;

    TextureEglRenderer$$Lambda$3(TextureEglRenderer textureEglRenderer, VideoFrame videoFrame) {
        this.arg$1 = textureEglRenderer;
        this.arg$2 = videoFrame;
    }

    public final void run() {
        this.arg$1.lambda$onFrame$2$TextureEglRenderer(this.arg$2);
    }
}
