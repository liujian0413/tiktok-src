package com.p280ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "enable_network_monitor")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.DetectorEnableExperiment */
public final class DetectorEnableExperiment {
    @C6382b(mo15285a = true)
    private static final boolean DISABLE = false;
    @C6382b
    private static final boolean ENABLE = true;
    public static final DetectorEnableExperiment INSTANCE = new DetectorEnableExperiment();
    private static boolean enableDetector;

    private DetectorEnableExperiment() {
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
        if (C6384b.m19835a().mo15292a(DetectorEnableExperiment.class, true, "enable_network_monitor", C6384b.m19835a().mo15295d().enable_network_monitor, false) != ENABLE) {
            z = false;
        }
        enableDetector = z;
    }

    public final void setEnableDetector(boolean z) {
        enableDetector = z;
    }
}
