package org.webrtc;

import org.webrtc.EglBase.Context;

final /* synthetic */ class EglRenderer$$Lambda$0 implements Runnable {
    private final EglRenderer arg$1;
    private final Context arg$2;
    private final int[] arg$3;

    EglRenderer$$Lambda$0(EglRenderer eglRenderer, Context context, int[] iArr) {
        this.arg$1 = eglRenderer;
        this.arg$2 = context;
        this.arg$3 = iArr;
    }

    public final void run() {
        this.arg$1.lambda$init$0$EglRenderer(this.arg$2, this.arg$3);
    }
}
