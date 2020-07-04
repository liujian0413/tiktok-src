package com.p280ss.avframework.livestreamv2.interact.vendor.zego;

import com.p280ss.avframework.livestreamv2.interact.video.VideoCallback;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoVideoClient$$Lambda$0 */
final /* synthetic */ class ZegoVideoClient$$Lambda$0 implements VideoCallback {
    private final ZegoVideoClient arg$1;

    ZegoVideoClient$$Lambda$0(ZegoVideoClient zegoVideoClient) {
        this.arg$1 = zegoVideoClient;
    }

    public final boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
        return this.arg$1.lambda$allocateAndStart$0$ZegoVideoClient(eGLContext, eGLContext2, i, i2, i3, j);
    }
}
