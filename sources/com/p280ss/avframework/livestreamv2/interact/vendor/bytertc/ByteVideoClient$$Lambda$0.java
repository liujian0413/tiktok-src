package com.p280ss.avframework.livestreamv2.interact.vendor.bytertc;

import com.p280ss.avframework.livestreamv2.interact.video.VideoCallback;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoClient$$Lambda$0 */
final /* synthetic */ class ByteVideoClient$$Lambda$0 implements VideoCallback {
    private final ByteVideoClient arg$1;

    ByteVideoClient$$Lambda$0(ByteVideoClient byteVideoClient) {
        this.arg$1 = byteVideoClient;
    }

    public final boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
        return this.arg$1.lambda$prepare$0$ByteVideoClient(eGLContext, eGLContext2, i, i2, i3, j);
    }
}
