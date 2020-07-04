package com.p280ss.video.rtc.engine.utils;

/* renamed from: com.ss.video.rtc.engine.utils.TextureHelper$$Lambda$3 */
final /* synthetic */ class TextureHelper$$Lambda$3 implements Runnable {
    private final TextureHelper arg$1;
    private final int arg$2;

    TextureHelper$$Lambda$3(TextureHelper textureHelper, int i) {
        this.arg$1 = textureHelper;
        this.arg$2 = i;
    }

    public final void run() {
        this.arg$1.lambda$queueTexture$3$TextureHelper(this.arg$2);
    }
}
