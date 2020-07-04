package org.webrtc;

import java.nio.ByteBuffer;

final /* synthetic */ class JavaI420Buffer$$Lambda$0 implements Runnable {
    private final ByteBuffer arg$1;

    JavaI420Buffer$$Lambda$0(ByteBuffer byteBuffer) {
        this.arg$1 = byteBuffer;
    }

    public final void run() {
        JniCommon.nativeFreeByteBuffer(this.arg$1);
    }
}
