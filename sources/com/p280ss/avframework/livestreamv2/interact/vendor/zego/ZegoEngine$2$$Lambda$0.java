package com.p280ss.avframework.livestreamv2.interact.vendor.zego;

import com.p280ss.avframework.livestreamv2.interact.vendor.zego.ZegoVideoClient.ZegoVideoCallback;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoEngine$2$$Lambda$0 */
final /* synthetic */ class ZegoEngine$2$$Lambda$0 implements ZegoVideoCallback {
    private final C457322 arg$1;

    ZegoEngine$2$$Lambda$0(C457322 r1) {
        this.arg$1 = r1;
    }

    public final void onVideoFrameRenderSuccess() {
        this.arg$1.lambda$create$0$ZegoEngine$2();
    }
}
