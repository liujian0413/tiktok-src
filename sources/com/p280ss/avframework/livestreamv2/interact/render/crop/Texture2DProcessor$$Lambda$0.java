package com.p280ss.avframework.livestreamv2.interact.render.crop;

import com.p280ss.avframework.livestreamv2.interact.render.ImageFrame;

/* renamed from: com.ss.avframework.livestreamv2.interact.render.crop.Texture2DProcessor$$Lambda$0 */
final /* synthetic */ class Texture2DProcessor$$Lambda$0 implements Runnable {
    private final Texture2DProcessor arg$1;
    private final ImageFrame arg$2;
    private final float[] arg$3;

    Texture2DProcessor$$Lambda$0(Texture2DProcessor texture2DProcessor, ImageFrame imageFrame, float[] fArr) {
        this.arg$1 = texture2DProcessor;
        this.arg$2 = imageFrame;
        this.arg$3 = fArr;
    }

    public final void run() {
        this.arg$1.lambda$pushImage$0$Texture2DProcessor(this.arg$2, this.arg$3);
    }
}
