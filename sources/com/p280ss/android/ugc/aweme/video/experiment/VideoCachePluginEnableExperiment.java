package com.p280ss.android.ugc.aweme.video.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "enable_videocache_plugin")
/* renamed from: com.ss.android.ugc.aweme.video.experiment.VideoCachePluginEnableExperiment */
public final class VideoCachePluginEnableExperiment {
    @C6382b
    private static final boolean DISABLE = false;
    @C6382b(mo15285a = true)
    private static final boolean ENABLE = true;
    public static final VideoCachePluginEnableExperiment INSTANCE = new VideoCachePluginEnableExperiment();

    private VideoCachePluginEnableExperiment() {
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
