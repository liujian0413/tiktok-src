package com.p280ss.video.rtc.engine.utils;

/* renamed from: com.ss.video.rtc.engine.utils.TextureHelper$$Lambda$2 */
final /* synthetic */ class TextureHelper$$Lambda$2 implements Runnable {
    private final TextureHelper arg$1;
    private final int[] arg$2;

    TextureHelper$$Lambda$2(TextureHelper textureHelper, int[] iArr) {
        this.arg$1 = textureHelper;
        this.arg$2 = iArr;
    }

    public final void run() {
        this.arg$1.lambda$dequeueTexture$2$TextureHelper(this.arg$2);
    }
}
