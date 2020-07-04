package com.p280ss.video.rtc.engine.mediaio;

/* renamed from: com.ss.video.rtc.engine.mediaio.AutoReleaseJavaI420Buffer$$Lambda$0 */
final /* synthetic */ class AutoReleaseJavaI420Buffer$$Lambda$0 implements Runnable {
    private final TextureEglRenderer arg$1;

    AutoReleaseJavaI420Buffer$$Lambda$0(TextureEglRenderer textureEglRenderer) {
        this.arg$1 = textureEglRenderer;
    }

    public final void run() {
        AutoReleaseJavaI420Buffer.lambda$new$0$AutoReleaseJavaI420Buffer(this.arg$1);
    }
}
