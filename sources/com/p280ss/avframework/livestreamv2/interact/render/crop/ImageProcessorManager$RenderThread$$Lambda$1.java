package com.p280ss.avframework.livestreamv2.interact.render.crop;

/* renamed from: com.ss.avframework.livestreamv2.interact.render.crop.ImageProcessorManager$RenderThread$$Lambda$1 */
final /* synthetic */ class ImageProcessorManager$RenderThread$$Lambda$1 implements Runnable {
    private final RenderThread arg$1;

    ImageProcessorManager$RenderThread$$Lambda$1(RenderThread renderThread) {
        this.arg$1 = renderThread;
    }

    public final void run() {
        this.arg$1.onStop();
    }
}
