package com.p280ss.avframework.livestreamv2.core;

import com.p280ss.avframework.livestreamv2.interact.engine.Engine;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Vendor;

/* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl$ClientFactory$$Lambda$0 */
final /* synthetic */ class LiveCoreImpl$ClientFactory$$Lambda$0 implements Runnable {
    static final Runnable $instance = new LiveCoreImpl$ClientFactory$$Lambda$0();

    private LiveCoreImpl$ClientFactory$$Lambda$0() {
    }

    public final void run() {
        Engine.releaseRtcEngineResource(Vendor.BYTE);
    }
}
