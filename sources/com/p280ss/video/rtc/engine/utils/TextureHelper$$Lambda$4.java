package com.p280ss.video.rtc.engine.utils;

import java.util.concurrent.Callable;

/* renamed from: com.ss.video.rtc.engine.utils.TextureHelper$$Lambda$4 */
final /* synthetic */ class TextureHelper$$Lambda$4 implements Callable {
    private final TextureHelper arg$1;
    private final int arg$2;
    private final int arg$3;
    private final int arg$4;

    TextureHelper$$Lambda$4(TextureHelper textureHelper, int i, int i2, int i3) {
        this.arg$1 = textureHelper;
        this.arg$2 = i;
        this.arg$3 = i2;
        this.arg$4 = i3;
    }

    public final Object call() {
        return this.arg$1.lambda$generateTexture$4$TextureHelper(this.arg$2, this.arg$3, this.arg$4);
    }
}
