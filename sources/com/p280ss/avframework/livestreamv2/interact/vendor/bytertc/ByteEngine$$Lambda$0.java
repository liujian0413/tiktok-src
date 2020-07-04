package com.p280ss.avframework.livestreamv2.interact.vendor.bytertc;

import com.p280ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoClient.ByteVideoCallback;
import com.p280ss.video.rtc.engine.utils.ExtVideoFrame;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteEngine$$Lambda$0 */
final /* synthetic */ class ByteEngine$$Lambda$0 implements ByteVideoCallback {
    private final ByteEngine arg$1;

    ByteEngine$$Lambda$0(ByteEngine byteEngine) {
        this.arg$1 = byteEngine;
    }

    public final boolean updateVideoFrame(ExtVideoFrame extVideoFrame) {
        return this.arg$1.lambda$start$0$ByteEngine(extVideoFrame);
    }
}
