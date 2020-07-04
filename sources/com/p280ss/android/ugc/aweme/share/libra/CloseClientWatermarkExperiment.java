package com.p280ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "close_client_watermark")
/* renamed from: com.ss.android.ugc.aweme.share.libra.CloseClientWatermarkExperiment */
public final class CloseClientWatermarkExperiment {
    @C6382b(mo15285a = true)
    private static final int DISABLED = 0;
    @C6382b
    private static final int ENABLED = 1;
    public static final CloseClientWatermarkExperiment INSTANCE = new CloseClientWatermarkExperiment();

    private CloseClientWatermarkExperiment() {
    }

    public final int getDISABLED() {
        return DISABLED;
    }

    public final int getENABLED() {
        return ENABLED;
    }

    public final boolean closed() {
        if (C6384b.m19835a().mo15287a(CloseClientWatermarkExperiment.class, true, "close_client_watermark", C6384b.m19835a().mo15295d().close_client_watermark, 0) == ENABLED) {
            return true;
        }
        return false;
    }
}
