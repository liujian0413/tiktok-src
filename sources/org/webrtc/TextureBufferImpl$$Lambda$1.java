package org.webrtc;

final /* synthetic */ class TextureBufferImpl$$Lambda$1 implements Runnable {
    private final TextureBufferImpl arg$1;

    TextureBufferImpl$$Lambda$1(TextureBufferImpl textureBufferImpl) {
        this.arg$1 = textureBufferImpl;
    }

    public final void run() {
        this.arg$1.release();
    }
}
