package org.webrtc;

import org.webrtc.EglRenderer.FrameListener;
import org.webrtc.RendererCommon.GlDrawer;

final /* synthetic */ class EglRenderer$$Lambda$3 implements Runnable {
    private final EglRenderer arg$1;
    private final GlDrawer arg$2;
    private final FrameListener arg$3;
    private final float arg$4;
    private final boolean arg$5;

    EglRenderer$$Lambda$3(EglRenderer eglRenderer, GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        this.arg$1 = eglRenderer;
        this.arg$2 = glDrawer;
        this.arg$3 = frameListener;
        this.arg$4 = f;
        this.arg$5 = z;
    }

    public final void run() {
        this.arg$1.lambda$addFrameListener$3$EglRenderer(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
