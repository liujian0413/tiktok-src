package org.webrtc;

import org.webrtc.VideoFrame.I420Buffer;

final /* synthetic */ class JavaI420Buffer$$Lambda$2 implements Runnable {
    private final I420Buffer arg$1;

    private JavaI420Buffer$$Lambda$2(I420Buffer i420Buffer) {
        this.arg$1 = i420Buffer;
    }

    static Runnable get$Lambda(I420Buffer i420Buffer) {
        return new JavaI420Buffer$$Lambda$2(i420Buffer);
    }

    public final void run() {
        this.arg$1.release();
    }
}
