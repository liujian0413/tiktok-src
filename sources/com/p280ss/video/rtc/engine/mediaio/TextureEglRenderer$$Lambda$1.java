package com.p280ss.video.rtc.engine.mediaio;

import android.view.TextureView;

/* renamed from: com.ss.video.rtc.engine.mediaio.TextureEglRenderer$$Lambda$1 */
final /* synthetic */ class TextureEglRenderer$$Lambda$1 implements Runnable {
    private final TextureEglRenderer arg$1;
    private final TextureView arg$2;

    TextureEglRenderer$$Lambda$1(TextureEglRenderer textureEglRenderer, TextureView textureView) {
        this.arg$1 = textureEglRenderer;
        this.arg$2 = textureView;
    }

    public final void run() {
        this.arg$1.lambda$bind$1$TextureEglRenderer(this.arg$2);
    }
}
