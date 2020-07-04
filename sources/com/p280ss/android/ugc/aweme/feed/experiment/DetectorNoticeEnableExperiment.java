package com.p280ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "enable_network_notice")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.DetectorNoticeEnableExperiment */
public final class DetectorNoticeEnableExperiment {
    @C6382b(mo15285a = true)
    private static final boolean DISABLE = false;
    @C6382b
    private static final boolean ENABLE = true;
    public static final DetectorNoticeEnableExperiment INSTANCE = new DetectorNoticeEnableExperiment();
    private static boolean enableDetector;

    private DetectorNoticeEnableExperiment() {
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }

    public final boolean getEnableDetector() {
        return enableDetector;
    }

    static {
        boolean z = true;
        if (C6384b.m19835a().mo15292a(DetectorNoticeEnableExperiment.class, true, "enable_network_notice", C6384b.m19835a().mo15295d().enable_network_notice, false) != ENABLE) {
            z = false;
        }
        enableDetector = z;
    }

    public final void setEnableDetector(boolean z) {
        enableDetector = z;
    }
}
